import java.util.ArrayList;
import java.util.Scanner;

public class Attack extends Action {
    
    public Attack (Combatant user,ArrayList<Combatant> targets) {
        super (user,targets);
        name = "ATTACK";
    }
    
    public void attack () {
        Scanner prompt = new Scanner(System.in);
        
        if (user instanceof NonPlayable) {
            if ( targets.size() == 1 ) {
                target = targets.get(0);
                damage = calculator();
                target.setHealth(target.getHealth()-damage);
            }
            if ( targets.size() > 1 ) {
                target = targets.get( (int) ( Math.random() * targets.size() ) );
                damage = calculator();
                target.setHealth(target.getHealth()-damage);
            }
        }
        if (user instanceof Playable) {
            if ( targets.size() == 1 ) {
                target = targets.get(0);
                damage = calculator();
                target.setHealth(target.getHealth()-damage);
            }
            if ( targets.size() > 1 ) {
                System.out.println("Who?");
                int index = prompt.nextInt();
                target = targets.get(index);
                damage = calculator();
                target.setHealth(target.getHealth()-damage);
            }
        }
    }
    
    public int calculator () {
        int difference  = user.getAccuracy() - target.getSpeed();
        int chance = (int) ( 100 / Math.pow( 2 , Math.abs( difference ) ) );
        int result = (int) ( Math.random() * (100-1) + 1 );
        
        if (difference < 0 && result > chance){
            System.out.println("Attack missed");
            return 0;
        }
        
        int base = (int)( user.getStrength() * (Math.random() + 0.25) );
        int reduction = (int) (target.getResistance() * 0.75);
        
        if (difference > 0 && result < chance)
            return 2 * (base - reduction);
            
        else
            return (base - reduction);  
    }
        
}
