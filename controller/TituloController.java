package edu.ifmt.cadastrovacinacovid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cadastrovacinacovid.model.Titulo;

@Controller //anotacao controller do Spring  
@RequestMapping("/titulos") // traz o mapeamento /titulos para todo o controller

public class TituloController {
	
	@RequestMapping("/novo") //mapeamento da url
	public String novo() {//método que retorna uma String com o nome da view 
		return "CadastroTitulo";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar (Titulo titulo) {
		TituloRepository.save(titulo); //vem do repository
		return "CadastroTitulo"; //retorno da view
	}
}