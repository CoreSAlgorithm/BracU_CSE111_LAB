public class Tennis_Tournament extends Tournament
{
  public int team = 0;
  public Tennis_Tournament(String name, int team)
  {
    super(name);
    this.team = team;
  }
  public String info()
  {
    return "Tennis Tournament Name: "+super.getName()+
    "\nNumber of Teams: "+this.team;
  }
}