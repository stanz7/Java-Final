public class ChapterIntro {
    
    public String[] intros = new String[3];
    float morality;
    
    public ChapterIntro( String posIntro, String neuIntro, String negIntro, int currentMorality, int history ) {
        intros[0] = posIntro;
        intros[1] = neuIntro;
        intros[2] = negIntro;
        morality = currentMorality / ( (float) history );
    }
    
    //finds the morality level and returns appropriate intro
    public String getIntro() {
        if( morality > (1 / 3.0) ) 
            return intros[0];
        else if( morality < (-1 / 3.0) )
            return intros[2];
        else
            return intros[1];
    }
    
}