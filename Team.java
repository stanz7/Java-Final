import java.util.ArrayList;

public class Team {
    
    //Array of either NonPlayables or Playables
    protected ArrayList<Combatant> members;
    //Inventory of the team
    protected Inventory inventory;
    
    public Team () {
        members = new ArrayList();
        inventory = new Inventory();
    }
    
    public ArrayList<Combatant> getMembers () {
        return members;
    }
    
    public void add (Combatant combatant) {
        members.add(combatant);
    }
    
    public Combatant getMember (int index) {
        return members.get(index);
    }
   
   public boolean defeated () {
        for (Combatant member : members) {
            if (member.isAlive())
                return false;
        }
        return true;
   }
  
   
    //creates an ArrayList of all living members
    public ArrayList<Combatant> living () {
        ArrayList<Combatant> living = new ArrayList<Combatant>();
        for (Combatant combatant : members) {
            if (combatant.isAlive())
                living.add(combatant);
        }
        return living;
    }
    
}
