package henrietha.DendencyInjection.springdi.repositories;

public class EngGreetingsRepoImpl implements EngGreetingsRepo {
    @Override
    public String getGreeting() { return "Good Morning"; }
}
