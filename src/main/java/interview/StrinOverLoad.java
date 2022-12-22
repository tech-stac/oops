package interview;

public class StrinOverLoad {

    public void print(String str){
        System.out.println("Abc");
    }

    public void print(StringBuffer str){
        System.out.println("Abc");
    }

    public static void main(String[] args) {
        StrinOverLoad str = new StrinOverLoad();
       // str.print(null); // ambiguous method call , both are the child class of object
        str.print("Abc");
    }
}
