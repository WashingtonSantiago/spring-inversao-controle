package br.com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.project.impl.IncrementadorImpl;
import br.com.project.interfaces.Incrementador;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Incrementador incrementador() {
		System.out.println("Adicionando Bean ao container");
		return new IncrementadorImpl();
	}

}
