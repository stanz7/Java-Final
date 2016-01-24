public class Behemoth extends Combatant{
    //boss?
    public Behemoth(){
        setHealth(200);
        name = "Behemoth";
        weakness = "none";
        level = 8;
        healthMax = 490;
        manaMax = 50;
        strength = 15;
        intelligence = 9;
        resistance = 10;
        wisdom = 10;
        speed = 20;
        accuracy = 20;
        exp = 100;
        //goldReward = (int)(Math.random() * 250 - 80 + 250);

    }
    

    
    public boolean isAlive(){
        return isAlive();
    }
    
    
    
    public int attack(Playable target){
        setStrength(15);
        int damage =  ((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength())));
        return damage;
    }
    
    public void buff(){
        mana -= 9;
        setStrength(25);
        
    }
    
    public int sweep(){
        //hits all enemies
        mana -= 20;
        int damage = 3 * ((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength())));
        return damage;
        
    }
    
    public int thunder(){
        //thunderbolt
        mana -= 20;
        element = "thunder";
         int damage = 3 * ((int)(Math.random() * ((getIntelligence()) - (getIntelligence() - 10)) +(getIntelligence() - 20)));
        return damage;
        
    }
    
}
    
    //public void counter(){
    
    //}

