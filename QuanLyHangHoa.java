package BAI2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHangHoa {
    private List<HangHoa> hangHoaList;

    public QuanLyHangHoa() {
        hangHoaList = new ArrayList<>();
    }

    public void addHangHoa(HangHoa hangHoa) {
        // Check if the hangHoa's maHang already exists in the list
        for (HangHoa hh : hangHoaList) {
            if (hh.getMaHang().equals(hangHoa.getMaHang())) {
                System.out.println("Mã hàng đã tồn tại!");
                return;
            }
        }
        hangHoaList.add(hangHoa);
        System.out.println("Thêm hàng hóa thành công!");
    }

    public void printHangHoaList() {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-15s %-15s%n", "Mã hàng", "Tên hàng", "Số lượng tồn", "Đơn giá", "Mức độ bán buôn");
        System.out.println("-------------------------------------------------------------");

        for (HangHoa hangHoa : hangHoaList) {
            String maHang = hangHoa.getMaHang();
            String tenHang = hangHoa.getTenHang();
            int soLuongTon = hangHoa.getSoLuongTon();
            double donGia = hangHoa.getDonGia();

            String mucDoBanBuon = hangHoa.tinhMucDoBanBuon(); // Lưu kết quả vào biến mucDoBanBuon

            System.out.printf("%-10s %-20s %-15s %-15s %-15s%n", maHang, tenHang, soLuongTon, donGia, mucDoBanBuon);
        }

        System.out.println("-------------------------------------------------------------");
    }




}
