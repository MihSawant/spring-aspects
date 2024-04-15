import org.springframework.context.support.ClassPathXmlApplicationContext;

import question.Employee;
import question.Product;
import services.HelloService;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("config.xml");
        // HelloService service = (HelloService) ctx.getBean("helloService");
        // System.out.println(service.wish("mihir"));

         var product = (Product) ctx.getBean("product");
         var emp = (Employee) ctx.getBean(Employee.class);
         // System.out.println(product);
        emp.print();
    }
}
