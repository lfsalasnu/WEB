package peliculas_g27.codigo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import peliculas_g27.codigo.Model.Peliculas;

@Repository
public interface Peliculas_repo extends JpaRepository<Peliculas,Integer>{

    
}
