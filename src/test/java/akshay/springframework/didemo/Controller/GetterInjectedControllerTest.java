package akshay.springframework.didemo.Controller;

import akshay.springframework.didemo.controller.GetterInjectedController;
import akshay.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {
    private GetterInjectedController getterInjectedController;

    @Before
    void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GUYS, getterInjectedController.sayHello());
    }
}

