import java.util.ArrayList;

public class Enemies extends Team {
    
    protected ArrayList<NonPlayable> enemies;
    protected int totalExp;
    protected int totalGold;
    
/*

    private boolean canon;

    public void setCanon (boolean canon) {
        this.canon = canon;
    }
    
    public canon getCanon () {
        return canon;
    }
    
*/
    
    //Create a team
    public void create (ArrayList<NonPlayable> enemies) {
        this.enemies = enemies;
    }
    
    //Add an enemy to the team
    public void join (String name) {
        NonPlayable name = new NonPlayable(name);
        enemies.add(name);
    }
    
    public void setTotalExp () {
        for (NonPlayable enemy : enemies) {
            totalExp = totalExp + enemy.getExp();
        }
    }
    
    public int getTotalExp () {
        return totalExp;
    }
    
    public void setTotalGold () {
        for (NonPlayable enemy : enemies) {
            totalGold = totalGold + enemy.getGoldReward();
        }
    }
    
    public int getTotalGold () {
        return totalGold;
    }
}
