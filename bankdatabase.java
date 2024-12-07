public class BankDataBase implements MyBankInterface{
   creditAccount[] creditAcct;
   checkingAccount[] checkingAcct;
  int credSize;
  int checkSize;

  public BankDataBase(){
    creditAcct = new creditAccount[200];
    checkingAcct = new checkingAccount[200];
    int credSize = 0;
    int checkSize = 0;
  }

      public void expand(){
        creditAccount[] newCredList = new creditAccount[creditAcct.length * 2];
        checkingAccount[] newCheckList = new checkingAccount[checkingAcct.length * 2];

        for (int i = 0; i < credSize; i++) {
          newCredList[i] = creditAcct[i];
        }
        creditAcct = newCredList;
        

        for (int i = 0; i < checkSize; i++) {
          newCheckList[i] = checkingAcct[i];
        }
        checkingAcct = newCheckList;
      }

        public void addCheckAccount(checkingAccount a){
       checkingAcct[checkSize]=a;
       checkSize++;
       //incase this gets full add an expand
         if (checkSize > creditAcct.length - 5) {
            expand();
          }        
     }

     public void addCredAccount(creditAccount b){
       creditAcct[credSize]=b;
       credSize++;
       if (credSize > creditAcct.length - 5) {
            expand();
          } 
     }

     public void printCreditAcct(){
      for(int i =0; i < credSize; i++){
        creditAccount temp = (creditAccount)creditAcct[i];
        temp.creditInfo();
