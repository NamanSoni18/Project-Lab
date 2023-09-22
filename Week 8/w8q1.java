public class w8q1 {
    static class FRUIT {
        String color;
        String taste;
        double price;

        void display() {
            System.out.println("Color: " + color);
            System.out.println("Taste: " + taste);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        FRUIT grapes = new FRUIT();
        grapes.color = "green";
        grapes.taste = "sour";
        grapes.price = 100;

        FRUIT apple = new FRUIT();
        apple.color = "red";
        apple.taste = "sweet";
        apple.price = 80.0;

        FRUIT banana = new FRUIT();
        banana.color = "yellow";
        banana.taste = "sweet";
        banana.price = 40.0;

        System.out.println("--Grapes--");
        grapes.display();
        System.out.println("--Apple--");
        apple.display();

        System.out.println("--Banana--");
        banana.display();
    }
}
