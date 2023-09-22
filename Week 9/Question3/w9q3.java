/* Create class Account (Data members- Id, Account_holder_name, Address; Methodsdeposit(), withdraw()). Create two static methods in Account calculateSimpleInterest() and calculateCompoundInterest() and implement them. */

package Question3;

public class w9q3 {
    public static void main(String[] args) {
        System.out.println();
        Account newAccount = new Account("NEWBANK000192",
                "Kobe Bryant",
                "L-45, French Quarters, Central City");
        System.out.println("Current Balance: ₹" + newAccount.getBalance());
        newAccount.deposit(10000);
        System.out.println("Current Balance: ₹" + newAccount.getBalance());
        newAccount.withdraw(5000);
        System.out.println("Current Balance: ₹" + newAccount.getBalance());
        newAccount.withdraw(6000);
        System.out.println();

    }
}
