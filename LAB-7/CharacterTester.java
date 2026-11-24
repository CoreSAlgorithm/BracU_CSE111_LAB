public class CharacterTester {
  public static void main(String[] args) {
    Warrior warriorOne = new Warrior("Conan", 100, 150, 15, "Two-Handed Sword");
    System.out.println("--------1--------");
    warriorOne.calculateDamage();
    System.out.println(warriorOne);
    System.out.println("--------2--------");
    Mage mageOne = new Mage("Merlin", 80, 200, 18, "Arcane Staff");
    mageOne.calculateDamage();
    System.out.println(mageOne);
    System.out.println("--------3--------");
    GameCharacter.printAllCharacters();
  }
}
class GameCharacter {
  public static String [] allCharacters= new String [5];
  public static int characterCount=0;  
  private String characterName;
  private int level;
  public String weaponType;
  public double totalDamage;
  public GameCharacter(String name, int level, String weapon) {
    this.characterName = name;
    this.level = level;
    this.weaponType= weapon;
  }
  public String getCharacterInfo() {
    return "Name: " + characterName + ", Level: " + level;
  }
  public int getLevel(){
    return level;
  }
  public static void printAllCharacters(){ 
    if (characterCount>0){
      System.out.println("Available Characters:");
      for(int i=0;i<characterCount;i++){
        System.out.println(allCharacters[i]);     
      }
    }
    else{
      System.out.println("No available character");
    }
  }
}
