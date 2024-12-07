class TesterMain{
  public static void main(String args[]){

    BankDataBase db = new BankDataBase();
    db.createCheckAccount("John Doe", 0, 200.00);
    db.createCheckAccount("Regina Gorge ", 1, 400.00);
    db.createCheckAccount("John Lucas", 2, 75.00);
    db.createCredAccount("Paris Dior", 0, 100.00);
    db.createCheckAccount("Paris Dior", 3, 500.00);
    System.out.println(db.checkSize);
    System.out.println(db.credSize);
    db.printCheckingAcct();
    db.printCreditAcct();
    System.out.println(db.getCheckAccount(0));
    System.out.println(db.getCheckAccount(1));db.getCredAccount(0);
    System.out.println(db.getCheckAccount(2).ownerName+" - "+db.getCheckAccount(2).balance );
    db.changeCheckName( 1, "Regina Gorge - Thompson");
    db.changeBothName(0,3, "Paris Dior", "Paris Melanie Dior");
    System.out.println(db.getCheckAccount(1).ownerName);
    System.out.println(db.getCredAccount(0).ownerName);
    System.out.println(db.getCheckAccount(3).ownerName);
    System.out.println("line22: " + db.getCheckAccount(0)+ "'s balance is: " + db.deposit(0, 100));
    System.out.println(db.withdrawl(0,50));
    db.purchase(0, "John Doe", 50.00);
    db.purchase(0, "Paris Melanie Dior" , 28.00);
    System.out.println("(line: 26) "+ db.getCredAccount(0) + "'s avialable credit is: " + db.getCredAccount(0).availableCredit + ", and the credit Limit is still " + db.getCredAccount(0).creditLimit + ". The debt is: " + db.getCredAccount(0).debt + ". Please pay you debt within 3 weeks to avoid the late fee." );
    db.repay(3,0, "Paris Melanie Dior", 25.00);
   System.out.println(db.transfer(1, 3, 50.00));
    

  } 
}
