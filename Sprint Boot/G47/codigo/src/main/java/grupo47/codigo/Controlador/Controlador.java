package grupo47.codigo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    
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
        return "Salir";
    }
}
