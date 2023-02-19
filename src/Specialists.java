public abstract class Specialists {
    public String name;
    public int age;
    public char gender;
    public String email;

    public Specialists(String name, int age, char gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n Specialist: " +
                "name=" + name  +
                ", age=" + age +
                ", gender=" + gender +
                ", email=" + email  ;
    }
}
