package pe.edu.upc.galaxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PrincipalController {

	@GetMapping
	public String home() {
		return "Estructura_cartera";
	}
	@GetMapping("inicio")
	public String home2() {
		return "Movimiento_comitentes";
	}
	
	@GetMapping("registro")
	public String registro() {
		return "Registro_valores";
	}
	
}
