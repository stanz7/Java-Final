public class Warrior extends Playable {
    
    public Warrior (String name) {
        setName(name);
        setHealth(150);
    }
    

    
    public int DemoralizingStrike(Character target){
        //increases priority will implement later
        mana -= 4;
        int damage = (int)(Math.random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20));
      return damage;
        
    }
    
    public int PowerStrike(Character target){
        //power strike!!!
        mana -= 4;
        int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20)))*2;
        return damage;
            
    }
    
    //public void HyperBody(){
        //increases strength
      //  strength += 
 // }
    
    public int NormalAttack(Character target){
        //normal attack 
        int damage = (int)(Math.
        random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20));
        return damage;
    }
    

    
}
