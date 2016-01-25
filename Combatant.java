public abstract class Combatant {
    
    //TO DO getCombatant() method
    
    
    //Instance Variables
    protected String name;
    protected String element;          //element of skill/monster
    protected String weakness;         //weakness of a monster
    protected int level;
    protected int health;              //changes during battle
    protected int healthMax;           //stays constant
    protected int mana;                //changes during battle
    protected int manaMax;             //stays constant
    protected int strength;            //Will determine how powerful basic attacks and certains skills are
    protected int resistance ;         //Will reduce damage that is calculated using strength
    protected int intelligence;        //Like strength, but for magic
    protected int wisdom;              //like resistance, but for intelligence
    protected int accuracy;            //likeliness to hit the enemy
    protected int speed;               //how high in priority your move is
    protected int exp;                 //experience of the player and monster (given to player after battle)
    protected Story currentStory;
    
    public abstract void attack (Combatant target);
    
    public boolean isAlive () {
        return (health > 0);
    }
    
    //Mutators
    public void setName (String name) {
        this.name = name;
    }
    
    public void setLevel (int level) {
        this.level = level;
    }

    public void setHealth (int health) {
        this.health = health;
    }
    
    public void setHealthMax (int healthMax) {
        this.healthMax = healthMax;
    }
    
    public void setMana (int mana) {
        this.mana = mana;
    }
    
    public void setManaMax (int manaMax) {
        this.manaMax = manaMax;
    }
    
    public void setStrength (int strength) {
        this.strength = strength;
    }
    
    public void setResistance (int resistance) {
    this.resistance = resistance;
    }
    
    public void setIntelligence (int intelligence) {
        this.intelligence = intelligence;
    }
    
    public void setWisdom (int wisdom){
        this.wisdom = wisdom;
    }
    
    public void setAccuracy (int accuracy) {
        this.accuracy = accuracy;
    }
    
    public void setSpeed (int speed) {
        this.speed = speed;
    }
    
    public void setExp (int exp) {
        this.exp = exp;
    }
    
    public void setElement(String element){
        this.element = element;
    }
    
    public void setWeakness(String weakness){
        this.weakness = weakness;
    }
    
    //Accessors
    public String getName () {
        return name;
    }
    
    public String getElement() {
        return element;

    }
    
    public String getWeakness() {
        return weakness;
    }
    
     
    public int getLevel () {
        return level;
    }
    
    public int getHealth () {
        return health;
    } 

    public int getHealthMax () {
        return healthMax;
    }
    
    public int getMana () {
        return mana;
    }

    public int getManaMax () {
        return manaMax;
    }
    
    public int getStrength () {
        return strength;
    }
    
    public int getResistance () {
        return resistance;
    }
    
    public int getIntelligence () {
        return intelligence;
    }
    
    public int getWisdom () {
        return wisdom;
    }
    
    public int getAccuracy () {
        return accuracy;
    }
    
    public int getSpeed () {
        return speed;
    }
    
    public int getExp () {
        return exp;
    }

}//End
