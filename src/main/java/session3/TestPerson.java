package session3;

public class TestPerson {
    public static void main(String[] args) {

        Person joao = new Person("João", "55");

        Person julia = new Person("Julia", "85");

        Person maria = new Person();
        maria.setAge("21");
        maria.setInstanceName("Maria");

        System.out.println(joao);
        System.out.println(julia);
        System.out.println(maria);
    }
}
