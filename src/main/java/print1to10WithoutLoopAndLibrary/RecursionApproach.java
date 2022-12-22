package print1to10WithoutLoopAndLibrary;

public class RecursionApproach {

    public static void printNumbers(int n){
        if(n > 0){
            printNumbers(n - 1);
            System.out.println(  n + " ");
        }
        return;
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
