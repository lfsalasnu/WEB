package g68.codigo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import g68.codigo.Model.Entidad1;

@Repository
public interface Entidad1_repo extends JpaRepository<Entidad1,Integer>{
    
}
