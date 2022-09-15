package g27.codigo;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import g27.codigo.Model.Entidad1;
import g27.codigo.Repositorios.Entidad1_repo;

@SpringBootApplication
@RestController
public class CodigoApplication {

	@Autowired
	private Entidad1_repo rp;
	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
	}

	@GetMapping("/hola")
	public Optional<Entidad1> hola(){
		return rp.findById(1);
	}

}
