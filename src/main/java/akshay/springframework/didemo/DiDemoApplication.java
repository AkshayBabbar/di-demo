package akshay.springframework.didemo;

import akshay.springframework.didemo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController Controller = (MyController) ctx.getBean("myController");

        Controller.hello();
    }

}
