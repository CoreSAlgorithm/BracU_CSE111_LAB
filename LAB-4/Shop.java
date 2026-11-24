public class Shop
{
  public String shopname = "Mega";
  public int[] price;
  public String[] item ;
  public int count = 0;
  public int length = 0;
  public Shop(String shopname, int length)
  {
    this.shopname = shopname;
    this.length = length;
    this.item = new String[this.length];
    this.price = new int[this.length];
  }
  public Shop(int length)
  {
    this.length = length;
    this.item = new String[this.length];
    this.price = new int[this.length];
  }
  public void info()
  {
    System.out.println("Shop name: "+this.shopname);
    System.out.println("Item details:");
    if(count == 0)
    {
      System.out.println("No Item in shop.");
    }
    else
    {
      System.out.println(count+"/"+this.length);
      for(int i=0; i<count; i++)
      {
        System.out.println(this.item[i]+"-"+this.price[i]);
      }
    }
  }
  public void addItem(String item, int price)
  {
    if(count == this.length)
    {
      System.out.println(item+", could not be added");
    }
    else
    {
      this.item[count] = item;
      this.price[count] = price;
      count++;
    }
  }
  public void addItem(Shop s1, String item)
  {
    boolean found = false;
    for(int i=0; i<s1.count; i++)
    {
      if(item.equals(s1.item[i]))
      {
        if(count == this.length)
        {
          System.out.println(item + ", could not be added");
          return;
        }
        this.item[count] = s1.item[i];
        this.price[count] = s1.price[i];
        count++;
        found = true;
        break;
      } 
    }
    if(!found)
    {
      System.out.println(item+", not found in "+s1.shopname+"!");
    }
  }
  public void purchase(String item)
  {
    for(int i=0; i<count; i++)
    {
      if(item.equals(this.item[i]))
      {
        System.out.println("Purchase complete");
        break;
      }
      else
      {
        System.out.println(item+", is not available in this shop");
        break;
      }
    }
  }
}