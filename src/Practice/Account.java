package Practice;

public class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public String getNum() {
        return num;
    }

    public int getBalance() {
        return balance;
    }

    public boolean transfer(Account account, int amount) {

        if (balance < amount) {
            System.out.println("잔액이 부족하여 이체 불가능!!");
            return false;
        }

        balance -= amount;
        account.balance += amount;
        return true;



    }

    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}
