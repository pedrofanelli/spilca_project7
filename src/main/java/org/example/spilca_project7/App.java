package org.example.spilca_project7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

/**
 * 3.2 AUTOWIRED: using stereotype annotation!
 * There are 3 different ways:
 * 1) Using @Autowired to inject the values through the class fields
 * 2) Using @Autowired to inject the values through the constructor
 * 3) Using dependency injection through the setter
 * 
 * If we want to inject an specific bean we can use @Primary or @Qualifier annotation together with the name of the parameter in the constructor
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	
    	Person person = context.getBean(Person.class);
    	
    	System.out.println(person.getMascota());
    	
    	context.close();
    }
}
