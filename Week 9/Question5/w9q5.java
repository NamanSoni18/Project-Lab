package Question5;

public class w9q5 {
    public static void main(String[] args) {
        System.out.println();
        Saving account1 = new Saving("SAV0004567", "Harry Lector",
                "Beakers Street, New York");
        Current account2 = new Current("CUR0001234", "Will Shakespere",
                "Soap Complex, Vegas");
        System.out.println("***************** Account 1 *****************");
        System.out.println();
        account1.display();
        System.out.println();
        account1.deposit(5000);
        System.out.println("----------------------");
        account1.withdraw(7000);
        System.out.println("----------------------");
        account1.withdraw(9000);
        System.out.println("----------------------");
        System.out.println("Current Balance: ₹" + account1.getBalance());
        System.out.println();
        System.out.println("***************** Account 2 *****************");
        System.out.println();
        account2.display();
        System.out.println();
        account2.deposit(100000);
        System.out.println("----------------------");
        account2.withdraw(45000);
        System.out.println("----------------------");
        account2.withdraw(55000);
        System.out.println("----------------------");
        account2.withdraw(40000);
        System.out.println("----------------------");
        account2.withdraw(30000);
        System.out.println("----------------------");
        System.out.println("Current Balance: ₹" + account2.getBalance());
        System.out.println();
    }

}
