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
@RequestMapping("/descuento")
public class DescuentoController {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ValorService valorService;
	
	@Autowired
	private TipoMonedaService tipoMonedaService;
	
	@GetMapping
	public String descuento(Model model,@ModelAttribute("valor") Valor valor) {
		try {
			List<TipoMoneda> monedas= tipoMonedaService.getAll();
			List<Valor> valores = valorService.getAll();
			model.addAttribute("valores", valores);
			model.addAttribute("clientes",clienteService.listClientes());
			model.addAttribute("monedas", monedas);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "Descuentos";
	}
}
