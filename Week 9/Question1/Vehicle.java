package Question1;
public class Vehicle {
    private String name;
    private String type;
    private String wheels;
    private double cost;

    public Vehicle(String name, String type, String wheels, double cost) {
        this.name = name;
        this.type = type;
        this.wheels = wheels;
        this.cost = cost;
    }

    public double cost() {
        System.out.println("Vehicle --> cost()");
        System.out.println("The cost of " + name + " is ₹" + cost);
        return cost;
    }

    public void display() {
        System.out.println("Vehicle --> display()");
        System.out.println(name + " is a " + type + " which has " + wheels + " wheels and costs approx. ₹" + cost);
 }

    public String getName() {
        return name;
    }

    public String getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }
}
