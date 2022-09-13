package g27.codigo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    
    @GetMapping("/Index")
    public String ind(){
        return "Index";
    } 

    @GetMapping("/Flora")
    public String flora(){
        return "Flora";
    } 

    @GetMapping("/Fauna")
    public String fauna(){
        return "Fauna";
    }
    
    @GetMapping("/Login")
    public String login(){
        return "Login";
    }
}
