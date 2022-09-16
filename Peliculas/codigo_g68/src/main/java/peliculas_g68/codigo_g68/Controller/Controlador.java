package peliculas_g68.codigo_g68.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import peliculas_g68.codigo_g68.Model.Entidad1;
import peliculas_g68.codigo_g68.Repository.Entidad1_repo;

@Controller
public class Controlador {
    
    @Autowired
    private Entidad1_repo rp;

    @GetMapping("/index")
    public String index(Model modelo){
        List<Entidad1> lista_peliculas=rp.findAll();
        modelo.addAttribute("lista_peliculas",lista_peliculas);
        return "index";
    }

    @GetMapping("/Nuevo")
    public String nuevo(){
        return "Nuevo";
    }

    @RequestMapping(value="/guargar", method=RequestMethod.POST)
    public String guardar(@ModelAttribute("Entidad1") Model modelo){
        // Entidad1 peliculas= new Entidad1();
        // modelo.addAttribute("peliculas",peliculas);
        return "Nuevo";
    }
}
