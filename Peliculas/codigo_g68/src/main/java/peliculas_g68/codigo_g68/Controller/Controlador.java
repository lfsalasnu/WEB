package peliculas_g68.codigo_g68.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import peliculas_g68.codigo_g68.Model.Entidad1;
import peliculas_g68.codigo_g68.Model.Usuarios;
import peliculas_g68.codigo_g68.Repository.Entidad1_repo;
import peliculas_g68.codigo_g68.Repository.Usuarios_repo;

@Controller
public class Controlador {
    
    @Autowired
    private Entidad1_repo rp;

    @Autowired
    private Usuarios_repo urp;

    @GetMapping("/index")
    public String index(Model modelo){//, @Param("pal_buscar") String pal_buscar
        List<Entidad1> lista_peliculas=rp.findAll();
        //List<Entidad1> lista_peliculas= rp.findAll("la");
        modelo.addAttribute("lista_peliculas",lista_peliculas);
        
        return "index";
    }

    @GetMapping("/nuevo")
    public String nuevo(){
        return "nuevo";
    }

    @RequestMapping(value="/guardar", method=RequestMethod.POST)
    public String guardar(@ModelAttribute("Entidad1") Entidad1 peliculas){
        rp.save(peliculas);
        return "redirect:/index";
    }

    @RequestMapping("/{id}")
    public ModelAndView editar(@PathVariable(name="id") int id){
        ModelAndView modelo=new ModelAndView("editar");
        Entidad1 pelicula=rp.getReferenceById(id);
        modelo.addObject("pelicula", pelicula);
        return modelo;
    }

    //crear el metodo de eliminar pelicula 
    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(name="id") int id){
        rp.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    //Con bootstrap crear una vista de login en la aplicación

    @RequestMapping("/inicio_sesion")
    public ModelAndView inicio_sesion(@ModelAttribute(name="usuario") String usuario,String cont){
        var u=urp.findById(usuario);
        Usuarios us;
        ModelAndView modelo;
        try {
            us=u.get();
        } catch (Exception e) {
            // TODO: handle exception
            us=new Usuarios();
        }

        if(us.getUsuario()==null){
            //error
            modelo=new ModelAndView("error_usuario");
            //return "redirect:/error_usuario";
        }
        else if(cont.equals(us.getCont())){
            // vista usuario
            modelo=new ModelAndView("vista_usuario");
            modelo.addObject("usuario", us);
            //return "redirect:/vista_usuario";
        }
        else{
            //error
            modelo=new ModelAndView("error_usuario");
            //return "redirect:/error_usuario";
        }
        return modelo;
    }

}
