package Builder;

public class Product {
    private String processor;
    private String ram;
    private String storage;
    boolean isGraphicsCardEnabled;

     Product (Builder builder){
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;

     }

     public String toString(){
         return "Processor: "+processor+" RAM: "+ram+" Storage: "+storage+" Graphics Card: "+isGraphicsCardEnabled;
     }

     

     public static class Builder{
        private String processor;
        private String ram;
        private String storage;
        boolean isGraphicsCardEnabled;

        public Builder setProcessor(String processor){
            this.processor = processor;
            return this;
        }

        public Builder setRam(String ram){
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
     }
    
}
