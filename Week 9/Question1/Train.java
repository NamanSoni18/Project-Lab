package Question1;
public class Train extends Vehicle {
    public Train(String name, double cost) {
        super(name, "Train", "many", cost);
    }

    @Override
    public void display() {
        System.out.println("Train --> display()");
        System.out.println(getName() + " is a train with " + getWheels() + " wheels and its ticket costs approx. ₹" + getCost());
    }
}