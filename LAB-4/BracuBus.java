public class BracuBus
{
  public String route = "";
  public int max = 2;
  public int passengerCount = 0;
  public String[] passengerBoard = new String[2];
  public int count = 0;
  public BracuBus(String route)
  {
    this.route = route;
  }
  public BracuBus(String route, int max)
  {
    this.route = route;
    this.max = max;
    this.passengerBoard = new String[max];
  }
  public void showDetails()
  {
    System.out.println("Bus route: "+this.route);
    System.out.println("Passenger count: "+this.passengerCount+" (Max: "+this.max+")");
    System.out.println("Passenger on Board: ");
    if(count == 0 )
    {
      
    }
    else
    {
      for(int i=0; i<count; i++)
      {
        System.out.println(this.passengerBoard[i]);
      }
    }
  }
  public void board()
  {
    System.out.println("No passengers");
  }
  public void board(BracuStudent s1)
  {
    if(passengerCount < max)
    {
      if(s1.pass == false)
      {
        System.out.println("You don't have a bus pass!");
      }
      else
      {
        if(this.route != s1.lives)
        {
          System.out.println("You got on the wrong bus!");
        }
        else
        {
          this.passengerBoard[count] = s1.name;
          count++;
          System.out.println(s1.name+" boarded the bus");
          passengerCount++;
        }
      }
    }
  }
  public void board(BracuStudent s1, BracuStudent s2)
  {
    if(passengerCount < max)
    {
      if(s1.pass == false)
      {
        System.out.println("You don't have a bus pass!");
      }
      else
      {
        if(this.route != s1.lives)
        {
          System.out.println("You got on the wrong bus!");
        }
        else
        {
          this.passengerBoard[count] = s1.name;
          count++;
          System.out.println(s1.name+" boarded the bus");
          passengerCount++;
        }
      }
    }
    else
    {
      System.out.println("Bus is full!");
    }
    if(passengerCount < max)
    {
      if(s2.pass == false)
      {
        System.out.println("You don't have a bus pass!");
      }
      else
      {
        if(this.route != s2.lives)
        {
          System.out.println("You got on the wrong bus!");
        }
        else
        {
          this.passengerBoard[count] = s2.name;
          count++;
          System.out.println(s2.name+" boarded the bus");
          passengerCount++;
        }
      }
    }
    else
    {
      System.out.println("Bus is full!");
    }
  }
}