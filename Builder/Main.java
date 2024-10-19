package Builder;

public class Main {
    public static void main(String[] args) {
        Product customProduct = new Product.Builder()
                .setProcessor("i7")
                .setRam("16GB")
                .setStorage("1TB")
                .setGraphicsCardEnabled(true)
                .build();

                System.out.println(customProduct);
    }
}
