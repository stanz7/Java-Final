public class Leviathan extends Combatant implements NonPlayable{
    //boss?
    public Leviathan(){
        setHealth(600);
        name = "Leviathan";
        weakness = "none";
        level = 10;
        healthMax = 600;
        manaMax = 50;
        strength = 20;
        intelligence = 15;
        resistance = 15;
        wisdom = 15;
        speed = 22;
        accuracy = 100;
        exp = 275;
        //goldReward = (int)(Math.random() * 250 - 80 + 250);

    }
    
    public void behavior () {
        if ( Game.getCombat().getTurnCounter() % 3 == 0 )
            hail();
        if ( health > healthMax / 2 )
            attack(Game.getParty().getMember((int) (Math.random() * 3)));
        if ( health < healthMax / 2 )
            mist(Game.getParty().getMember(0), Game.getParty().getMember(1), Game.getParty().getMember(2));
    }
    

    
    public boolean isAlive(){
        return isAlive();
    }
    
    
    
    public void attack (Combatant target) {
        int damage = strength * 10  - target.getResistance() * 5;
        target.setHealth( target.getHealth() - damage );
    
    }
    
    public void mist(Combatant teammate1, Combatant teammate2, Combatant teammate3){
        //mist, shrouds battlefield in mist, lowering the accuracy of all heroes
        mana -= 15;
        teammate1.setAccuracy((teammate1.getAccuracy() - 20));
        teammate2.setAccuracy((teammate2.getAccuracy() - 20));
        teammate3.setAccuracy((teammate3.getAccuracy() - 20));
         }
    
    public int sweep(){
        //hits all enemies
        mana -= 20;
        int damage = 3 * ((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength())));
        return damage;
        
    }
    
    public int hail(){
        //tsunami, hits all enemies
        mana -= 20;
        element = "ice";
         int damage = 3 * ((int)(Math.random() * ((getIntelligence()) - (getIntelligence() - 10)) +(getIntelligence() - 20)));
        return damage;
        
    }
    
}
    
