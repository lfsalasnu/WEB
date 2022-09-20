package peliculas_g36.codigo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import peliculas_g36.codigo.Model.Peliculas;

@Repository
public interface Peliculas_repo  extends JpaRepository<Peliculas,Integer>{
    
}
