package Models;

public class Spairparts {
    private String Code;
    private String Brand;
    private float Price;
    private String Colour;
    private String Type;
    private int Quantity; 

    public Spairparts(String Code, String Brand, float Price, String Colour, String Type, int Quantity) {
        this.Code = Code;
        this.Brand = Brand;
        this.Price = Price;
        this.Colour = Colour;
        this.Type = Type;
        this.Quantity = Quantity;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
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

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    
}
