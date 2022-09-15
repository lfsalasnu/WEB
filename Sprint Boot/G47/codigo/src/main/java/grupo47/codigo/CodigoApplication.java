package grupo47.codigo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import grupo47.codigo.Entidades.Entidad1;
import grupo47.codigo.Repositories.Entidad1_repo;

@RestController
@SpringBootApplication
public class CodigoApplication {

	@Autowired
	private Entidad1_repo rp;


	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
		//System.out.println(datos_prueba.getid());
	}

	@GetMapping("/hello")
	public List<Entidad1> hello() {
	 	return rp.findAll();
	}

	@GetMapping("/consulta")
	public Optional<Entidad1> consulta(int id){
		return rp.findById(id);
	}


	

}
