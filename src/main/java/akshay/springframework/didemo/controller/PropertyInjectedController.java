package akshay.springframework.didemo.controller;

import akshay.springframework.didemo.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
