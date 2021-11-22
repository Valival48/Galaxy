package pe.edu.upc.galaxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.galaxy.business.ClienteService;
import pe.edu.upc.galaxy.business.TipoMonedaService;
import pe.edu.upc.galaxy.business.ValorService;
import pe.edu.upc.galaxy.entity.TipoMoneda;
import pe.edu.upc.galaxy.entity.Valor;

@Controller
@RequestMapping("/")
public class PrincipalController {
	


	@GetMapping
	public String home() {
		return "menu";
	}
	
	@GetMapping("new")
	public String home4() {
		return "menu";
	}
	
	@GetMapping("monto")
	public String monto() {
		return "MontoExtranjero";
	}
	
	
	
}
