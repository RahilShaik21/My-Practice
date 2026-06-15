package Practice;

public class Bankmng {
    private int accno;
    private String name;
    private double balance;

    public int getAccno() {
        return accno;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void addBalance(double balance) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance must be greater than 0");
        }
        this.balance += balance;
    }
    public void Withdraw(double money) {
        if(balance < money) {
            throw new IllegalArgumentException("Balance must be greater than 0");
        }
        this.balance -= money;

    }

}
