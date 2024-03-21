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
        return name + "/" + age + "/" + id;
    }

    public void searchName(String n) {
        if (this.name.equals(n)) {
            System.out.println(this.toString());
        }
    }

    public void searchAge(int age) {
        if (this.age == age) {
            System.out.println(this.toString());
        }
    }

    public void searchId(String id) {
        if (this.id.equals(id)) {
            System.out.println(this.toString());
        }
    }
}