public class BracuStudent
{
  public String name = "";
  public String lives = "";
  public boolean pass = false; 
  public BracuStudent(String name, String lives)
  {
    this.name = name;
    this.lives = lives;
  }
  public void showDetails()
  {
    System.out.println("Student name: "+this.name);
    System.out.println("Lives in "+this.lives);
    System.out.println("Have Bus pass? "+this.pass);
  }
  public void collectPass()
  {
    this.pass = true;
  }
  public void setLocation(String lives)
  {
    this.lives = lives;
  }
} 