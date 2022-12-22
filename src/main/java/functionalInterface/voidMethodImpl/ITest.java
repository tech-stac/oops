package functionalInterface.voidMethodImpl;

public class ITest {

    public static void main(String[] args) {

        I i = str -> System.out.println("Hi" + str);
        i.saYmessage("A");

    }
}
