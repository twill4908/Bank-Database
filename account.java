public abstract class Account {
    static int counter = 0; //static is shared/ the same across all instances
    int acctNum;
    String ownerName;

    public Account(String ownerName, int acctNum){
        this.acctNum = acctNum;
        this.ownerName = ownerName;
    }
    
    public void accountInfo() {
        System.out.println(ownerName + " is an active bank account. The account number is: " + acctNum);
    }

    //public getBal
    public String toString(){
      String st = ownerName;
      return st;
    }
}
