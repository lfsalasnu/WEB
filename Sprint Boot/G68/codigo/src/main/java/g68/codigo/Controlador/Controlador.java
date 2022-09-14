package g68.codigo.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import g68.codigo.Model.Entidad1;
import g68.codigo.Repositorios.Entidad1_repo;

@Controller
public class Controlador {
    
    @Autowired
    private Entidad1_repo rp;

    @GetMapping("/Index")
    public String index(){
        return "Index";
    }

    @GetMapping("/Animales")
    public String animales(){
        return "Animales";
    }

    @GetMapping("/Parques")
    public String parques(){
        return "Parques";
    }

    @GetMapping("/Login")
    public String login(){
        var ent1=new Entidad1();
        ent1.setId(1);
        ent1.setNombre("Luis");
        rp.save(ent1);
        return "Login";
    }
}
