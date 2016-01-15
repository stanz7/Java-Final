class Character {
    
//Superclass for all entities in the game that participate in combat
    
    //Instance Variables
    public String name;
    public int currentHealth;
    public int maxHealth;
    public int currentMana;
    private int maxMana;
    private int strength;           //Will determine how powerful basic attacks and certains skills are
    private int resistance ;        //Will reduce damage that is calculated using strength
    private int intelligence;       //Like strength, but for magic
    private int wisdom;             //like resistance, but for intelligence
    private int accuracy;           
    private int speed;            
    
    //Constructors
    public Character () {
        name = "";
        maxHealth = 1;
        currentHealth = 1;
        maxMana = 1;
        currentMana = 1;
        strength = 1;
        resistance = 1;
        intelligence = 1;
        wisdom = 1;
        accuracy = 1;
        speed = 1;
    }
    
    public Character (String name) {
        this();
        setName(name);
    }
    
    public Character (String name,int maxHealth,int maxMana, int strength, int resistance, int intelligence, int wisdom, int accuracy, int speed) {
    this(name);
    setMaxHealth(maxHealth);
    setCurrentHealth(maxHealth);
    setMaxMana(maxMana);
    setCurrentMana(maxMana);
    setStrength(strength);
    setResistance(resistance);
    setIntelligence(intelligence);
    setWisdom(wisdom);
    setAccuracy(accuracy);
    setSpeed(speed);
    }
    
    //Mutators
    public void setName (String name) {
            this.name = name;
    }

    public void setMaxHealth (int maxHealth) {
        this.maxHealth = maxHealth;
    }
    
    public void setCurrentHealth (int currentHealth) {
        this.currentHealth = currentHealth;
    }
    
    public void setMaxMana (int maxMana) {
        this.maxMana = maxMana;
    }
    
    public void setCurrentMana (int currentMana) {
        this.currentMana = currentMana;
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
    
    //Accessors
    public String getName () {
        return name;
    }
    
    public int getMaxHealth () {
        return maxHealth;
    } 

    public int getCurrentHealth () {
        return currentHealth;
    }
    
    public int getMaxMana () {
        return maxMana;
    }

    public int getCurrentMana () {
        return currentMana;
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
    
    public String toString () {
        String returnString = "";
        returnString += name + "\n";
        returnString += "Health: " + currentHealth + "/" +  maxHealth + "\n";
        returnString += "Mana: " + currentMana + "/" + maxMana + "\n";
        returnString += "Strength: " + strength + "\n";
        returnString += "Resistance: " + resistance + "\n";
        returnString += "Intelligence: " + intelligence + "\n";
        returnString += "Wisdom: " + wisdom + "\n";
        returnString += "Accuracy: " + accuracy + "\n";
        returnString += "Speed: " + speed;
        return returnString;
        
    }
    
    //Methods
    public void attack (Character target) {
        int damage = atkDmgCalc(this,target);
        target.takeDamage(damage);
        attackSummary(this,target,damage);
    }
    
    public int atkDmgCalc (Character attacker,Character target) {
        double randomModifier = Math.random() * (1.20 - 0.80) + 0.80;   //to randomize damage, but within reasonable range 
        if (miss(attacker,target)){ //if miss is true, then no damage is dealt
            System.out.println(attacker.getName() + " missed!");
            return 0;
        }
        else {
            int damage = (strength * 10) - (target.getResistance() * 7);
            if (critical(attacker,target)) { //if critical is true, then damage is doubled
                damage = damage * 2;
                System.out.println("The attack was a critical hit!");
            }
            damage = (int)(damage * randomModifier);
            return damage;
        }
    }
    
    public boolean miss (Character attacker,Character target) {
        double chance = (target.getSpeed() - attacker.getAccuracy()) * 2;
        double result  = Math.random() * (100 - 1) + 1;
        if (result >= 99 )  //For the lucky people, if result is 99 or 100 attack always hits no matter speed or accuracy
            return true;
        else if ( result > chance + 5)
            return false;
        else
            return true;
    }
    
    public boolean critical (Character attacker,Character target) {
        double chance = (attacker.getAccuracy() - target.getSpeed()) * 1.5;
        double result  = Math.random() * (100 - 1) + 1;
        if (result == 100) //for the super lucky people
            return true;
        else if ( result > chance + 3)
            return false;
        else
            return true;
    }
    
    public void takeDamage (int damage) {
        if (currentHealth - damage < 0)
            currentHealth = 0;
        else
            currentHealth =currentHealth - damage;
    }
    
    public void attackSummary (Character attacker,Character target, int damage) {
        String summary = attacker.getName() + " dealt " + damage + " damage to " + target.getName();
        System.out.println(summary);
    }
    
    public static void main (String[] args){
        
        //TEST//
        Character Jason = new Character("Jason",100,15,2,1,1,1,3,2);
        Character Stanley = new Character("Stanley",200,5,3,3,1,1,2,1);
        Character Leith = new Character("Leith",75,30,1,1,3,3,1,1);
        
        Character Army_Grunt = new Character("Army Grunt",200,0,2,2,1,1,1,1);
        
        //System.out.println(Jason.toString());
        //System.out.println(Army_Grunt.toString());
        
        Jason.attack(Army_Grunt);
    }
}
