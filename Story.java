import java.util.Scanner;

public class Story {

    private static String answer = "";
    
    public int morality;
    
    public Story () {
        setMorality(0);
    }
    
    //displays the introductory story and prompts team creation
    //returns the playable team
    public void prelude() {
        System.out.println("\t\"Long ago, a magic artifact washed up on the shores of an island named Zaman, near a small village.");
        System.out.println("The village people, who lived simple and modest lives, had had no idea what it was and where it came from.");
        System.out.println("They brought the magic artifact to the center of their village and left it there, unsure what to do with it.");
        System.out.println("That night when all the village people were asleep, the magic artifact suddenly began to eminate a brilliant light.");
        System.out.println("The villagers were frightened, but also curious so they crept out of their huts one by one and gathered around the artifact.");
        System.out.println("One courageous man approached the magical artifact and placed his hand onto it.");
        System.out.println("In an instance, the light grew in intensity and the man felt a surge of power rushing through his body!");
        System.out.println("The light eventually dimmed and it had seemed as if nothing had occured. All the villagers returned to their huts, confused and unimpressed.");
        System.out.println("The next day, while the man was hunting for his next meal, a woodland wolf confronted him.");
        System.out.println("Just as the wold pounced, the man, who raised his hands in defense, shot forth a bolt of lightning.");
        System.out.println("Shocked, the man raced back to the village and demonstrated his newfound talent to all the villagers.");
        System.out.println("All the excited villagers gathered around the magical artifact, once more, and took turns touching the artifact.");
        System.out.println("After each villager touched the artifact, each one would demonstrate their newfound magic abilities.");
        System.out.println("One man could freeze water and another girl could conjure fire. The whole village had magical abilties now.");
        System.out.println("Using their magic, the village grew into a powerful and wealthy city named Brownport, after the man who summoned lightning from his hands.\"\n");
        nameSet();
    }
    
    public void nameSet() {
        System.out.println("\"Wow! Is that story true, Grandma?\" said... (enter a name)");
        
        //Sets name of teammate1
        answer = Game.getScanner().nextLine();
        Game.getParty().getMember(0).setName(answer);
        
        System.out.println("\n\"Who knows! All I know is that it's the story my grandmother told me.");
        System.out.println("Every grandmother in this family told this story. Im just following tradition!\"");
        
        System.out.println("\n\"I can't believe our city discovered magic and that it was powerful and rich!\" said... (enter a name)");
        
        //Sets name of teammate2
        answer = Game.getScanner().nextLine();
        Game.getParty().getMember(1).setName(answer);
        
        System.out.println("\n\"Ha! There's no way a rundown city like ours was rich or poweful.\" said... (enter a name)");
        
        //Sets name of teammate3
        answer = Game.getScanner().nextLine();
        Game.getParty().getMember(2).setName(answer);
        
        System.out.println("\n\"You don't know that. We can still use magic so atleast part of the story is true.\" said " + Game.getParty().getMember(1).getName());
        
        System.out.println("\n\"Settle down, kids. It's late. Go get some rest. You'll need it for your field trip tomorrow!\" said Grandma");  
        
        classSet();
    }
    
    public void classSet() {
        System.out.println("\nThe Next Day...");
        
        System.out.println("\nProfessor: Good Morning, students. I hope your all well rested because we have a big day ahead of us.");
        System.out.println("Now that you've all reached an adequate age, it's time for you to contribute to society! Before we head");
        System.out.println("to Genkinabriar, I must tell you this: be careful! The archives say that the forest was once harmless,");
        System.out.println("but after Zaman's Sky Crystal shattered, the city withered and the forest overtook it. The beasts of");
        System.out.println("Genkinabriar have become fearsome now that Brownport no longer holds the crystal to amplify its magic.");
        System.out.println("Come, students. Choose your weapons. You will need to defend yourselves out in the wild.");
        
        for (Combatant member : Game.getParty().getMembers()) {
            System.out.println("\nWhat weapon will " + member.getName() + " choose?");
            System.out.println("(Selected the letter of your choice)");
            System.out.println("A: Sword");
            System.out.println("B: Staff");
            System.out.println("C: Bow");
            System.out.println("D: Dagger");
            System.out.println("E: Hammer");
            
            answer = Game.getScanner().nextLine().toUpperCase();
            
            if (answer.equals("A")) {
                member = new Warrior(member.getName());
                System.out.println( member.getName() + " chose the sword.");
            }
            if (answer.equals("B")) {
                member = new Mage(member.getName());
                System.out.println( member.getName() + " chose the staff.");
            }
            if (answer.equals("C")) {
                member = new Archer(member.getName());
                System.out.println( member.getName() + " chose the bow.");
            }
            if (answer.equals("D")) {
                member = new Rogue(member.getName());
                System.out.println( member.getName() + " chose the dagger.");
            }
            if (answer.equals("E")) {
                member = new Paladin(member.getName(), this);
                System.out.println( member.getName() + " chose the hammer.");
            }
 
        }
        
        Ch1();
    }
 
  
  
    //runs the first story block
    public static void Ch1() {
        //prints story
        System.out.println( "Story" );
       
        //DECISION POINT 1
        System.out.println( "decision 1" );
        System.out.println( "A: positive" );
        System.out.println( "B: neutral" );
        System.out.println( "C: negative" );
        
        answer = Game.getScanner().nextLine().toUpperCase();
        
        if( answer.equals("A") )
            morality++;
        //if ans is B, adds nothing to morality
        if( answer.equals("C") )
            morality--;
       
        //more story
        System.out.println( "more story" );
       
        //DECISION POINT 2
        System.out.println( "decision 2" );
        System.out.println( "A: positive" );
        System.out.println( "B: neutral" );
        System.out.println( "C: negative" );
        
        answer = Game.getScanner().nextLine().toUpperCase();
        
        if( answer.equals("A") )
            morality++;
        //if ans is B, adds nothing to morality
        if( answer.equals("C") )
            morality--;
            
        //even more story
        System.out.println( "even more story" );
        
        //DECISION POINT 3
        System.out.println( "decision 3" );
        System.out.println( "A: positive" );
        System.out.println( "B: neutral" );
        System.out.println( "C: negative" );
        
        answer = Game.getScanner().nextLine().toUpperCase();
        
        if( answer.equals("A") )
            morality++;
        //if ans is B, adds nothing to morality
        if( answer.equals("C") )
            morality--;
            
        //battle 1
    }
    
    /*
    
    //runs the second story block, then battle
    public static void Ch2() {
        
    }
    
    public static void Ch3() {
        
    }
    
    public static void Finale() {
        
    }
    
    */
    
    public void setMorality(int morality) {
        this.morality = morality;
    }
    
}