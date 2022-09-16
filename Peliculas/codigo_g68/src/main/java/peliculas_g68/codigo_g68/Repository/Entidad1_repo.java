package peliculas_g68.codigo_g68.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import peliculas_g68.codigo_g68.Model.Entidad1;

@Repository
public interface Entidad1_repo extends JpaRepository<Entidad1,Integer>{
    
}
