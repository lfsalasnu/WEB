package peliculas_g36.codigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import peliculas_g36.codigo.Model.Usuario;
import peliculas_g36.codigo.Repository.Usuario_repo;

@SpringBootApplication
@RestController
public class CodigoApplication {

	@Autowired
	private Usuario_repo urp; 
	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
	}

	
        
            
        // }
        // else{
        //     return "error";
        // }
        

    

}
