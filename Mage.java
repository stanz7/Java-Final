public class Mage extends Playable {
    
   
   public Mage (String name) { //default constructor
   setName(name);
    setHealth(50);
    }
    
    public void Heal(Combatant teammate){
    // Heals a target
    mana -= 20;
    teammate.setHealth ( teammate.getHealth() + 25 );
    
    } 
    



    public int Fire(){
        //fireball!1!!
        mana -= 20;
        element = "fire";
        int damage = 3 * ((int)(Math.random() * (getIntelligence() - (getIntelligence()-20)) +(getIntelligence()  - 20)));
        return damage;

    }
    
    public int Ice(){
        //ICEEEE
        mana -= 20;
        element = "ice";
        int damage = 3 * ((int)(Math.random() * (getIntelligence() - (getIntelligence() - 20)) +(getIntelligence() - 20)));
        return damage;

    }
    
    public int NormalAttack(){
    int damage = 2 * (int)(Math.random() * (getStrength() - (getStrength() - 5)) + (getStrength() - 20));
    return damage;
    }

    
}
