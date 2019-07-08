package akshay.springframework.didemo.controller;

import akshay.springframework.didemo.services.GreetingService;
import akshay.springframework.didemo.services.GreetingServiceImpl;

public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();

    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
