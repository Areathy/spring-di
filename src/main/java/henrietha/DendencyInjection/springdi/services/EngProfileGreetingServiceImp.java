package henrietha.DendencyInjection.springdi.services;

import henrietha.DendencyInjection.springdi.repositories.EngGreetingsRepo;

public class EngProfileGreetingServiceImp implements GreetingService{

    public final EngGreetingsRepo engGreetingsRepo;

    public EngProfileGreetingServiceImp(EngGreetingsRepo engGreetingsRepo) {
        this.engGreetingsRepo = engGreetingsRepo;
    }

    @Override
    public String sayGreeting() { return "Good Morning"; }
}
