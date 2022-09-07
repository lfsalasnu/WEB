package com.example.demo.controlador;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class controlador {
	    
	    @GetMapping("/Inicio")
	    public String Inicio(){
	        return "Inicio";
	    }
	    
	    @GetMapping("/Fauna")
	    public String Fauna(){
	        return "Fauna";
	    }

	
	}


