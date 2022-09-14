package proyecto.codigo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.codigo.Entidades.Entidad1;

@Repository
public interface Entidad1_repo extends JpaRepository<Entidad1,Integer>{
    
}
