package henrietha.DendencyInjection.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FRN")
@Service("profileGreetingService")
public class FrenchProfileGreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
         return "Bonju";
    }
}
