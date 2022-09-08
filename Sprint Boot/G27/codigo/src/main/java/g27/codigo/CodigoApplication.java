package g27.codigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
	}

	@GetMapping("/hola")
	String hola(@RequestParam(value = "name", defaultValue = "Mundo") String name){
		return ("Hola " + name );
	}

}