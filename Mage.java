public Mage extends Hero{
   
   public Mage(){ //default constructor
        Rep = 0;
        EXP = 0;
        
        
    }
    
    public int Heal(Character target){
    // Heals a target
    int a = target.getHealth();
    target.setHealth(a += 25);
    }   

    public int Fire(){
        //fireball!!!
        int damage = (Mage.getIntelligence() * 15)
        
    }
    
    public int Ice(){
        //ICEEEE
        
    }
    
    public int NormalAttack(){
        //normal attack.. expect this to be pretty weak
    }

    
}
