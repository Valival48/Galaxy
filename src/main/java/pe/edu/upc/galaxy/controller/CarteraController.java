package pe.edu.upc.galaxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.galaxy.business.CarteraService;
import pe.edu.upc.galaxy.business.TipoMonedaService;
import pe.edu.upc.galaxy.business.ValorService;
import pe.edu.upc.galaxy.entity.Valor;

@Controller
@RequestMapping("/cartera")
@SessionAttributes("{valor}")
public class CarteraController {
	@Autowired
	private ValorService valorService;
	
	@Autowired
	private CarteraService carteraService;
	
	@Autowired
	private TipoMonedaService tipoMonedaService;
	
	@GetMapping
	public String list(Model model) {
		
		try {
			List<Valor> valores = valorService.getAll();
			model.addAttribute("valores", valores);
			model.addAttribute("monedas",tipoMonedaService.listAllMoneda());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "cartera/Estructura_cartera";
	}
	
	
}
