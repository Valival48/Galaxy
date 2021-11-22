package pe.edu.upc.galaxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.galaxy.business.ClienteService;
import pe.edu.upc.galaxy.business.TipoMonedaService;
import pe.edu.upc.galaxy.business.ValorService;
import pe.edu.upc.galaxy.entity.TipoMoneda;
import pe.edu.upc.galaxy.entity.Valor;

@Controller
@RequestMapping("/cartera")
@SessionAttributes("{valor}")
public class CarteraController {
	@Autowired
	private ValorService valorService;
	
	@Autowired
	private TipoMonedaService tipoMonedaService;
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public String list(Model model, @ModelAttribute("valor") Valor valor, @ModelAttribute("valor2") Valor valor2) {
		
		try {
			List<TipoMoneda> monedas= tipoMonedaService.getAll();
			List<Valor> valores = valorService.filterByME();
			List<Valor> valores2 = valorService.filterByMN();
			model.addAttribute("monedas",tipoMonedaService.listAllMoneda());
			model.addAttribute("valores", valores);
			model.addAttribute("valores2", valores2);
			model.addAttribute("monedas", monedas);
			model.addAttribute("clientes",clienteService.listClientes());
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "cartera/Estructura_cartera";
	}
	
	
}
