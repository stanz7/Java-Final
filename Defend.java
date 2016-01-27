import java.util.ArrayList;
import java.util.Scanner;

public class Defend extends Action{
    
    public Defend (Combatant user,ArrayList<Combatant> targets){
        super (user,targets);
        name = "DEFEND";
    }
    
    public void defend () {
        
        
        if (user instanceof Combatant) {
            user.setResistance(user.getResistance() + (int)(Math.random() * (20 - 10) + 10));
        }
        if (user instanceof Combatant){
        
            user.setResistance(user.getResistance() + (int)(Math.random() * (20 - 10) + 10));
        }   
    }
}
