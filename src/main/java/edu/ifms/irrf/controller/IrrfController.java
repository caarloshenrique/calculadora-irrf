package edu.ifms.irrf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import edu.ifms.irrf.model.Trabalhador;


@Controller
public class IrrfController {

	@GetMapping("/")
	public String exibirFormulario(Model model) {
		Trabalhador trabalhador = new Trabalhador();
		
		model.addAttribute("trabalhador", trabalhador);
		
		return "formtrabalhador";
	}
	
	@GetMapping("/irrf")
	public String exibirImposto(@ModelAttribute Trabalhador trabalhador) {
		return "imposto";
	}
}