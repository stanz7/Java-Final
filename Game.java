import java.util.Scanner;

public class Game {
    
    //Game engine
    protected static Game game;
    protected static Story story;
    protected static Combat combat;
    protected static Team party;
    protected static Scanner user;
    
    public Game () {
        story = new Story();
        combat = new Combat();
        party = new Team();
        user = new Scanner(System.in);
        Combatant member1 = new Warrior("temp");
        Combatant member2 = new Warrior("temp");
        Combatant member3 = new Warrior("temp");
        party.add(member1);
        party.add(member2);
        party.add(member3);
        story.prelude();
    }
    
    //Creates a new instance of the game 
    public static void newGame () {
        game = new Game();
    }
    
    public static void title () {
        System.out.println("Working Title");
        System.out.println("By Jason Dong, Leith Conybeare, & Stanley Zeng");
        System.out.println("Team MILK of period 5\n");
    }
    
    public static Game getGame () {
        return game;
    }
    
    public static Story getStory () {
        return story;
    }
    
    public static Combat getCombat () {
        return combat;
    }
    
    public static Team getParty () {
        return party;
    }
    
    public static Scanner getScanner () {
        return user;
    }
    
    public static void main (String[] args) {
        title();
        newGame();
    }
    
}
