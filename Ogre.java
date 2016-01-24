public class Ogre extends Combatant {
    
    public Ogre(){
        name = "Ogre";
        weakness = "none";
        level = 3;
        healthMax = 225;
        manaMax = 0;
        strength = 12;
        intelligence = 0;
        resistance = 5;
        wisdom = 1;
        speed = 10;
        accuracy = 75;
        exp = 50;
        //goldReward = (int)(Math.random() * 150 - 65 + 150);
    }
    
    public boolean isAlive(){
        return isAlive();
    }
    
    
    
    public int attack(Combatant target){
        int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength())));
        return damage;
    }
    
    public int BluntSmash(Combatant target){
        mana -= 5;
        int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength()))) * 3;
        return damage;
        

    }
}
