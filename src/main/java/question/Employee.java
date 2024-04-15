package question;

public class Employee {
    
    private final Product product;

    public Employee(Product product){
        this.product = product;
    }
   

    public void print(){

        System.out.println(product);

    }
}
