public class Sinh_Vien {
    private String name;
    private int age;
    private String id;

    public Sinh_Vien(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return   this.name + '-' + this.age + "-" + this.id;
    }

    public void Sleep(){
        System.out.println("Zzzzzz");
    }

    public void eating(){
        System.out.println("I'm Eating!");
    }

    public void makeVoid(){
        System.out.println("Hahaha!");
    }
}
