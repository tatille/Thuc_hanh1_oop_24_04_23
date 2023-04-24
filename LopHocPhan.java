/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private SinhVien[] dsSV;
    private String thongTin;
    
    // Constructor
    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTin, SinhVien[] dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTin = thongTin;
        this.dsSV = dsSV;
    }
    
    // Getters
    public String getMaLHP() {
        return maLHP;
    }
    
    public String getTenLHP() {
        return tenLHP;
    }
    
    public String getTenGV() {
        return tenGV;
    }
    
    public SinhVien[] getDsSV() {
        return dsSV;
    }
    
    public int getSoLuongSV() {
        return dsSV.length;
    }
    
    public String getThongTinLopHoc() {
        return thongTin;
    }
    
    @Override
    public String toString() {
        return "Ma LHP: " + maLHP + "\n" +
               "Ten LHP: " + tenLHP + "\n" +
               "Ten GV: " + tenGV + "\n" +
               "So sinh vien: " + dsSV.length + "\n" +
               "Thong tin: " + thongTin;
    }
    
    // Setters
    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }
    
    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }
    
    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }
    
    public void setDsSV(SinhVien[] dsSV) {
        this.dsSV = dsSV;
    }
    
    public void setThongTinLopHoc(String thongTin) {
        this.thongTin = thongTin;
    }

public static void main(String[] args) {
    // Tạo một danh sách sinh viên
    SinhVien[] dsSV = {
        new SinhVien("123", "Nguyen Van A"),
        new SinhVien("543", "Le Thi B"),
        new SinhVien("321", "Luong Van C")
    };

    // Tạo đối tượng LopHocPhan
    LopHocPhan lopHocPhan = new LopHocPhan("123456", "LT Hướng đối tượng", "Nguyễn Văn A",
            "Thứ 7, tiết 4-6, phòng A1.1", dsSV);

    // In thông tin của đối tượng LopHocPhan ra màn hình
    System.out.println("Mã LHP: " + lopHocPhan.getMaLHP());
    System.out.println("Tên LHP: " + lopHocPhan.getTenLHP());
    System.out.println("GV giảng dạy: " + lopHocPhan.getTenGV());
    System.out.println("Thông tin buổi học: " + lopHocPhan.getThongTinLopHoc());
    System.out.println("Danh sách sinh viên");
    for (SinhVien sv : lopHocPhan.getDsSV()) {
        System.out.println(sv.getMaSV() + " | " + sv.getHoTen());
    }
    System.out.println("Tổng số sinh viên: " + lopHocPhan.getSoLuongSV());
}
}

