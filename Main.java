package BAI2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyHangHoa manager = new QuanLyHangHoa();

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.println("Thêm sản phẩm mới");
            System.out.print("Nhập mã hàng: ");
            String maHang = scanner.next();
            System.out.print("Nhập tên hàng: ");
            String tenHang = scanner.next();
            System.out.print("Nhập số lượng tồn: ");
            int soLuongTon = scanner.nextInt();
            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();

            System.out.print("Loại hàng (1 - Hàng điện máy, 2 - Hàng thực phẩm, 3 - Hàng sành sứ): ");
            int loaiHang = scanner.nextInt();

            HangHoa hangHoa;
            if (loaiHang == 1) {
                System.out.print("Nhập thời gian bảo hành (tháng): ");
                int thoiGianBaoHanh = scanner.nextInt();
                System.out.print("Nhập công suất (KW): ");
                double congSuat = scanner.nextDouble();

                hangHoa = new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);
            } else if (loaiHang == 2) {
                System.out.print("Nhập ngày sản xuất (d/M/yyyy): ");
                String ngaySanXuatStr = scanner.next();
                LocalTime ngaySanXuat = LocalTime.parse(ngaySanXuatStr);
                System.out.print("Nhập ngày hết hạn (d/M/yyyy): ");
                String ngayHetHanStr = scanner.next();
                LocalTime ngayHetHan = LocalTime.parse(ngayHetHanStr);
                System.out.print("Nhập nhà cung cấp: ");
                String nhaCungCap = scanner.next();

                hangHoa = new HangThucPham(maHang, tenHang, soLuongTon, donGia, nhaCungCap, LocalDate.parse(ngayHetHanStr), LocalDate.parse(ngaySanXuatStr));

            } else if (loaiHang == 3) {
                System.out.print("Nhập nhà sản xuất: ");
                String nhaSanXuat = scanner.next();
                System.out.print("Nhập ngày nhập kho (d/M/yyyy): ");
                String ngayNhapKhoStr = scanner.next();

                hangHoa = new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, LocalDate.parse(ngayNhapKhoStr));

            } else {
                System.out.println("Loại hàng không hợp lệ.");
                continue;
            }

            manager.addHangHoa(hangHoa);

            System.out.print("Tiếp tục thêm hàng hóa? (y/n): ");
            String choice = scanner.next();
            continueAdding = choice.equalsIgnoreCase("y");
        }


        System.out.println("\nDanh sách hàng hóa:");
        manager.printHangHoaList();
    }
}