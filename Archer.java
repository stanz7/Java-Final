public class Archer extends Playable{
   
   public Archer(String name){ //default constructor
      setName(name);
      setHealth(100);
   }
    
   public int BlindingArrow(Combatant targets){
      //lowers the monsters accuracy
      mana -= 10;
      targets.setAccuracy((targets.getAccuracy() - 20));
      int damage = (int)(Math.random() * (getStrength()) - (getStrength() - 20)) +(getStrength() - 20);
      return damage;
      
  }
  
  public int Volley(){
      //fires 3 shots at enemies
      mana -= 10;
      int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20)))*3;
      return damage;
      
  }
  
  //public void Focus(){
      //increases accuracy and damage
  //}

  public int SlowingShot(Character targets){
      //lowers priority will implement later
      mana -= 10;
      int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20)));
      return damage;
              
  }
    
    
}
