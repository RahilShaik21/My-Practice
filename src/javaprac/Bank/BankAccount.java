package Bank;
class BankAccount {
    private String accno;
    private String accname;
    private double balance;

    public BankAccount(String accname,String accno ) {
        this.accname = accname;
        this.accno=accno;
    }

    public void DepositMoney(double Money){
       if(Money<=0){
           System.out.println("invalid Deposit");
       }
       else{
           balance+=Money;
           System.out.println("succesfully Deposit");
       }
    }
    public double WithdrawMoney(double Money){
       if(balance>=Money) {
          balance-=Money;
       }
       else if(balance<=0){

           System.out.println("invalid withdrawal");
       }
       else{
          Money=balance;
          balance=0;
            }
        return Money;
    }
}
