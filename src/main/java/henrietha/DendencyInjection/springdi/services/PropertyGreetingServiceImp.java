package henrietha.DendencyInjection.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello property people!!!";
    }
}
