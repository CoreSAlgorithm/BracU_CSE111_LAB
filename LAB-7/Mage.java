public class Mage extends GameCharacter
{
  public int intelligence = 0;
  public int mana = 0;
  public Mage(String characterName, int level, int intelligence, int mana, String weapon)
  {
    super(characterName,level,weapon);
    this.intelligence = intelligence;
    this.mana = mana;
    System.out.println("A new mage came to live.");
    super.allCharacters[characterCount] = characterName;
    characterCount++;
  }
  public void calculateDamage()
  {
    totalDamage = (double)((getLevel()*intelligence) + (mana*10));
  }
  public String toString()
  {
    return getCharacterInfo()
    +("\nCharacter type: Mage \n")
    +("Weapon: "+weaponType)
    +("\nIntelligence: "+intelligence+", Mana: "+mana)
    +("\nTotal damage: "+totalDamage);
  }
}