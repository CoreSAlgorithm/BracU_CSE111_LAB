public class Account
{
  public String name = "";
  public String address = "";
  private double balance = 0;
  public static String bankName = "Badda Bank";
  public static int count = 0;
  public static double totalBalance = 0;
  public Account(String name, String address)
  {
    this.name = name;
    this.address = address;
    this.count++;
  }
  public void printInfo()
  {
    System.out.println("Name: "+this.name+", Address: "+this.address);
    System.out.println("Balance: "+this.balance);
  }
  public void setBalance(double balance)
  {
    this.balance = balance;
    this.totalBalance += balance;
  }
  public double getBalance()
  {
    return this.balance;
  }
}