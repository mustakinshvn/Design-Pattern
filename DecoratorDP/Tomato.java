package DecoratorDP;

public class Tomato extends Topping {
    Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription(){
      return  pizza.getDescription() + ", Tomato";
    }

    public int getCost(){
        return pizza.getCost()+20;
    }
    
}
