package Practice;

public class EncapsulateTest {
    public static void main(String[] args) {
        Encapsulate encapsulate = new Encapsulate();
        encapsulate.setName("Martha");
        encapsulate.setAge(26);
        encapsulate.setRoll(1000000);

        System.out.println("name: "+encapsulate.getName());
        System.out.println("Age: "+encapsulate.getAge());
        System.out.println("roll: "+encapsulate.getRoll());
    }
}
