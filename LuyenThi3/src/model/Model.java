package model;

public class Model {
    private double tuSo, mauSo;
    private double ketQua;

    public Model() {

    }

    public double getTuSo() {
        return tuSo;
    }

    public void setTuSo(double tuSo) {
        this.tuSo = tuSo;
    }

    public double getMauSo() {
        return mauSo;
    }

    public void setMauSo(double mauSo) {
        this.mauSo = mauSo;
    }

    public double getKetQua() {
        return ketQua;
    }

    public void setKetQua(double ketQua) {
        this.ketQua = ketQua;
    }

    public void tinhToan(){

        this.ketQua = this.tuSo / this.mauSo;
    }
}
