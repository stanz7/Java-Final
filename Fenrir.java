public class Fenrir extends Combatant implements NonPlayable{
    
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
    
    public void behavior () {
        if ( Game.getCombat().getTurnCounter() % 3 == 0 )
            slash(Game.getParty().getMember((int) (Math.random() * 3)));
        if ( health > healthMax / 2 )
            attack( Game.getParty().getMember( (int) (Math.random() * 3) ) );
        if ( health < healthMax / 2 )
            slash(Game.getParty().getMember((int) (Math.random() * 3)));
    }
    
    
    public void attack (Combatant target) {
        int damage = strength * 10  - target.getResistance() * 5;
        target.setHealth( target.getHealth() - damage );
    }
    
    public int slash(Combatant target){
        element = "ice";
        mana -= 10;
        int damage = 2*((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength())));
        return damage;
        
    }
}
