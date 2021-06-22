package henrietha.DendencyInjection.springdi.controllers;

import henrietha.DendencyInjection.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServiceImp")
    @Autowired
    public GreetingService greetingService;

    public  String getGreeting() {
        return greetingService.sayGreeting();
    }
}
