package DecoratorDP;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza() ;

        Pizza pizza1 = new FarmHouse();
        
        //FarmHouse Pizza with Tomato
        Pizza pizza2 = new Tomato(pizza1);

        // FarmHouse Pizza with Tomato and,Chese
        Pizza pizza3 = new Chese(pizza2);

        System.out.println(pizza.getDescription() + " Cost is: " + pizza.getCost());
        System.out.println(pizza1.getDescription() + " Cost is: " + pizza1.getCost());
        System.out.println(pizza2.getDescription() + " Cost is: " + pizza2.getCost());
        System.out.println(pizza3.getDescription() + " Cost is: " + pizza3.getCost());
    }


    
}
