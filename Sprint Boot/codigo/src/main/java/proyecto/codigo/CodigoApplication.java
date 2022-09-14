package proyecto.codigo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import proyecto.codigo.Entidades.Entidad1;
// import proyecto.codigo.Repositories.Entidad1_repo;

@SpringBootApplication
public class CodigoApplication {

	// @Autowired
	// private static Entidad1_repo ent;
	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
		// var Entidad= new Entidad1();
		// Entidad.setId(1);
		// Entidad.setNombre("Luis");
		// ent.save(Entidad);
	}

}
