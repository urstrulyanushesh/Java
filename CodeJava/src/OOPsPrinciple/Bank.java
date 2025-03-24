package OOPsPrinciple;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;  // Initialize balance to 0
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += money;
            System.out.println("Deposited: " + money);
        }
    }

    public void withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Withdraw Amount");
        } else if (balance >= money) {
            balance -= money;
            System.out.println("Withdrawn: " + money+ " Remaining Balance = " + getBalance());
        } else {
            double withdrawnAmount = balance;
            balance = 0;
            System.out.println(money + " Is Not in your Bank A/C " + " Remaining Balance Withdrawn: " + withdrawnAmount  );
        }
    }
}

public class Bank {

    public static void main(String[] args) {
        BankAccount customer = new BankAccount("012AC", "Abhimanyu");
        customer.depositMoney(500);
        customer.withdrawMoney(200);
        customer.depositMoney(-200);
        customer.withdrawMoney(0);
        customer.withdrawMoney(1000);
    }
}
