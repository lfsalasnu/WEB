package peliculas_g27.codigo;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import peliculas_g27.codigo.Model.Peliculas;
import peliculas_g27.codigo.Model.Usuarios;
import peliculas_g27.codigo.Repositories.Peliculas_repo;
import peliculas_g27.codigo.Repositories.Usuarios_repo;

@SpringBootApplication
@RestController
public class CodigoApplication {

	@Autowired
	private Peliculas_repo srp;

	@Autowired
	private Usuarios_repo urp;
	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
	}
	//Descargar postman
	//Crear una consulta en java que busque el id en sql
	//Enviar el id con postman
	@GetMapping("/datos")
	public List<Peliculas> datos(){

		return srp.findAll();
	}

	@GetMapping("/consulta")
	public Optional<Peliculas> consulta(int id){
		return srp.findById(id);
	}

	@RequestMapping("/inicio_sesion")
    public Optional<Usuarios> inicio_sesion(@ModelAttribute("usuario") Usuarios usr){
        String id= usr.getId();
        //Usuarios idg=urp.findById(id);
        return urp.findById(id);
		// if (id.equals(idg)){
        //     return urp.getReferenceById(id);
        // }
        // else{
        //     return null;
        // }
        
    }


	

}
