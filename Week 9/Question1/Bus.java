package Question1;
public class Bus extends Vehicle {
    public Bus(String name, double cost) {
        super(name, "Bus", "6", cost);
    }

    @Override
    public void display() {
        System.out.println("Bus --> display()");
        System.out.println(getName() + " is a bus with " + getWheels() + " wheels and costs approx. ₹" + getCost());
    }
}
