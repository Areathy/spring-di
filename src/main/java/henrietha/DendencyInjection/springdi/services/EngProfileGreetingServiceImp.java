package henrietha.DendencyInjection.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//The default key word is Spring goto if no profile is set. Just like the @Primary annotation
//@Service("profileGreetingService")
public class EngProfileGreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Good Morning";
    }
}
