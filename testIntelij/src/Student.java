public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                 name + "/"
                + age + "/" +
                id
                ;
    }

    public void searchName(String n){
        if (this.name.equals(n)){
            System.out.println(this.toString());
        }
    }

    public void searchAge(int n){
        if(this.age == n){
            System.out.println(this.toString());
        }
    }

    public void searchID(String n){
        if (this.id.equals(n)){
            System.out.println(this.toString());
        }
    }
}
