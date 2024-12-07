public class checkingAccount extends Account{

double balance;

  public checkingAccount(String ownerName, int acctNum, double amount){
    super(ownerName, acctNum);
    balance = amount;
    this.acctNum = 2000 + acctNum;
  }
  
  public double getAmount(){
    return balance;
  }

  public String checkingInfo(){
    return ("This is an active checking account, the account number is: " + acctNum);
  }

  public String toString(){
    return ("This is an active checking account, the account number is: " + acctNum);
  }
  
}
