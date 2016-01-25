import java.util.ArrayList;

public class Inventory {
    
    protected ArrayList<Potion> potions;
    protected ArrayList<Food> foods;
    protected ArrayList<Drink> drinks;
    
    public Inventory () {
        potions = new ArrayList();
        foods = new ArrayList();
        drinks = new ArrayList();
    }
    
    public void addPotion (Potion potion) {
        potions.add(potion);
    }
    
    public void addFood (Food food) {
        foods.add(food);
    }
    
    public void addDrink (Drink drink) {
        drinks.add(drink);
    }
    
    
}
