package services;


import org.aspectj.lang.JoinPoint;

public class HelloServiceAspect {

    public void hello(JoinPoint jp) throws Throwable {
        System.out.println("Welcome...");
        Thread.sleep(1500);
    }
}
