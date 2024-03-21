public class TacGia {
    private String name;
    private Ngay ngaySinh;

    public TacGia(String name, Ngay ngaySinh) {
        this.name = name;
        this.ngaySinh = ngaySinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
