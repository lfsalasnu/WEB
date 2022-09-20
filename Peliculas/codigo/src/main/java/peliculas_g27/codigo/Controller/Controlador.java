package peliculas_g27.codigo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import peliculas_g27.codigo.Model.Peliculas;
import peliculas_g27.codigo.Repositories.Peliculas_repo;

@Controller
public class Controlador {
    
    @Autowired
    private Peliculas_repo prp;

    @GetMapping("/index")
    public String index(Model modelo){
        List<Peliculas> lista_peliculas=prp.findAll();
        modelo.addAttribute("lista_peliculas", lista_peliculas);
        return "index";
    }


    @RequestMapping(value="/guardar",method = RequestMethod.POST)
    public String guardar(@ModelAttribute("peliculas") Peliculas peliculas){
        prp.save(peliculas);
        return "redirect:/index";
    }

    @GetMapping("/nuevo")
    public String nuevo(){
        return "nuevo";
    }

    @RequestMapping("/pelicula/{id}")
    public ModelAndView mostrar_editar(@PathVariable(name="id") int id){
        ModelAndView modelo=new ModelAndView("Editar_pelicula");
        Peliculas pelicula=prp.getReferenceById(id);
        modelo.addObject("pelicula", pelicula);

        return modelo;
    }
    
}
