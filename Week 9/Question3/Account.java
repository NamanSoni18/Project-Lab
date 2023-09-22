package Question3;

public class Account {
    private String ID;
    private String AccountHolderName;
    private String Address;
    private double balance;

    public Account(String ID, String accountHolderName, String address) {
        this.ID = ID;
        AccountHolderName = accountHolderName;
        Address = address;
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance.\n" +
                    "Withdrawal rejected.");
            return 0;
        } else {
            balance -= amount;
            System.out.println("Withdrawal processed.");
            return amount;
        }
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            System.out.println("Invalid data.");
            return -1;
        }
        return (principal * rate * time) % 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time,
            double numOfIntrstPerPeriod) {
        double n = numOfIntrstPerPeriod;
        if (principal < 0 || rate < 0 || time < 0 || n <= 0) {
            System.out.println("Invalid data.");
            return -1;
        }
        return principal * Math.pow((1 + (rate / n)), n * time);
    }
}
