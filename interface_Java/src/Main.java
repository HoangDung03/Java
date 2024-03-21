public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();

        System.out.println("5 + 3 = " + mfx500.cong(5,3));
        System.out.println("5 * 3 = " + mvn500.nhan(5,3));

        System.out.println("Test 2: ");
        double[] arr1 = new double[] {5,1,3,4,5,8,0};
        double[] arr2 = new double[] {6,2,7,9,2,4,5};
        SapXepChen sxChen = new SapXepChen();
        SapXepChon sxChon = new SapXepChon();

        sxChen.sapXepTang(arr1);
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + "; ");
        }

        System.out.println("\n---------------------------");

        sxChon.sapXepGiam(arr2);
        for (int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i] + "; ");
        }
        System.out.println("\n---------------------------");
        System.out.println("Test 3: ");
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("3 + 5= " + pmmt.cong(3,5));

        double[] arr3 = new double[] {6,2,7,9,2,4,5};
        pmmt.sapXepTang(arr3);
        for (int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}