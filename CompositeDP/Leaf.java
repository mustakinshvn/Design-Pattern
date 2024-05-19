package CompositeDP;

public class Leaf implements FileSystemComponent {

    private String name;
    private int price;
    
    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println(name + " " + price);
    }
}
