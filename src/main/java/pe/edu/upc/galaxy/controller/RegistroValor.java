package pe.edu.upc.galaxy.controller;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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

import pe.edu.upc.galaxy.business.ClienteService;
import pe.edu.upc.galaxy.business.TipoMonedaService;
import pe.edu.upc.galaxy.business.ValorService;

import pe.edu.upc.galaxy.entity.TipoMoneda;
import pe.edu.upc.galaxy.entity.Valor;

@Controller
@RequestMapping("/registro")
@SessionAttributes("{valor}")
public class RegistroValor {
	@Autowired
	private ValorService valorService;

	@Autowired
	private TipoMonedaService tipoMonedaService;

	@Autowired
	private ClienteService clienteService;

	@GetMapping("newValor")
	public String newValor(Model model) {
		try {
			List<TipoMoneda> monedas = tipoMonedaService.getAll();
			List<Valor> valores = valorService.getAll();
			/* model.addAttribute("monedas",tipoMonedaService.listAllMoneda()); */
			model.addAttribute("clientes", clienteService.listClientes());
			model.addAttribute("valores", valores);
			model.addAttribute("monedas", monedas);

			model.addAttribute("valor", new Valor());

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		return "registro/Registro_valores.html";
	}

	@PostMapping("saveValor")
	public String saveValor(Model model, @Valid @ModelAttribute("valor") Valor valor, BindingResult result) {

		if (result.hasErrors()) {
		}

		try {
		double val= ((valor.getFechaVencimiento().getTime() - valor.getFechaEmision().getTime())
				/ (1000 * 3600 * 24));
			DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
			separadoresPersonalizados.setDecimalSeparator('.');
			DecimalFormat formato2 = new DecimalFormat("#.##", separadoresPersonalizados);
			Valor valorSaved = new Valor();
		 valor.setDia(Integer.parseInt(formato2.format(val)));
			valorService.create(valor);
			model.addAttribute("valor", valorSaved);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		return "redirect:/registro/newValor";
	}

}
