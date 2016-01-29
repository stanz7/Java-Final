import java.util.Scanner;

public class SetCharacter {

    Character character;
    String name, role;
    String namePrompt, rolePrompt;
    
    public SetCharacter( int memberNum, String namePromptText, String rolePromptText ) {
        character = Game.getParty.getMember( memberNum );
        namePrompt = namePromptText;
        rolePrompt = rolePromptText;
    }
    
    public void setCharacterPoint() {
        System.out.println( namePrompt );
        String answer = Game.getScanner().nextLine().toUpperCase();
        character.setName( answer );
        System.out.println( rolePrompt );
        answer = Game.getScanner().nextLine().toUpperCase();
        //character.setC -- HOW ARE WE SETTING THE ROLE NOW???
    }
    
    /*
    public void setName() {
        System.out.println( namePrompt );
        String userInput = Game.getScanner().nextLine().toUpperCase();
        name = userInput;
    }
    
    public void setClass() {
        System.out.println( rolePrompt );
        String userInput = Game.getScanner().nextLine().toUpperCase();
        role = userInput;
    }
    
    public String decodeRole( String code ) {
        
    }
    
    public String getName() {
        return name;
    }
    
    public String getRole() {
        return role;
    }
    */
}