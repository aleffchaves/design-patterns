package criacionais.builder;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private String gen;
    private String birthday;

    public Person(String name, String lastName, int age, String gen, String birthday) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gen = gen;
        this.birthday = birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gen='" + gen + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
