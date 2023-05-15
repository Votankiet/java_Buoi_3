package BAI2;

    public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    
    public double getCongSuat() {
        return congSuat;
    }

    @Override
    public String tinhMucDoBanBuon() {
        if (getSoLuongTon() < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

}