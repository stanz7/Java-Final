public class Ogre extends Combatant implements NonPlayable {
    
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
    
        public void behavior () {
        if ( Game.getCombat().getTurnCounter() % 3 == 0 )
            BluntSmash(Game.getParty().getMember((int) (Math.random() * 3)));
        if ( health > healthMax / 2 )
            attack( Game.getParty().getMember( (int) (Math.random() * 3) ) );
        if ( health < healthMax / 2 )
            BluntSmash(Game.getParty().getMember((int) (Math.random() * 3)));
    }
    
    public boolean isAlive(){
        return isAlive();
    }
    
    
    
    public void attack(Combatant target){
        int damage = strength * 10  - target.getResistance() * 5;
        target.setHealth( target.getHealth() - damage );
    
    }
    
    public void BluntSmash(Combatant target){
        mana -= 5;
        int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 10)) + (getStrength()))) * 3;
        target.setHealth( target.getHealth() - damage );
        

    }
}
