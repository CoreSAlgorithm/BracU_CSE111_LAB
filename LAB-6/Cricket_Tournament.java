public class Cricket_Tournament extends Tournament
{
  public int team = 0;
  public String formet = "No type";
  public Cricket_Tournament()
  {
    super();
  }
  public Cricket_Tournament(String name, int team, String formet)
  {
    super(name);
    this.team = team;
    this.formet = formet;
  }
  public String info()
  {
    return "Cricket Tournament Name: "+super.getName()+
    "\nNumber of Teams: "+this.team+
    "\nType: "+this.formet;
  }
}