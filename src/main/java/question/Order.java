package question;

import java.time.Instant;
import java.util.Date;

public class Order {

    private int orderId;
    private Date orderDate;

    public Order(){
        this.orderDate = Date.from(Instant.now());
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public int getOrderId() {
        return orderId;
    }
    @Override
    public String toString() {
        return "Order: id="+orderId+" date="+orderDate;
    }

}