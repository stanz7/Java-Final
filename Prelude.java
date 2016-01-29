public class Prelude {
    
    public String backstory;
    public SetCharacter[] setPoints = new SetCharacter[3];
    
    public Prelude( String backstoryText, SetCharacter char1, SetCharacter char2, SetCharacter char3 ) {
        backstory = backstoryText;
        setPoints[0] = char1;
        setPoints[1] = char2;
        setPoints[2] = char3;
    }
    
    public void getPreludeAndSetPoints() {
        System.out.println( backstory );
        
        setPoints[0].setCharacterPoint();
        setPoints[1].setCharacterPoint();
        setPoints[2].setCharacterPoint();
    }
    
}