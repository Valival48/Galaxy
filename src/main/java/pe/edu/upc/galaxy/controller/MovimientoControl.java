package pe.edu.upc.galaxy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.galaxy.business.ClienteService;
import pe.edu.upc.galaxy.entity.Valor;

@Controller
@RequestMapping("/movimiento")
public class MovimientoControl {

	@Autowired
	private ClienteService clienteService;
	
	public String newValor(Model model, @ModelAttribute("valor") Valor valor) {
		try {
			
			model.addAttribute("clientes",clienteService.listClientes());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		return "Movimiento_comitentes";
	}
}
