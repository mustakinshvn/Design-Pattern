package BuilderDP;

public class Products {
    private String part1;
    private String part2;
    private String part3;

    // Private constructor to enforce object creation through the Builder
    private Products(Builder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
        this.part3 = builder.part3;
    }

    public String getPart1() {
        return part1;
    }

    public String getPart2() {
        return part2;
    }

    public String getPart3() {
        return part3;
    }

  public static class Builder {
    private String part1;
    private String part2;
    private String part3;

    public Builder setPart1(String part1){
        this.part1=part1;
        return this;
    }

    public Builder setPart2(String part2){
        this.part2=part2;
        return this;
    }

    public Builder setPart3(String part3){
        this.part3=part3;
        return this;
    }

     public Products build(){
        return new Products(this);
    }
  
    
  }  

    


    
}
