package peliculas_g47.codigo_g47.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import peliculas_g47.codigo_g47.Model.Peliculas;

@Repository
public interface Peliculas_repo extends JpaRepository<Peliculas,Integer>{
    
}
