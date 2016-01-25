public class Slime extends Combatant implements NonPlayable {
    
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
    
    public void behavior () {
        if ( Game.getCombat().getTurnCounter() % 3 == 0 )
            SlimeSmash(Game.getParty().getMember((int) (Math.random() * 3)));
        if ( health > healthMax / 2 )
            attack( Game.getParty().getMember( (int) (Math.random() * 3) ) );
        if ( health < healthMax / 2 )
            SlimeSmash(Game.getParty().getMember((int) (Math.random() * 3)));
    }
    
    
    public boolean isAlive(){
        return isAlive();
    }
    
    
    
        public void attack(Combatant target){
        int damage = strength * 10  - target.getResistance() * 5;
        target.setHealth( target.getHealth() - damage );
    
    }
    
    public void SlimeSmash(Combatant target){
        mana -= 5;
        int damage = strength * 12  - target.getResistance() * 5;
        target.setHealth( target.getHealth() - damage );
    
}
}
