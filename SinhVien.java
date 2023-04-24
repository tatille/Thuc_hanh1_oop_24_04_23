/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

public class SinhVien {
    private String maSV;
    private String hoTen;
    
    // Constructor
    public SinhVien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }
    
    // Getters
    public String getMaSV() {
        return maSV;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    @Override
    public String toString() {
        return hoTen + " - " + maSV;
    }
    
    // Setters
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}

