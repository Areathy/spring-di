package henrietha.DendencyInjection.springdi.config;

import com.henrietha.pets.PetService;
import com.henrietha.pets.PetServiceFactory;
import henrietha.DendencyInjection.springdi.datasource.FakeDataSource;
import henrietha.DendencyInjection.springdi.repositories.EngGreetingsRepo;
import henrietha.DendencyInjection.springdi.repositories.EngGreetingsRepoImpl;
import henrietha.DendencyInjection.springdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

//@ImportResource("classpath:springdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${henrietha.username}") String username,
                                  @Value("${henrietha.password}") String password,
                                  @Value("${henrietha.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory() { return new PetServiceFactory();}

    @Profile({"dog"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile({"cat", "default"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

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
