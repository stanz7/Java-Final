public Mage extends Playable{
   
   public Mage(){ //default constructor
        Rep = 0;
        EXP = 0;
        
        
    }
    
    public int Heal(Character target){
    // Heals a target
    int a = target.getHealth();
    target.setHealth(a += 25);
    mana -= 20;
    }   

    public int Fire(){
        //fireball!!!
        Mage.setAttribute("fire") ;
        int damage = 5 * ((int)(Math.random() * ((Mage.getIntelligence()) - (Mage.getIntelligence() - 20)) +(Mage.getIntelligence() - 20)));
        return damage;
        mana -= 20;
    }
    
    public int Ice(){
        //ICEEEE
        Mage.setAttribute("ice");
        int damage = 5 * ((int)(Math.random() * ((Mage.getIntelligence()) - (Mage.getIntelligence() - 20)) +(Mage.getIntelligence() - 20)));
        return damage;
        mana -= 20;
    }
    
    public int NormalAttack(){
    attack();    
    }

    
}
