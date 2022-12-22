package interview;

public class TestEmp {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 10;
        m(e);
        System.out.println(e.id);
    }

   static void m(Employee e){
        e.id = 20;
    }
}
