package kitabelli;

public class UnderScorePattern {

    public static void underScorePattern(Integer N){

        int alpha = 65;
        for (int i = N-1; i>=0; i--){
             for(int j= N-1; j>=i; j--){
                 System.out.print((char) (alpha+j)+ "");
             }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        underScorePattern(3);
    }


}
/*
c
cb
cba*/
/*

c
c-b
c-b-a

*/
