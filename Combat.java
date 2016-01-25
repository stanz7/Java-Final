import java.util.ArrayList;

public class Combat {
    
    protected static String answer = "";
    
    protected Team enemies;
    protected ArrayList<Combatant> turnOrder;
    protected int turnCounter;

    public Combat () {
        enemies = new Team();
        turnOrder = new ArrayList();
        turnCounter = 0;
    }
    
    public void reset () {
        Game.combat = new Combat();
    }
    
    public void battle () {
        //if both sides are alive, then continue battle
        while (Game.getParty().defeated() || enemies.defeated()) {
            
            //determine turn order
            turnOrderP();
            
            //if enemy, then allow AI to make decision
            if (turnOrder.get(0) instanceof NonPlayable)
                System.out.println("1");//turnOrder.get(0).behavior();
                
            //else, prompt player to make move
            else
                System.out.println("What will " + turnOrder.get(0).getName() + " do?");
                System.out.println("A: Attack");
                System.out.println("B: Skill");
                System.out.println("A: Item");
                System.out.println("A: Defend");
                
                answer = Game.getScanner().nextLine().toUpperCase();
                
                if ( answer.equals("A") ) {
                    
                    System.out.println("Who?");
                    System.out.println("Enter the number corresponding to the target");
                    
                    int target = 1;
                    for ( Combatant combatant : enemies.getMembers() ) {
                        System.out.println(target + ": " + combatant.getName() );
                        target++;
                    }
                    
                    answer = Game.getScanner().nextLine();
                    
                    turnOrder.get(0).attack(enemies.getMember(Integer.parseInt(answer)));
                }
            
            
            turnCounter++;
        }
    }
    
    public void battle01 () {
        reset();
        Behemoth behemoth = new Behemoth();
        enemies.add(behemoth);
        battle();
    }
    
    public void turnOrderP () {
        //adds all combatants to list
        for (Combatant combatant : Game.getParty().living()) {
            turnOrder.add(combatant);
        }
        for (Combatant combatant : enemies.living()) {
            turnOrder.add(combatant);
        }
        
        //orders combatants by speed
        for ( int i = 1 ; i < turnOrder.size() ; i++ ) {
            Combatant hold = turnOrder.get(i);
            int divide;
            for ( divide = i - 1 ; divide >= 0 && hold.getSpeed() < turnOrder.get(divide).getSpeed() ; divide--) {
                turnOrder.set( divide + 1 , turnOrder.get(divide) );
            }
            turnOrder.set(divide + 1 , hold);
        }
    }
    
    public int getTurnCounter () {
        return turnCounter;
    }
    
    /*
    public void dTurnOrder () {
        //first row is all combatants in battle
        //second is the speed of each combatant
        turnOrder.get(0) = new ArrayList<Combatant>();
        turnOrder.get(1) = new ArrayList<int>();
        
        //adds every hero, enemy, and their speed to turnOrder
        for (Combatant member : party.living())
            turnOrder[0].add(member);
        for (Combatant member : enemies.living())
            turnOrder[0].add(member);
        for (Combatant combatant: turnOrder[0])
            turnOrder[1].add(combatant.getSpeed());
            
        //insertion sort that's been modified to swap columns    
        for (int i = 1 ; i < turnOrder[1].size() ; i++) {
            for (int j = i ; j > 0 ; j--) {
                if (turnOrder[1].get(i).compareTo(turnOrder[1].get(i-1)) < 0) {
                    turnOrder[0].set( i , turnOrder[0].set(i-1) , turnOrder[0].get(i) );
                    turnOrder[1].set( i , turnOrder[1].set(i-1) , turnOrder[1].get(i) );
                }
            }
        }
        
    }
    */
    
    /*
    public static void main (String[] args) {
        Combat test = new Combat();
        test.battle01();
    }
    */
    
}
