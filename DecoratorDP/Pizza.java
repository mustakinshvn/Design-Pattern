package DecoratorDP;

public abstract class Pizza {
    String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
