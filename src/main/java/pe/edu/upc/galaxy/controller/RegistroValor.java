package pe.edu.upc.galaxy.controller;



import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.galaxy.business.TipoMonedaService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upc.galaxy.business.ValorService;

import pe.edu.upc.galaxy.entity.Valor;


@Controller
@RequestMapping("/registro")
public class RegistroValor {
	@Autowired
	private ValorService valorService;
	
	@Autowired
	private TipoMonedaService tipoMonedaService;

	@GetMapping("/Registro_valores")
	public ModelAndView valor() {
		ModelAndView reg = new ModelAndView("Registro_valores");
		reg.addObject("valores", valorService.listAllValor());
		reg.addObject("monedas", tipoMonedaService.listAllMoneda());
		reg.addObject("valor", new Valor());
		return reg;
	}

	@PostMapping("/agregarValor")
	public String addValor(@ModelAttribute(name="valores") Valor valor) {
		valorService.addValor(valor);
		return "redirect:/registro/Registro_valores";
	}
	
}
