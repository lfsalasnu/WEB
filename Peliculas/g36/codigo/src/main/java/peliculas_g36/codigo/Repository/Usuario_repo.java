package peliculas_g36.codigo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import peliculas_g36.codigo.Model.Usuario;

@Repository
public interface Usuario_repo extends JpaRepository<Usuario,String>{
    
}
