package ViDu;

    public class SinhVien implements Comparable<ViDu.SinhVien> {
        private int maSinhvien;
        private String hoVaten;
        private String tenLop;
        private  double diemTrungBinh;

        public SinhVien(int maSinhvien, String hoVaten, String tenLop, double diemTrungBinh) {
            this.maSinhvien = maSinhvien;
            this.hoVaten = hoVaten;
            this.tenLop = tenLop;
            this.diemTrungBinh = diemTrungBinh;
        }

        public int getMaSinhvien() {
            return maSinhvien;
        }

        public void setMaSinhvien(int maSinhvien) {
            this.maSinhvien = maSinhvien;
        }

        public String getHoVaten() {
            return hoVaten;
        }

        public void setHoVaten(String hoVaten) {
            this.hoVaten = hoVaten;
        }

        public String getTenLop() {
            return tenLop;
        }

        public void setTenLop(String tenLop) {
            this.tenLop = tenLop;
        }

        public double getDiemTrungBinh() {
            return diemTrungBinh;
        }

        public void setDiemTrungBinh(double diemTrungBinh) {
            this.diemTrungBinh = diemTrungBinh;
        }

        public String getTen(){
            String s = this.hoVaten.trim();
            if (s.indexOf("")>=0){
                int vtri = s.lastIndexOf(" ");
                return s.substring(vtri + 1);
            }else {
                return s;
            }
        }

        @Override
        public String toString() {
            return "SinhVien{" +
                    "maSinhvien=" + maSinhvien +
                    ", hoVaten='" + hoVaten + '\'' +
                    ", tenLop='" + tenLop + '\'' +
                    ", diemTrungBinh=" + diemTrungBinh +
                    '}';
        }

        @Override
        public int compareTo(ViDu.SinhVien o) {
            // Dua tren so sanh ten
            // ten: Dung, Hoang Tien, Hoang Huu A, Tran Thi Thanh Yen
            String tenThis = this.getTen();
            String tenO = o.getTen();


            return tenThis.compareTo(tenO);
        }
    }
