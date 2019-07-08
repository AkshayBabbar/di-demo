package akshay.springframework.didemo.Controller;

import akshay.springframework.didemo.controller.ConstructorInjectedController;
import akshay.springframework.didemo.services.GreetingService;
import akshay.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GUYS, constructorInjectedController.sayHello());
    }

}
