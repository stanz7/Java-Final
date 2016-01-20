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
        }
    }
    
    public static void back () {
        //return
        while ( !answer.equals("yes") && !answer.equals("no") ) {
            System.out.println("Return to the story?");
            answer = user.nextLine();
        }
    }
}