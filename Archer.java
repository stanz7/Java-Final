public Archer extends Playable{
   
   public Archer(){ //default constructor
        Rep = 0;
        EXP = 0;
        
    }
    
        
    
  public int BlindingArrow(Character target){
      //lowers the monsters accuracy
      int a = target.getAccuracy();
      target.setAccuracy(a -= 15);
      int damage =  (1  * ((Archer.getStrength() * 10) - (target.getResistance() * 7)))
      return damage;
      
  }
  
  public int Volley(){
      //fires 3 shots at enemies
      int damage = (3 * ((Archer.getStrength()* 10) - (target.getResistance() * 7)));
      return damage;
  }
  
  public void Focus(){
      //increases accuracy and damage
  }
  
  public int SlowingShot(){
      //lowers priority will implement later
      
  }
    
    
}
