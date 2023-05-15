package BAI2;

  import java.time.LocalDate;
public class HangSanhSu extends HangHoa{
    private String NhaSanXuat;
    private LocalDate NgayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, LocalDate ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.NhaSanXuat = nhaSanXuat;
        this.NgayNhapKho = ngayNhapKho;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }
    
    public LocalDate getNgayNhapKho() {
        return NgayNhapKho;
    }

    @Override
    public String tinhMucDoBanBuon() {
        if (getSoLuongTon() < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

}

