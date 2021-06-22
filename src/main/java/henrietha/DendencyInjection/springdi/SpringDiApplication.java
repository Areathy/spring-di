package henrietha.DendencyInjection.springdi;

/**
 *Created on 20 June 2021
 * @author henrietha
 */

import henrietha.DendencyInjection.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		ProfileController profileController = (ProfileController) ctx.getBean("profileController");
		System.out.println(profileController.sampleProfile());

		MyController mycontroller = (MyController) ctx.getBean("myController");
		System.out.println("For primary bean");
		System.out.println(mycontroller.sayHello());

		System.out.println("Testing for Property Injection type of controller");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Testing for Setter injection type of controller");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Testing for constructor injection type type of controller");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
