package g27.codigo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import g27.codigo.Model.Entidad1;
import g27.codigo.Repositorios.Entidad1_repo;

@Controller
public class Controlador {
    
    @Autowired
    private Entidad1_repo rp;

    @GetMapping("/Index")
    public String ind(){
        return "Index";
    } 

    @GetMapping("/Flora")
    public String flora(){
        return "Flora";
    } 

    @GetMapping("/Fauna")
    public String fauna(){
        return "Fauna";
    }
    
    @GetMapping("/Login")
    public String login(){
        var ent=new Entidad1();
        ent.setId(2);
        ent.setNombre("Maria");
        rp.save(ent);
        return "Login";
    }

    
}
