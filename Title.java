import java.util.Scanner;

public class Title extends Mode {
    
    protected static Scanner user;
    protected static String answer;
    protected static  boolean pause;
    
    public Title () {
        user = new Scanner(System.in);
        answer = "";
        pause = false;
    }
    
    public static  void displayTitle () {
        title();
        if ( pause == true )
            back();
        if ( pause == false )
            start();
    }
    
    public static void title () {
        //title
        System.out.println("Working Title : An RPG");
        System.out.println("By Jason Dong, Leith Conybeare, Stanley Zeng\n");
    }
        
    public static void start () {
        //start
        while ( !answer.equals("yes") && !answer.equals("no") ) {
            System.out.println("Enter the story of Working Title?");
            answer = user.nextLine();
            if ()
        }
    }
    
    public static void prelude () {
        //short description of plot displayed after starting game
        System.out.prinln("Story blah blah blah...");
        /*
        Technology advance society
        Running out of resources
        Find new infinite power source
        Tessalact falls from the sky
        breaks into three peaces
        heroes set out to find them
        */
    }
    
    public static void back () {
        //return
        while ( !answer.equals("yes") && !answer.equals("no") ) {
            System.out.println("Return to the story?");
            answer = user.nextLine();
        }
    }
}
