public class Slime extends Combatant {
    
    public Slime(){
        name = "Slime";
        weakness = "fire";
        level = 2;
        healthMax = 125;
        manaMax = 10;
        strength = 4;
        intelligence = 1;
        resistance = 7;
        wisdom = 1;
        speed = 10;
        accuracy = 80;
        exp = 15;
        //goldReward = (int)(Math.random() * 100 - 40 + 100);
    }
    
    public boolean isAlive(){
        return isAlive();
    }
    
    
    
    public int attack(){
        int damage = getStrength() * 1;
        return damage;
    }
    
    public int SlimeSmash(){
        mana -= 5;
        int damage = getStrength() * 3;
        return damage;
        

    }
}
