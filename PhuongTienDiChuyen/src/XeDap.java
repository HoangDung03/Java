public class XeDap extends PhuongTienDiChuyen {
    public XeDap(HangSanXuat hangSanXuat) {
        super("Xe dap", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
