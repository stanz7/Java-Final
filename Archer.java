public class Archer extends Playable {
   
   public Archer(){ //default constructor
        setHealth(100);
        
    }
    
    /*
  public int BlindingArrow(Character targets){
      //lowers the monsters accuracy
      mana -= 10;
      targets.setAccuracy((targets.getAccuracy - 20));
      int damage = (int)(Math.random() * ((Archer.getStrength()) - (Archer.getStrength() - 20)) +(Archer.getStrength() - 20));
      return damage;
      
  }
  
  public int Volley(){
      //fires 3 shots at enemies
      mana -= 10;
      int damage = ((int)(Math.random() * ((Archer.getStrength()) - (Archer.getStrength() - 20)) +(Archer.getStrength() - 20)))*3;
      return damage;
      
  }
  
  public void Focus(){
      //increases accuracy and damage
      mana -= 10;
      Archer.seAccuracy( Archer.getAccuracy() + 10 );
      Archer.setStrength( Archer.getStrength() + 10 );
  }

  public int SlowingShot(Character targets){
      //lowers priority will implement later
      mana -= 10;
      int damage = ((int)(Math.random() * ((Archer.getStrength()) - (Archer.getStrength() - 20)) +(Archer.getStrength() - 20)));
      return damage;
              
  }
    */
    
}
