package Models;

public class Watch {
    private String WatchID;
    private String BrandName;
    private float Price;
    private String Colour;
    private String Category;
    private int quantity;

    public Watch(String WatchID, String BrandName, float Price, String Colour, String Category, int qut) {
        this.WatchID = WatchID;
        this.BrandName = BrandName;
        this.Price = Price;
        this.Colour = Colour;
        this.Category = Category;
        this.quantity = qut;
    }

    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String WatchID) {
        this.WatchID = WatchID;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
