package pe.edu.upc.galaxy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.galaxy.business.ValorService;
import pe.edu.upc.galaxy.entity.Valor;

@Controller
@RequestMapping("registros")
@SessionAttributes("valor")
public class RegistroValor {
	@Autowired
	private ValorService valorService;

	@GetMapping
	public String list(Model model) {
		try {
			List<Valor> valores = valorService.getAll();
			model.addAttribute("valores", valores);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "registros/Registro_Valores";
	}

	@GetMapping("newValor")
	public String nuevo(Model model, @Valid @ModelAttribute("valor") Valor valor) {
		try {
			model.addAttribute("valor", new Valor());

		} catch (Exception e) {
		}

		return "registros/Registro_Valores";
	}

	@PostMapping("saveValor")
	public String guardar(Model model , @ModelAttribute("valor") Valor valor) {
		
		
		try {
			
			Valor valorSaved= valorService.create(valor);
			model.addAttribute("valor", valorSaved);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:Registro_Valores";
	}

}
