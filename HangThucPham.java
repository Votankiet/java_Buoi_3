package BAI2;

import java.time.LocalDate;
    public class HangThucPham extends HangHoa {
    private String nhaCungCap;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaCungCap = nhaCungCap;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }
    @Override
    public String tinhMucDoBanBuon() {
        if (getSoLuongTon() > 0 && ngayHetHan.isBefore(LocalDate.now())) {
            return "Mức độ bán buôn: Khó bán";
        }
		return "Không đánh giá";
    }

    public void setngaySanXuat(LocalDate now) {
    }

    public void setngayHetHan(LocalDate ngaySanXuat2) {
    }
}
