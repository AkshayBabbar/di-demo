package akshay.springframework.didemo.Controller;

import akshay.springframework.didemo.controller.PropertyInjectedController;
import akshay.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GUYS, propertyInjectedController.sayHello());
    }
}
