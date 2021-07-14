package henrietha.DendencyInjection.springdi;

/**
 *Created on 20 June 2021
 * @author henrietha
 */

import henrietha.DendencyInjection.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"henrietha.DendencyInjection.springdi", "com.henrietha.pets"})
@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("Most liked pet is...");
		System.out.println(petController.likedPetService());

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
