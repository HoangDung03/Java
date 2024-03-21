public class Test {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(15, 5,2023);
        MyDate myDate2 = new MyDate(15, 5,2023);
        MyDate myDate3 = new MyDate(29, 9,2023);

        System.out.println(myDate1);
        System.out.println(myDate2);
        System.out.println(myDate3);

        System.out.println(myDate1.equals(myDate2));
    }
}
