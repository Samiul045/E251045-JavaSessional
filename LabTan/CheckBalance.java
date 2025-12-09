interface ATMService {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
class DBBL implements ATMService {
    private double balance = 0;
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Taka deposited successfully.");
        System.out.println("Updated Balance: " + balance + " Taka");
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Taka withdrawn successfully.");
            System.out.println("Remaining Balance: " + balance + " Taka");
        } else {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
    }
    public void CheckBalance() {
        System.out.println("Current Balance: " + balance + " Taka");
    }
    public static void main(String[] args) {
        DBBL atm = new DBBL();

        atm.deposit(3000);
        atm.withdraw(1000);
        atm.checkBalance();
    }
}
