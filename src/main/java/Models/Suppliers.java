package Models;


public class Suppliers {
    private String SuppliersID;
    private String BrandName;
    private String SAddress;
    private String SDetails;
    private String SCategory;

    public Suppliers(String SuppliersID, String BrandName, String SAddress, String SDetails, String SCategory) {
        this.SuppliersID = SuppliersID;
        this.BrandName = BrandName;
        this.SAddress = SAddress;
        this.SDetails = SDetails;
        this.SCategory = SCategory;
    }

    public String getSuppliersID() {
        return SuppliersID;
    }

    public void setSuppliersID(String SuppliersID) {
        this.SuppliersID = SuppliersID;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getSAddress() {
        return SAddress;
    }

    public void setSAddress(String SAddress) {
        this.SAddress = SAddress;
    }

    public String getSDetails() {
        return SDetails;
    }

    public void setSDetails(String SDetails) {
        this.SDetails = SDetails;
    }

    public String getSCategory() {
        return SCategory;
    }

    public void setSCategory(String SCategory) {
        this.SCategory = SCategory;
    }
    
    
}
