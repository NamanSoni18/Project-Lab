//  In previous question, set the values of using color, taste and price using Constructor.

public class w8q3 {
    static class FRUIT {
        private String color;
        private String taste;
        private double price;

        FRUIT(String color, String taste, double price) {
            this.color = color;
            this.taste = taste;
            this.price = price;
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
        FRUIT apple = new FRUIT("red", "sweet", 80);
        apple.display();

        System.out.println("\nBANANA");
        FRUIT banana = new FRUIT("yellow", "sweet", 40);
        banana.display();
    }

}
