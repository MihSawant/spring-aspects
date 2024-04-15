package question;
import question.Order;

public class Product {

    private int pid;
    private String name;

    private Order order;
    
    public Product(){};

    public void setName(String name) {
        this.name = name;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    public int getPid() {
        return pid;
    }

    @Override
    public String toString() {
        return "Product: id="+pid+" name="+name+" order="+order;
    }

}