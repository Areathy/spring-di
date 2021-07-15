package henrietha.DendencyInjection.springdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //To make this a prototype, by default spring boot is singleton
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating Prototype bean");
    }

    public String getScope() {
        return "Prototype";
    }
}
