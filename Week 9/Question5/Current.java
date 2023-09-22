package Question5;

public class Current extends Account {
    private double Max_withdrawal_limit;
    private double balance;

    public Current(String id, String account_holder_name, String address) {
        super(id, account_holder_name, address);
        Max_withdrawal_limit = 50000;
        balance = 0;
    }

    public void display() {
        System.out.println("Account no: " + getId());
        System.out.println("Account Holder Name: " + getAccount_holder_name());
        System.out.println("Account Holder Address: " + getAddress());
        System.out.println("Current Balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }

    @Override
    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance.\n" +
                    "Withdrawal of ₹" + amount + " not processed.");
            return -1;
        } else if (amount > Max_withdrawal_limit) {
            System.out.println("Max Withdrawal Limit exceeded.\n" +
                    "Withdrawal of ₹" + amount + " not processed.");
            return -1;
        } else {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " processed.");
            return amount;
        }
    }
}
