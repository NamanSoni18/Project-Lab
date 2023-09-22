/* Create a class FRUIT which has data members color, taste and price. It has a method setDetails() 
which will set the values of color, taste and price. Also create a method display() which will print 
values of FRUIT object. */

public class w8q2 {
    static class FRUIT {
        String color;
        String taste;
        double price;

        void display() {
            System.out.println("Color: " + color);
            System.out.println("Taste: " + taste);
            System.out.println("Price: " + price);
        }

        void setDetails(String c, String t, double p) {
            color = c;
            taste = t;
            price = p;
        }
    }

    public static void main(String[] args) {
        FRUIT grapes = new FRUIT();
        System.out.println("GRAPES");
        grapes.setDetails("green", "sour", 100);
        grapes.display();

        System.out.println("\nAPPLE");
        FRUIT apple = new FRUIT();
        apple.setDetails("red", "sweet", 80);
        apple.display();

        System.out.println("\nBANANA");
        FRUIT banana = new FRUIT();
        banana.setDetails("yellow", "sweet", 40);
        banana.display();
    }
}
