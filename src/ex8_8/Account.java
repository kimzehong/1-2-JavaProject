package ex8_8;

public class Account {
    private int balance;

    private String name;

    private String pwd;

    public int getBalance() {
        return balance;
    }

    public Account(String aCn,String name, String pwdN, int balN) {}

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    // 입금하는 메소드 : deposit
    public void deposit(int money){
        balance += money;
    }

    // 출금하는 메소드 : withdraw
    public void withdraw(int money){
        balance -= money;
    }
}