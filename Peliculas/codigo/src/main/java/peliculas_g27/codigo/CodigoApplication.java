package peliculas_g27.codigo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import peliculas_g27.codigo.Model.Peliculas;
import peliculas_g27.codigo.Repositories.Peliculas_repo;

@SpringBootApplication
@RestController
public class CodigoApplication {

	@Autowired
	private Peliculas_repo srp;
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

	

}
