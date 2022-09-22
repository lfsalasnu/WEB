package peliculas_g27.codigo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import peliculas_g27.codigo.Model.Usuarios;

@Repository
public interface Usuarios_repo extends JpaRepository<Usuarios,String>{
    
}
