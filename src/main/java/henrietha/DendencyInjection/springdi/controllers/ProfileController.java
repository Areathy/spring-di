package henrietha.DendencyInjection.springdi.controllers;

import henrietha.DendencyInjection.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {
    GreetingService greetingService;

    public ProfileController(@Qualifier("profileGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sampleProfile() {
        return greetingService.sayGreeting();
    }
}
