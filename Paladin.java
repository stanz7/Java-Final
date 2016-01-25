public class Paladin extends Playable {
    
    protected Story story;
    
    public Paladin(String name) {
        setName(name);
        setHealth( 100 );
    }
    
    public Paladin( String name, Story input ) {
        setName( name );
        setHealth( 100 );
        story = input;
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
    
    //deals weak damage and strengthens party
    public int righteousHammer( Combatant target) {
        mana -= 10;
        Combatant mem1 = new Combatant();
        mem1 = story.getParty().getMember(0);
        Combatant mem2 = new Combatant();
        mem2 = story.getParty().getMember(1);
        mem1.setStrength( mem1.getStrength() + 10 );
        mem2.setStrength( mem2.getStrength() + 10 );
        int damage = (int)(Math.random() * getStrength() - (getStrength() - 20) + (getStrength() - 20));
        return damage;
    }
    
    
}