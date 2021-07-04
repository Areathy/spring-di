package henrietha.DendencyInjection.springdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service
public class SetterGreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello setter people!!!.";
    }
}
