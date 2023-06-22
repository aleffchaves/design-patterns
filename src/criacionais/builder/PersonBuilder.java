package criacionais.builder;

public class PersonBuilder{

    private String name;
    private String lastName;
    private int age;
    private String gen;
    private String birthday;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder gen(String gen) {
        this.gen = gen;
        return this;
    }

    public PersonBuilder birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public Person build() {
        return new Person(name, lastName, age, gen, birthday);
    }

}
