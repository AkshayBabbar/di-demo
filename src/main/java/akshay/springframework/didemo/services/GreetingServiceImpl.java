package akshay.springframework.didemo.services;

public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GUYS = "Hello Guysss!!!!";


    @Override
    public String sayGreeting() {
        return HELLO_GUYS;
    }
}
