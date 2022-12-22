package interview;

public class StringBufferQuestions {

    public static void main(String[] args) {

        String s1 = "abc";
        StringBuffer s2 = new StringBuffer(s1);
        System.out.println(s1.equals(s2)); // false
        // Reason is

       /*

       The output is false because s2 is not of type String.
        The equals() method implementation in the String class has an instanceof operator to check
        if the type of passed object is String and return false if the object is not String.

        */

        System.out.println(s2.equals(s1));
    }
}
