package peliculas_g68.codigo_g68.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import peliculas_g68.codigo_g68.Model.Usuarios;

@Repository
public interface Usuarios_repo extends JpaRepository<Usuarios,String>{
    
}
