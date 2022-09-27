package peliculas_g36.codigo.Controller;

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

import peliculas_g36.codigo.Model.Peliculas;
import peliculas_g36.codigo.Model.Usuario;
import peliculas_g36.codigo.Repository.Peliculas_repo;
import peliculas_g36.codigo.Repository.Usuario_repo;

@Controller
public class Controlador {
    
    @Autowired
    private Peliculas_repo prp;

    @Autowired
    private Usuario_repo urp;


    @GetMapping("/index")
    public String inicio(Model modelo){
        List<Peliculas> lista_peliculas= prp.findAll();
        modelo.addAttribute("lista_peliculas",lista_peliculas);
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

    @GetMapping("/{id}")
    public ModelAndView editar(@PathVariable(name="id") int id){
        ModelAndView modelo=new ModelAndView("editar");

        Peliculas peliculas=prp.getReferenceById(id);
        modelo.addObject("peliculas", peliculas);
        return modelo;
    }

    //programar la función de borrar en la aplicación web

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(name="id") int id){
        prp.deleteById(id);
        return "redirect:/index";

    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/inicio_sesion")
    public ModelAndView inicio_sesion(@ModelAttribute("usuarios") Usuario usuario){
        String id=usuario.getUsuario();
        ModelAndView modelo;
		Usuario idg=urp.getReferenceById(id);
		
        if( id==idg.getUsuario()){
            String cont1=usuario.getCont();
			if(cont1.equals(idg.getCont())){
                modelo=new ModelAndView("vista_usuario");
                modelo.addObject("usr", idg);
                return modelo;
                
                //return "vista_usuario";
            }
            else{
                modelo=new ModelAndView("error");
                modelo.addObject("usr", usuario);
                return modelo;
                //return "error";
            }
		}
		else{
			modelo=new ModelAndView("error");
            modelo.addObject("usr", usuario);
            return modelo;
            //return "error";
		}

        //return modelo;
    }

    @RequestMapping(value="/guardar_usuario",method = RequestMethod.POST)
    public String guardar_usuario(@ModelAttribute("usuario") Usuario usuario){
        urp.save(usuario);
        return "redirect:/index";
    }

    
}
