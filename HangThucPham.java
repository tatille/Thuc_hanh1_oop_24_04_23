/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    // constructors
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        if (maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng.");
        }
        this.maHang = maHang;
        this.tenHang = tenHang.isEmpty() ? "xxx" : tenHang;
        this.donGia = donGia >= 0 ? donGia : 0;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public HangThucPham(String maHang) {
        this(maHang, "", 0, new Date(), new Date());
    }

    // getters and setters
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        if (!maHang.isEmpty()) {
            this.maHang = maHang;
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang.isEmpty() ? "xxx" : tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        }
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if (ngaySanXuat.before(new Date())) {
            this.ngaySanXuat = ngaySanXuat;
        }
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan.after(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        }
    }

    // method to check if the food item is expired
    public boolean isExpired() {
        return new Date().after(this.ngayHetHan);
    }

    // toString method
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.##");
        return "Mã hàng: " + this.maHang + ", Tên hàng: " + this.tenHang + ", Đơn giá: " + df.format(this.donGia)
                + " VNĐ, Ngày sản xuất: " + sdf.format(this.ngaySanXuat) + ", Ngày hết hạn: "
                + sdf.format(this.ngayHetHan) + ", Hết hạn chưa: " + (isExpired() ? "Có" : "Không");
    }
}

