package CompositeDP;

public class Client {
    public static void main(String[] args) {
        Leaf l1= new Leaf("l1", 12);
        Leaf l2= new Leaf("l2", 13);
        Leaf l3= new Leaf("l3", 14);
        Leaf l4= new Leaf("l4", 15);

        Composite c1= new Composite("Shovon");
        Composite c2= new Composite("Mustakin");
       // Composite c3= new Composite("Shovon");
         c1.addComponent(l1);
         c1.addComponent(l2);
         c2.addComponent(l3);
         c2.addComponent(l4);

         c1.display();
         c2.display();

       

    }
}
