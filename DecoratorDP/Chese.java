package DecoratorDP;

public class Chese extends Topping {
    Pizza pizza;
    public Chese(Pizza pizza){
         this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription()+ ", Chese";
    }
    public int getCost(){
        return pizza.getCost()+30;
    }
}
