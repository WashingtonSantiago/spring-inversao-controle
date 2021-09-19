package br.com.project.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.project.config.BeanConfiguration;
import br.com.project.interfaces.Incrementador;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BeanConfiguration.class)
public class IncrementadorTest {
	
	@Autowired
	Incrementador incrementador;
	
	@Test
	public void deveIncrementar() {
		
		System.out.println("Iniciando teste");
		int  resultado = incrementador.incrementa(1);
		System.out.println("Resultado: " + resultado);
		
		assertEquals(resultado, 2);
	}

}
