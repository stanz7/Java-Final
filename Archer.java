<<<<<<< HEAD
public class Archer extends Playable {
   
   public Archer(){ //default constructor
        setHealth(100);
        
    }
    
    /*
  public int BlindingArrow(Character targets){
=======
public class Archer extends Playable{
   
   public Archer(String name){ //default constructor
      setName(name);
      setHealth(100);
   }
    
   public int BlindingArrow(Combatant targets){
>>>>>>> 93848c25707229d94b57fa789ade04b482fc803a
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
<<<<<<< HEAD
      mana -= 10;
      Archer.seAccuracy( Archer.getAccuracy() + 10 );
      Archer.setStrength( Archer.getStrength() + 10 );
  }
=======
  //}
>>>>>>> 93848c25707229d94b57fa789ade04b482fc803a

  public int SlowingShot(Character targets){
      //lowers priority will implement later
      mana -= 10;
      int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20)));
      return damage;
              
  }
    */
    
}
