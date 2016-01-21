public Warrior extends Playable{
   
   public Warrior(){ //default constructor
        Rep = 0;
        EXP = 0;
        
    }
    
    public int DemoralizingStrike(){
        //increases priority will implement later
        mana -= 4;
        int damage = (int)(Math.random() * ((Warrior.getStrength()) - (Warrior.getStrength() - 20)) +(Warrior.getStrength() - 20));
      return damage;
        
    }
    
    public int PowerStrike(){
        //power strike!!!
        mana -= 4;
        int damage = ((int)(Math.random() * ((Warrior.getStrength()) - (Warrior.getStrength() - 20)) +(Warrior.getStrength() - 20)))*2;
        return damage;
            
    }
    
    //public void HyperBody(){
        //increases strength
      //  strength += 
 // }
    
    public int NormalAttack(){
        //normal attack 
        attack();
    }
    
    
}
