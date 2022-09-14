package proyecto.codigo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.codigo.Entidades.Entidad1;
import proyecto.codigo.Repositories.Entidad1_repo;


@Controller
@RestController
public class User_Controller {
    
    @Autowired
	private Entidad1_repo ent;

    @GetMapping("/hola")
    public String hola(){
        var Entidad= new Entidad1();
		Entidad.setId(3);
		Entidad.setNombre("Luis");
		ent.save(Entidad);

        //////
        //var f=ent.findAll();
        //System.out.println(f);
        
        return "Hola Mundo";
    }

    @GetMapping("/consulta")
    public List<Entidad1> listar(){
        return ent.findAll();
    }
}
