package peliculas_g68.codigo_g68.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import peliculas_g68.codigo_g68.Model.Entidad1;
import peliculas_g68.codigo_g68.Repository.Entidad1_repo;
import peliculas_g68.codigo_g68.Repository.Usuarios_repo;

@Service
public class Usuario_serv {
    
    @Autowired
    private Entidad1_repo erp;

    public List<Entidad1> ListAll(String pal_buscar){
        return erp.findAll();
    }
}
