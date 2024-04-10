import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.HelloService;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("config.xml");
        HelloService service = (HelloService) ctx.getBean("helloService");
        System.out.println(service.wish("mihir"));
    }
}
