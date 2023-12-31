/* Add one-argument constructor and two-argument constructor in addition to default constructor in 
FRUIT class. */

public class w8q4 {
    static class FRUIT {
        private String color;
        private String taste;
        private double price;

        FRUIT(String color, String taste, double price) {
            this.color = color;
            this.taste = taste;
            this.price = price;
        }

        FRUIT(String color, String taste) {
            this.color = color;
            this.taste = taste;
            this.price = -1;
        }

        FRUIT(String color) {
            this.color = color;
            this.taste = "tasteless";
            this.price = -1;
        }

        FRUIT() {
            this.color = "colorless";
            this.taste = "tasteless";
            this.price = -1;
        }

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
        System.out.println("GRAPES");
        FRUIT grapes = new FRUIT("green", "sour", 100);
        grapes.display();

        System.out.println("\nAPPLE");
        FRUIT apple = new FRUIT("red", "sweet");
        apple.display();

        System.out.println("\nBANANA");
        FRUIT banana = new FRUIT("yellow", "sweet", 40);
        banana.display();
    }

}
