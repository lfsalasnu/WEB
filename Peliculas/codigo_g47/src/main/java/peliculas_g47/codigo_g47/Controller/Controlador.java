package peliculas_g47.codigo_g47.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import peliculas_g47.codigo_g47.Model.Peliculas;
import peliculas_g47.codigo_g47.Model.Usuarios;
import peliculas_g47.codigo_g47.Repository.Peliculas_repo;
import peliculas_g47.codigo_g47.Repository.Usuario_repo;

@Controller
public class Controlador {
    @Autowired
    private Peliculas_repo prp;
    
    @Autowired
    private Usuario_repo urp;


    @GetMapping("/index")
    public String index(Model modelo){
        List<Peliculas> lista_peliculas= prp.findAll();
        modelo.addAttribute("lista_peliculas", lista_peliculas);
        return "index";
    }

    @RequestMapping(value="/guardar", method = RequestMethod.POST)
    public String guardar_pelicula(@ModelAttribute("peliculas") Peliculas peliculas){
        prp.save(peliculas);

        return "redirect:/index";
    }

    @GetMapping("/nuevo")
    public String nuevo(){
        return "nuevo";
    }

    @GetMapping("/{id}")
    public ModelAndView editar(@PathVariable(name="id") int id){
        ModelAndView modelo= new ModelAndView("editar");
        Peliculas peliculas=prp.getReferenceById(id);
        modelo.addObject("peliculas", peliculas);
        return modelo;
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(name="id") int id){
        prp.deleteById(id);
        return "redirect:/index";
    }
    //crear el metodo eliminar en la aplicación web
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    // @RequestMapping("/usuario")
    // public String comprobar(@ModelAttribute(name="usuario") Usuarios usuarios){
    //     String usr=usuarios.getUsuario();
    //     Optional<Usuarios> u=urp.findById(usr);
        
    //     if(u==null){
    //         //Usuario no existe
    //         return "error_usuario";
    //     }
    //     else{
    //         if (u.get().getCont()==usuarios.getCont()){
    //             return "vista_usuario";
    //         }
    //         else{
    //             //contrasena invalida
    //             return "error_usuario";
    //         }
    //     }
    //     //return "mi_cuenta{usr}";

    // }

    
    //crear un metodo que con getmapping para abrir la creación de
    //un nuevo usuario y ejecuar el codigo para guardar en la base
    //de datos
}
