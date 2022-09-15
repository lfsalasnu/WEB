package g68.codigo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import g68.codigo.Model.Entidad1;
import g68.codigo.Repositorios.Entidad1_repo;

@SpringBootApplication
@RestController
public class CodigoApplication {
	
	@Autowired
	private Entidad1_repo rp;
	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
	}

	@GetMapping("/hola")
	public List<Entidad1> hola(@RequestParam(value = "name",defaultValue = "Mundo") String name){
		return rp.findAll();
	}

	@GetMapping("/consulta")
	public Optional<Entidad1> consulta(@RequestParam(value = "id",defaultValue = "1") int id){
		return rp.findById(id);
	}
	@GetMapping("/borrar")
	public void prueba(@RequestParam(value = "id",defaultValue = "1") int id){
		rp.deleteById(id);
		//return null;
	}
	@GetMapping("/agregar")
	public List<Entidad1> agregar(@RequestParam(value = "id",defaultValue = "1") int id, String nombre){
		var ent=new Entidad1();
		ent.setId(id);
		ent.setNombre(nombre);
		rp.save(ent);
		return rp.findAll();
	}
}
