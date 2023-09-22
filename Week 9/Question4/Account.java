package Question4;

abstract class Account {
    private String id;
    private String Account_holder_name;
    private String Address;

    public Account(String id, String account_holder_name, String address) {
        this.id = id;
        Account_holder_name = account_holder_name;
        Address = address;
    }

    abstract void deposit(double amount);

    abstract double withdraw(double amount);

    public String getId() {
        return id;
    }

    public String getAccount_holder_name() {
        return Account_holder_name;
    }

    public String getAddress() {
        return Address;
    }
}
