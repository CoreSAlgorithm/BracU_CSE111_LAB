public class Warrior extends GameCharacter
{
  public int strength = 0;
  public int armor = 0;
  public Warrior(String characterName, int level, int strength, int armor, String weapon)
  {
    super(characterName,level,weapon);
    this.strength = strength;
    this.armor = armor;
    System.out.println("A new warrior has arrived.");
    super.allCharacters[characterCount] = characterName;
    characterCount++;
  }
  public void calculateDamage() 
  {
    totalDamage = (double)((getLevel()*strength) + (armor*50));
  }
  public String toString()
  {
    return getCharacterInfo()
    +("\nCharacter type: Warrior \n")
    +("Weapon: "+weaponType)
    +("\nStrength: "+strength+", Armor: "+armor)
    +("\nTotal damage: "+totalDamage);
  }
}