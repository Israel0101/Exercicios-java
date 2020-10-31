package com.spring2.spring2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/spring2")
public class Spring2Controller {
	
	@GetMapping
	public String spring() {
		return "Meus objetivos de aprendizagem é manter a persistência sempre, para aprimorar meus conhecimentos. E também tentar absorver cada detalhe do que se foi passado";
	}

}
