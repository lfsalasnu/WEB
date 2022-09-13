package grupo47.codigo.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import grupo47.codigo.Entidades.Entidad1;
import grupo47.codigo.Repositories.Entidad1_repo;

//import grupo47.codigo.DAO.datos_prueba;
//import grupo47.codigo.Repositories.repo;

@Controller
public class Controlador {
    
    @Autowired
    private Entidad1_repo rp;

    @GetMapping("/Inicio")
    public String Inicio(){
        return "Inicio";
    }

    @GetMapping("/Flora")
	public String flora(){
        return "Flora";
    }

    @GetMapping("/Fauna")
	public String fauna(){
        return "Fauna";
    }

    @GetMapping("/Acerca_de")
	public String acerca(){
        return "Acerca_de";
    }

    @GetMapping("/Login")
	public String login(){
        return "Login";
    }

    @GetMapping("/Salir")
	public String salir(){
        var ent=new Entidad1();
        ent.setId(3);
        ent.setNombre("Luisa");
        rp.save(ent);

        return "Salir";
    }
}
