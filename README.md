# spring-inversao-controle
.
<div align="right"><small>Washington Santiago, silva2xx5@yahoo.com.br</small></div> 

Um exerc�cio de invers�o de controle em Java 11, usando spring-context e spring-test.<br/>

Temos uma interface, uma implementa��o da interface, um bean configuration e um teste da implementa��o. O Projeto demonstra a inje��o de depend�ncia com invers�o de controle no Spring.<br/>

Anota��es utilizadas:<br/>
@Configuration<br/>
@Bean<br/>
@Override<br/>
@RunWith<br/>
@ContextConfiguration<br/>
@Autowired<br/>
@Test<br/>

<br/><br/>
<b>Descri��o das classes:</b><br/><br/>




<b>Classe: BeanConfiguration</b><br/>
A anota��o @Configuration estimula o Spring a escanear esta classe de configura��o.<br/>
A anota��o @Bean for�a a inclus�o do bean no container/context.<br/>
Notamos que o return devolve new objeto, implementa��o da interface, o que resolve o @Autowired na classe de testes, e tamb�m pode resolver em um poss�vel controller, por exemplo.<br/><br/>


<b>Classe: IncrementadorImpl</b><br/>
Esta classe implementa a interface, sobrescrevendo o m�todo #incrementa.<br/><br/>


<b>Classe: Incrementador</b><br/>
Esta � a interface. Um Port na arquitetura hexagonal e arquitetura limpa, por exemplo.<br/><br/>


<b>Classe: IncrementadorTest</b><br/>
Classe de teste. Poderia ser um controller em uma API Spring Boot.<br/>
A anota��o @Autowired injeta o Bean configurado na classe BeanConfiguration.<br/>
Note que injetamos a interface, e spring traz uma inst�ncia da implementa��o, conforme o configuration.<br/>
As anota��es @RunWith(SpringJUnit4ClassRunner.class) e @ContextConfiguration(classes=BeanConfiguration.class) dizem ao spring para rodar os testes com o SpringJunit class, ao inv�s de Junit puro.<br/>
As duas anota��es s�o exigidas para que @Autowired surta efeito, e evite um NullPointerException na execu��o do teste.<br/><br/><br/><br/>




<b>Refer�ncias</b><br/>

@Configuration<br/>
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html<br/><br/>
	
@Bean<br/>
https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s02.html<br/><br/>

@RunWith<br/>
@ContextConfiguration<br/>
https://stackoverflow.com/questions/33433869/spring-with-junit-testing-and-dependency-injection-does-not-work<br/><br/>
	
@Autowired<br/>
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html<br/>
	
@Test<br/>
https://junit.org/junit4/javadoc/4.12/org/junit/Test.html<br/>