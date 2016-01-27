public class Outcome {

    public int[] moralityChange = new int[3];
    public String[] responses = new String[3];
    
    public Outcome( String positive, String neutral, String negative ) {
        responses[0] = positive;
        responses[1] = neutral;
        responses[2] = negative;
              
        moralityChange[0] = 1;
        moralityChange[1] = 0;
        moralityChange[2] = -1;
    }
          
    //returns a number representing an index, that can be used in getMorality() and getResponseText()
    public int getRepresentativeIndex( String choice ) {
        //user chose the positive option
        if ( choice.equals("A") ) 
            return 0;
        //user chose the neutral option
        else if ( choice.equals("B") ) 
            return 1;
        //user chose the negative option
        else
            return 2;
    }
    
    //returns new morality value based on the user's input from getRepresentativeIndex
    public int getMoralityChange( String choice ) {
        int index = getRepresentativeIndex( choice );
        return moralityChange[index];
    }
    
    //returns the text response to be displayed, based on user input
    public String getResponse( String choice ) { 
        int index = getRepresentativeIndex( choice );
        return responses[index]; 
    }
    
    /*
    //returns new morality value and the corresponding output
    public int getChangeWithResponse( String choice, int value ) {
        int index = getRepresentativeIndex( choice );
        return getNewMorality( index, value );
    }
    */
    
    /* --- TO RUN THIS CODE ---
    
    Outcome outcomeAtThisPoint("good-response", "neutral-response", "bwahahahaha" );
    morality = outcomeAtThisPoint.getMoralityWithResponse( answer, morality );
    */
}