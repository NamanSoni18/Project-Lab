/*  Create a class Vehicle, write a method cost() in this class. Create two classes Bus and Train which have their own display() methods and inherit from Vehicle class. Create objects of Bus and Train class and call cost() and display() methods. */

package Question1;
public class w9q1 {
    public static void main(String[] args) {
        System.out.println();   
        Vehicle bus = new Bus("Eicher 20.15 N LPO", 1650000);
        Vehicle train = new Train("Maharaja Express", 650000);
        bus.cost();
        train.cost();
        System.out.println();
        bus.display();
        System.out.println();
        train.display();
        System.out.println();
    }
}
