import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloWorld {

    //Input: 'W', 'e', 'L', 'c', 'o', 'M', 'e'
//Output: 'W','L','M','e', 'c', 'o', 'e'

    public static void shitLowerCaseEndOfTheArray(char[] c){
        List<Character> char1 = new ArrayList<>();
        List<Character> char2 = new ArrayList<>();
        LinkedList<Character> merged =  new LinkedList<>();
        for(int i = 0; i < c.length; i++){
            if(Character.isUpperCase(c[i])){
                char1.add(c[i]);
            }else{
                char2.add(c[i]);
            }

        }
        merged.addAll(char1);
        merged.addAll(char2);

        System.out.println("List of char" + merged);
    }

    public static void main(String[] args) {
        char[] c = {'W', 'e', 'L', 'c', 'o', 'M', 'e'};

        shitLowerCaseEndOfTheArray(c);
    }
}

    String s1 = “Hi”;
        s1 += “Hello”;
        String s2 = “HiHello”;


        getVal() {
        try{return 10;} finally{return 20;}
        }