public class Team
{
  public String teamname = "";
  public String[] player = new String[11];
  public int[] age = new int[11];
  public int[] totalmatch = new int[11];
  public int count = 0;
  public Team()
  {}
  public Team(String teamname)
  {
    this.teamname = teamname;
  }
  public void updateName(String teamname)
  {
    this.teamname = teamname;
  }
  public void addPlayer(Player p)
  {
    if(count < 11)
    {
      this.player[count] = p.playername;
      this.age[count] = p.age;
      this.totalmatch[count] = p.totalmatches;
      count++;
    }
    else
    {
      System.out.println("No spot available.");
    }
  }
  public void printDetail()
  {
    System.out.println("Team: "+this.teamname);
    System.out.println("List of players:");
    for(int i=0; i<count; i++)
    {
      System.out.println("Name: "+this.player[i]);
      System.out.println("Age: "+this.age[i]+", "+"Total Matches: "+this.totalmatch[i]);
    }
  }
}