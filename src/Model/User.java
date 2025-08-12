package Model;

public class User {
    private String name;
    private double orderPrice;

    public User(String name, double orderPrice){
        this.name=name;
        this.orderPrice=orderPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
