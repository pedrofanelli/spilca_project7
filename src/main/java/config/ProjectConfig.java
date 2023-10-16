package config;

import org.example.spilca_project7.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.example.spilca_project7")
public class ProjectConfig {

	@Bean
	Parrot loro1() {
		Parrot p = new Parrot();
		return p;
	}
	
	@Bean
	Parrot loro2() {
		Parrot p = new Parrot();
		p.setName("Ricardo");
		return p;
	}
	
}
