package grupo47.codigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import grupo47.codigo.DAO.datos_prueba;

@SpringBootApplication
@RestController
public class CodigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
		System.out.println(datos_prueba.getid());
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return String.format("Hola %s!", name);
		}

	

}
