public class Cat extends Animal
{
  public String breed = "";
  public Cat(String name, int age, String color, String breed)
  {
    super(name, age, color);
    this.breed = breed;
  }
  public void makeSound()
  {
    System.out.println(super.color+" color "+super.name+" is mewing");
  }
  public String catInfo()
  {
    return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\nBreed: "+breed;
  }
}