package henrietha.DendencyInjection.springdi.controllers;

import henrietha.DendencyInjection.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 *Created on 20 June 2021
 * @author henrietha
 */

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello() {
        return greetingService.sayGreeting();
    }
}
