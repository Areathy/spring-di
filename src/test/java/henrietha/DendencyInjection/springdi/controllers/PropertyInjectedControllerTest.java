package henrietha.DendencyInjection.springdi.controllers;

import henrietha.DendencyInjection.springdi.services.ConstructorGreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingServiceImp();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}