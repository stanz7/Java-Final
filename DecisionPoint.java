import java.util.Scanner;

public class DecisionPoint {
    
    public Scanner user;
    public String decisionText;
    public String[] options = new String[3];
    public Outcome response;
    
    public DecisionPoint( String decision, String option1, String option2, String option3, Outcome outcome ) {
        decisionText = decision;
        
        options[0] = option1;
        options[1] = option2;
        options[2] = option3;
        
        response = outcome;
    }
    
    public String getDecisionAndOptions() {
        return decisionText + "\n"
                + options[0] + "\n"
                + options[1] + "\n"
                + options[2] + "\n";
    }
    
    public String getResponse( String userInput ) {
        return response.getResponse( userInput );
    }
    
    public int getMoralityChange( String userInput ) {
        return response.getMoralityChange( userInput );
    }
    
    public int  makeDecision() {
        System.out.println( getDecisionAndOptions() );
        String answer = Game.getScanner().nextLine().toUpperCase();
        System.out.println( getResponse( answer ) );
        return getMoralityChange( answer );
    }
}