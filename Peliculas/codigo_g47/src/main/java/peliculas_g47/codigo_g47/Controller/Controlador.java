package peliculas_g47.codigo_g47.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import peliculas_g47.codigo_g47.Model.Peliculas;
import peliculas_g47.codigo_g47.Repository.Peliculas_repo;

@Controller
public class Controlador {
    @Autowired
    private Peliculas_repo prp;
    
    @GetMapping("/index")
    public String index(Model modelo){
        List<Peliculas> lista_peliculas= prp.findAll();
        modelo.addAttribute("lista_peliculas", lista_peliculas);
        return "index";
    }

    
}
