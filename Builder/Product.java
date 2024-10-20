package Builder;

public class Product {
  private String processor;
  private String storage;
  private String ram;
  private String graphics;

   public Product(Builder builder){
    this.processor = builder.processor;
    this.storage = builder.storage;
    this.ram = builder.ram;
    this.graphics = builder.graphics;
   }

   public String toString(){
    return "Processor: " + processor + "\nStorage: " + storage + "\nRAM: " + ram + "\nGraphics: " + graphics;
   }


  public static class Builder{
    private String processor;
    private String storage;
    private String ram;
    private String graphics;

   public Builder processor(String processor){
    this.processor = processor;
    return this;
   }
   public Builder storage(String storage){
    this.storage = storage;
    return this;
   }
    public Builder ram(String ram){
     this.ram = ram;
     return this;
    }
    public Builder graphics(String graphics){
     this.graphics = graphics;
     return this;
    }

    public Product build(){
      return new Product(this);
    }

  }
}