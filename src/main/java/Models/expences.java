/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dimantha
 */
public class expences {
    private String id;
    private String brand;
    private int qut;
    private float total;

    public expences(String id, String brand, int qut, float total) {
        this.id = id;
        this.brand = brand;
        this.qut = qut;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQut() {
        return qut;
    }

    public void setQut(int qut) {
        this.qut = qut;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
