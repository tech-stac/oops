package functionalInterface;

public class FunctionTest {

    public static void main(String[] args) {
        interfaceI1 i = str -> str +  " Amar";
        System.out.println(i.msg("Hi"));
    }
}
