/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            HangThucPham hang1 = new HangThucPham("001", "Gạo", 100000, sdf.parse("10/07/2018"), sdf.parse("10/07/2023"));
            HangThucPham hang2 = new HangThucPham("002");
            hang2.setTenHang("Mì");
            hang2.setDonGia(5000);
            hang2.setNgaySanXuat(sdf.parse("01/04/2022"));
            hang2.setNgayHetHan(sdf.parse("01/05/2023"));
            HangThucPham hang3 = new HangThucPham("003", "Nước", 10000, sdf.parse("20/04/2022"), sdf.parse("20/07/2022"));

            ArrayList<HangThucPham> danhSachHang = new ArrayList<>();
            danhSachHang.add(hang1);
            danhSachHang.add(hang2);
            danhSachHang.add(hang3);

            // In ra danh sách các mặt hàng
            System.out.printf("%-10s %-20s %-15s %-15s %-15s\n", "Mã hàng", "Tên hàng", "Đơn giá (VND)", "Ngày sản xuất", "Ngày hết hạn");
for (HangThucPham hang : danhSachHang) {
    System.out.printf("%-10s %-20s %-15s %-15s %-15s\n", hang.getMaHang(), hang.getTenHang(), String.format("%,.0f VND", hang.getDonGia()), sdf.format(hang.getNgaySanXuat()), sdf.format(hang.getNgayHetHan()));
}

        } catch (ParseException e) {
            System.out.println("Lỗi định dạng ngày tháng: " + e.getMessage());
        }
    }
}