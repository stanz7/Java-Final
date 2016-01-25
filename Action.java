import java.util.ArrayList;

public class Action {
    
    protected String name;
    protected Combatant user;
    protected ArrayList<Combatant> targets;
    protected Combatant target;
    protected int damage;
    
    public Action (Combatant user,ArrayList<Combatant> targets) {
        this.user = user;
        this.targets = targets;
    }
    
    public String getName () {
        return name;
    }
    
    public Combatant getUser () {
        return user;
    }
    
    public ArrayList<Combatant> getTargets () {
        return targets;
    }
    
    public Combatant getTarget () {
        return target;
    }
    
    public int getDamage () {
        return damage;
    }
    
}
