package Bank;
class customer {
    static void main(String[] args) {
        BankAccount acc1=new BankAccount("001","123ABC");
        acc1.DepositMoney(100);
        System.out.println(acc1.WithdrawMoney(200));
        acc1.DepositMoney(-40);
        acc1.WithdrawMoney(0);
    }
}
