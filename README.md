# spring-inversao-controle

<div align="right"><small>Washington Santiago, silva2xx5@yahoo.com.br</small></div> 

Um exercício de inversão de controle em Java 11, usando spring-context e spring-test.<br/>

Temos uma interface, uma implementação da interface, um bean configuration e um teste da implementação. O Projeto demonstra a injeção de dependência com inversão de controle no Spring.<br/>

Anotações utilizadas:<br/>
@Configuration<br/>
@Bean<br/>
@Override<br/>
@RunWith<br/>
@ContextConfiguration<br/>
@Autowired<br/>
@Test<br/>

<br/><br/>
<b>Descrição das classes:</b><br/><br/>




<b>Classe: BeanConfiguration</b><br/>
A anotação @Configuration estimula o Spring a escanear esta classe de configuração.<br/>
A anotação @Bean força a inclusão do bean no container/context.<br/>
Notamos que o return devolve new objeto, implementação da interface, o que resolve o @Autowired na classe de testes, e também pode resolver em um possível controller, por exemplo.<br/><br/>


<b>Classe: IncrementadorImpl</b><br/>
Esta classe implementa a interface, sobrescrevendo o método #incrementa.<br/><br/>


<b>Classe: Incrementador</b><br/>
Esta é a interface. Um Port na arquitetura hexagonal e arquitetura limpa, por exemplo.<br/><br/>


<b>Classe: IncrementadorTest</b><br/>
Classe de teste. Poderia ser um controller em uma API Spring Boot.<br/>
A anotação @Autowired injeta o Bean configurado na classe BeanConfiguration.<br/>
Note que injetamos a interface, e spring traz uma instância da implementação, conforme o configuration.<br/>
As anotações @RunWith(SpringJUnit4ClassRunner.class) e @ContextConfiguration(classes=BeanConfiguration.class) dizem ao spring para rodar os testes com o SpringJunit class, ao invés de Junit puro.<br/>
As duas anotações são exigidas para que @Autowired surta efeito, e evite um NullPointerException na execução do teste.<br/><br/><br/><br/>




<b>Referências</b><br/>

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