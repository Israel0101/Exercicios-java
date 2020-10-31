package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Habilidades e mentalidades utilizadas: Persistência, Responsabilidade pessoal, Comunicação, Atenção aos Detalhes e Proatividade";
	}

}
