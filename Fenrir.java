public class Fenrir extends Combatant {
    
    public Fenrir(){
        name = "Fenrir";
        weakness = "fire";
        level = 4;
        healthMax = 200;
        manaMax = 30;
        strength = 9;
        intelligence = 4;
        resistance = 5;
        wisdom = 5;
        speed = 20;
        accuracy = 90;
        exp = 30;
        //goldReward = (int)(Math.random() * 150 - 65 + 150);
    }
    
    public boolean isAlive(){
        return isAlive();
    }
    
    
    
    public int attack(Combatant target){
        element = "ice";
        int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength())));
        return damage;
    }
    
    public int slash(Combatant target){
        element = "ice";
        mana -= 10;
        int damage = 2*((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength())));
        return damage;
        
    }
}
