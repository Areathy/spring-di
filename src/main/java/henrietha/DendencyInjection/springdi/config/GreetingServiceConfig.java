package henrietha.DendencyInjection.springdi.config;

import henrietha.DendencyInjection.springdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"ENG", "default"})
    @Bean("profileGreetingService")
    EngProfileGreetingServiceImp engGreetingService() { return new EngProfileGreetingServiceImp(); }

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
