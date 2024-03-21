import java.io.Serializable;

public class Student implements Serializable {
//    private static final long serialVersionUID = 1L;
    protected String name;
    protected int age;

    public Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    @Override
    public String toString() {
        return "Student{ " + "name= " + name + '\'' + ", age= " + age + '}';
    }
}
