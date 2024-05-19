package BuilderDP;

public class Main {
    public static void main(String[] args) {
        Products product = new Products.Builder()
            .setPart1("TV")
            .setPart2("AC")
            .setPart3("Fan")
            .build();

        System.out.println("Product part1: " + product.getPart1());
        System.out.println("Product part2: " + product.getPart2());
        System.out.println("Product part3: " + product.getPart3());
    }
}
