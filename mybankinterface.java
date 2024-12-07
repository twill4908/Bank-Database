import java.io.*; 

public interface MyBankInterface{
  public void createCheckAccount(String clientName, int acctNum,  double amt);
  public void createCredAccount(String clientName, int acctNum,  double creditLimit);
  public void changeBothName(int accountNumber1, int accountNumber2, String currentName, String newName);
  public void changeCredName(int accountNumber, String newName);
  public String getCheckAccountInfo (int accountNumber);
  public String getCreditAccountInfo (int accountNumber);
  public void changeCheckName(int accountNumber, String newName);
  public boolean ValidAcct(int acctNum);
  public void outputStateCheck(MyFileWriter writer);
  public void outputStateCred(MyFileWriter writer); 
  public void purchase(int accountNumber, String name, double item);
  public double deposit(int accountNumber, double amount);
  public double withdrawl(int accountNumber, double amount);
  public String transfer(int accountNumber, int accountNumber2, double amount);
  public void repay(int checkAccountNumber, int credAccountNumber,  String name, double amount);
  public checkingAccount getCheckAccount(int accountNumber);
  public creditAccount getCredAccount(int accountNumber);
  public void printCheckingAcct();
  public void printCreditAcct();
  public void addCredAccount(creditAccount b);
  public void addCheckAccount(checkingAccount a);
  public void expand();
}
