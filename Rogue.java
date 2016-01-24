public class Rogue extends Playable {
    
    public Rogue (String name) {
        setName(name);
        setHealth(150);
    }
    
    public int doubleStab(Character target){
      mana -= 8;
      int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20)))*2;
      return damage;
    }
    
    public int savageBlow(Character target){
        mana -= 15;
        int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 20)) +(getStrength() - 20)))*6;
        return damage;
    }
    
    public void darkSight(){
        mana -= 20;
        setAccuracy(100);
        setSpeed(50);
    }
    
    public int attack(){
        int damage = ((int)(Math.random() * (getStrength() - (getStrength() - 5)) +(getStrength() - 5)));
        return damage;
    }
    
    
}
