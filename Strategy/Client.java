package Strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println(context.execute(2,3));

        context = new Context(new Substract());
        System.out.println(context.execute(7,5));
    }
}
