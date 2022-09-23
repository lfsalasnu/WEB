package peliculas_g68.codigo_g68.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import peliculas_g68.codigo_g68.Model.Entidad1;

@Repository
public interface Entidad1_repo extends JpaRepository<Entidad1,Integer>{
    
    // @Query("SELECT p FROM peliculas p WHERE p.Nombre LIKE %?1%")
    // public List<Entidad1> findAll(String pal_buscar);
}
