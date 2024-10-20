package Builder;

public class Main {
    public static void main(String[] args) {
        Product customProduct = new Product.Builder()
                .processor("i7")
                .ram("16GB")
                .storage("1TB")
                .graphics("Nvidia")
                .build();

                System.out.println(customProduct);
    }
}
