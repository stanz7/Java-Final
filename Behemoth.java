public class Behemoth extends Combatant implements NonPlayable{
    //boss??
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
        speed = 1;
        accuracy = 20;
        exp = 100;
        //goldReward = (int)(Math.random() * 250 - 80 + 250);

    }
    
    public void behavior () {
        if ( Game.getCombat().getTurnCounter() % 3 == 0 )
            sweep();
        if ( health > healthMax / 2 )
            attack( Game.getParty().getMember( (int) (Math.random() * 3) ) );
        if ( health < healthMax / 2 )
            buff();
    }
    
    public void attack (Combatant target) {
        int damage = strength * 10  - target.getResistance() * 5;
        target.setHealth( target.getHealth() - damage );
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

