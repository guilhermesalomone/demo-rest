package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Generated;

@RequestMapping("/api")
@RestController
public class DemoRest {


	@GetMapping
	public Object teste() {

		final var listaDeQualquerCoisa = List.of("FOI", Map.of("padrao", 1234), 111, 1234D, 1111L, 3333F);

		return listaDeQualquerCoisa;
	}

}
