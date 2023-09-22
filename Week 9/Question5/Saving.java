package Question5;

public class Saving extends Account {
    public double min_balance;

    public Saving(String id, String account_holder_name, String address) {
        super(id, account_holder_name, address);
        min_balance = 10000;
    }

    public void display() {
        System.out.println("Account no: " + getId());
        System.out.println("Account Holder Name: " + getAccount_holder_name());
        System.out.println("Account Holder Address: " + getAddress());
        System.out.println("Current Balance: ₹" + min_balance);
    }

    public double getBalance() {
        return min_balance;
    }

    @Override
    public void deposit(double amount) {
        min_balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }

    @Override
    public double withdraw(double amount) {
        if (min_balance < amount) {
            System.out.println("Insufficient Balance.\n" +
                    "Withdrawal of ₹" + amount + " not processed.");
            return -1;
        } else {
            min_balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " processed.");
            return amount;
        }
    }
}