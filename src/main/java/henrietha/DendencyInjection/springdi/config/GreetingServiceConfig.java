package henrietha.DendencyInjection.springdi.config;

import henrietha.DendencyInjection.springdi.repositories.EngGreetingsRepo;
import henrietha.DendencyInjection.springdi.repositories.EngGreetingsRepoImpl;
import henrietha.DendencyInjection.springdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    EngGreetingsRepo engGreetingsRepo(){
        return new EngGreetingsRepoImpl();
    }

    //The default key word is Spring goto if no profile is set. Just like the @Primary annotation
    @Profile({"ENG", "default"})
    @Bean("profileGreetingService")
    EngProfileGreetingServiceImp engGreetingService(EngGreetingsRepo engGreetingRepo) { return new EngProfileGreetingServiceImp( engGreetingRepo); }

    @Profile("FRN")
    @Bean("profileGreetingService")
    FrenchProfileGreetingServiceImp frnGreetingService() { return new FrenchProfileGreetingServiceImp(); }

    @Bean
    ConstructorGreetingServiceImp constructorGreetingServiceImp() { return new ConstructorGreetingServiceImp(); }

    @Bean PropertyGreetingServiceImp propertyGreetingServiceImp() { return new PropertyGreetingServiceImp(); }

    @Bean
     SetterGreetingServiceImp setterGreetingServiceImp() { return new SetterGreetingServiceImp(); }

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService() { return new PrimaryGreetingService(); }
}
