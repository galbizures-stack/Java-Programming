public class Sandwich {

    private String mainIngredient;
    private String bread;
    private double price;

    public String getBread() {
        return bread;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public double getPrice() {
        return price;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}