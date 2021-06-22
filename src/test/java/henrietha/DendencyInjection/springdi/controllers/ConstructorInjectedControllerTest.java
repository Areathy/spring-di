package henrietha.DendencyInjection.springdi.controllers;

import henrietha.DendencyInjection.springdi.services.ConstructorGreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImp());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}