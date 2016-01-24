public class Paladin extends Playable {
    
    //Something in this file is causing an exception throw*
    
    public Paladin(String name) {
        setName(name);
        setHealth( 100 );
        
        /*
        setHealthMax( 100 );
        setManaMax( 100 );
        setMana( 100 );
        setStrength( 50 );
        setResistance( 50 );
        setIntelligence( 80 );
        setWisdom( 80 );
        setAccuracy( 75 );
        setSpeed( 10 );
        setExp( 0 );
        setLevel( 0 );
        */
    }
    //deals damage
    public int strike() {
        int damage = (int)(Math.random() * getStrength() - (getStrength() - 20) + (getStrength() - 20));
        return damage;
    }
    
    //deals damage and reduces resistance
    public int smite( Combatant target ) {
        mana -= 10;
        target.setResistance( target.getResistance() - 20 );
        int damage = (int)(Math.random() * getStrength() - (getStrength() - 20) + (getStrength() - 20));
        return damage;    
    }
    
    //heals group of teammates and boosts resistance
    public void divineIntervention( Combatant teammate1, Combatant teammate2 ) {
        mana -= 10;
        teammate1.setHealth( teammate1.getHealth() + 25 );
        teammate1.setResistance( teammate1.getResistance() + 10 );
        teammate2.setHealth( teammate2.getHealth() + 25 );
        teammate2.setResistance( teammate2.getResistance() + 10 );
    }
    
    /*CANT DO THIS WITHOUT BEING ABLE TO REFER TO THE CURRENT STORY
    //deals weak damage and strengthens party
    public int righteousHammer( Combatant target) {
        mana -= 10;
        currentStory.getMember(0).setStrength( currentStory.getMember(0).getStrength() + 10 );
        Team.getMember(1).setStrength( Team.getMember(1).getStrength() + 10 );
        setStrength( getStrength() + 10 );
        int damage = (int)(Math.random() * getStrength() - (getStrength() - 20) + (getStrength() - 20));
        return damage;
    }
    */
    
    
}