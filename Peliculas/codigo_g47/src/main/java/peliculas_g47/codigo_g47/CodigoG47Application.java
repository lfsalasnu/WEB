package peliculas_g47.codigo_g47;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import peliculas_g47.codigo_g47.Model.Usuarios;
import peliculas_g47.codigo_g47.Repository.Usuario_repo;

@RestController
@SpringBootApplication
public class CodigoG47Application {

	@Autowired
	private Usuario_repo urp;

	public static void main(String[] args) {
		SpringApplication.run(CodigoG47Application.class, args);
	}

	@RequestMapping("/usuario")
    public String comprobar(@ModelAttribute(name="usuario") String usuario, String cont){
        //String usr=usuarios.getUsuario();
        Optional<Usuarios> u=urp.findById(usuario);
        Usuarios us;
		//String contras=null;
		try {
			us=u.get();
			//contras=us.getCont();
		} catch (Exception e) {
			// TODO: handle exception
			us=new Usuarios();
			
		}

		//return u;
        if(us.getUsuario()==null){
            //Usuario no existe
            return "error_usuario";
        }
        else{
			String contras=us.getCont();
            //String cont= usuarios.getCont();
			if (cont.equals(contras)){
                return contras+"sql";
            }
            else{
                //contrasena invalida
                return cont+"digitada";
            }
        }
        //return "mi_cuenta{usr}";

    }

}
