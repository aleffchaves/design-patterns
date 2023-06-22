package criacionais.builder;

public class Client {

    public static void main(String[] args) {

        Person person = new PersonBuilder()
                .name("Alef")
                .lastName("Meira")
                .age(27)
                .gen("M")
                .birthday("13/11/1994")
                .build();

        System.out.println("-------------------");
        System.out.println(person);


    }

}
