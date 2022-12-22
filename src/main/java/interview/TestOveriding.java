package interview;

public class TestOveriding {


    public static void main(String[] args) {
        A a = new B();
        a.xyz();
        a.xyz1();
       // B b = new A(); in compatible types on child reference we can call parent object

       // b.xyz();

        B b = ( B ) new A();
       // C c = (C)new A();

    }

}
