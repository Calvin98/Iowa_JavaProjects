/**
 * Auto Generated Java Class.
 */
public class ObjectArray {
  
  public static void main(String[] args) { 
    BankAccount[] accounts = new BankAccount[3];
    
    for (int i = 0; i < accounts.length; i++)
    {
      accounts[i] = new BankAccount();
    }

    for (int index = 0; index < accounts.length; index++)
    {
      System.out.println("Account " + (index+1) + " has " + accounts[index].getBalance());
    }
  
    accounts[0].setBalance(50.0);
    accounts[1].setBalance(30.0);
    accounts[2].setBalance(10.0);
    accounts[0].deposit(100);
    
    for (int index = 0; index < accounts.length; index++)
    {
      System.out.println("Account " + (index+1) + " has " + accounts[index].getBalance());
    }
  }
}
