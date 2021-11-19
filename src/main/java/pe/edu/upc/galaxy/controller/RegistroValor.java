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
@RequestMapping("/registro")
@SessionAttributes("{valor}")
public class RegistroValor {
	@Autowired
	private ValorService valorService;

	@GetMapping
	public String list(Model model) {
		try {
			List<Valor> valores = valorService.getAll();
			model.addAttribute("valor", valores);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "registro/newValor";
	}

	@GetMapping("newValor")
	public String newValor(Model model) {
		try {
			model.addAttribute("valor",new Valor());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		return "registro/Registro_valores.html";
	}

	@PostMapping("saveValor")
	public String saveValor(Model model, @Valid @ModelAttribute("valor") Valor valor
			,BindingResult result) {
		if (result.hasErrors()) {
		}

		try {
			Valor valorSaved = valorService.create(valor);
			model.addAttribute("valor", valorSaved);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		return "redirect:/registro/newValor";
	}

}
