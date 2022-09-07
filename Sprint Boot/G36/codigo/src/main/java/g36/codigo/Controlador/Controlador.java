package g36.codigo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    
    @GetMapping("/Inicio")
    public String Inicio(){
        return "Inicio";
    }

    @GetMapping("/Fauna")
    public String Fauna(){
        return "Fauna";
    }
}
