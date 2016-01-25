//Team M I L K

public class Hero extends Character {
    //classes
    protected int EXP;
    protected int Rep;

    public int getEXP(){
	    return EXP;
    }
    public int getRep(){
	    return Rep;
    }
    

    
    public int lowerRep(int gRep){
    	return Rep - gRep;
    }

    public int gainRep(int gRep){
    	return Rep + gRep;
    }


    
    public int gainEXP(int gExp){
	    retunr EXP + gExp
    }

}