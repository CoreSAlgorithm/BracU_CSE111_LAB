public class Trainer
{
  public String name = "";
  public static int id = 0;
  public double avg = 0;
  public Pokemon[] pokemon = new Pokemon[7];
  public int count = 0;
  public Trainer(String name)
  {
    this.name = name;
    System.out.println("Trainer ID: "+this.id+", Name: "+this.name+" - created");
    this.id++;
  }
  public void catchPokemon(Pokemon pokemon)
  {
    if(count < 7)
    {
      this.pokemon[count] = pokemon;
      System.out.println(this.name+" caught: "+pokemon.getName());
      count++;
    }
    else
    {
      System.out.println("Maximum reached");
    }
  }
  public void viewPokeDex()
  {
    System.out.println(this.name+"'s Trainers code: T"+this.id);
    for(int i=0; i<count; i++)
    {
      System.out.println(this.pokemon[i].getName()+": "+this.pokemon[i].getHP()+" points");
      this.avg += this.pokemon[i].getHP();
    }
    System.out.println("Average of HP: "+this.avg/this.count);
  }
  public static void battle(Trainer s1, Trainer s2)
  {
    System.out.println(s1.name+"'s HP average: "+s1.avg/s1.count);
    System.out.println(s2.name+"'s HP average: "+s2.avg/s2.count);
    if(s1.avg/s1.count > s2.avg/s2.count)
    {
      System.out.println(s1.name+"'s wins");
    }
    else
    {
      System.out.println(s2.name+"'s wins");
    }
  }
}