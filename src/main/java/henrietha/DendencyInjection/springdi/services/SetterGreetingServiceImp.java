package henrietha.DendencyInjection.springdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SetterGreetingServiceImp implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello setter people!!!. Can also serve as primary if you are confused";
    }
}
