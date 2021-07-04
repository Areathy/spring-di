package henrietha.DendencyInjection.springdi.services;

import org.springframework.stereotype.Service;

//@Service
public class ConstructorGreetingServiceImp implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello constructor people!!!";
    }
}
