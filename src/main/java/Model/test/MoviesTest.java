package Model.test;

import Model.Movies;

import java.util.Arrays;
import java.util.List;

public class MoviesTest {


    public static void main(String[] args) {
        List<Movies> movies = Arrays.asList(

                new Movies(1, "Dil", 4.4, 1995),
                new Movies(2, "Dil se", 5, 1995),
                new Movies(3, "Dil Hai tumhara", 4.3, 1996),
                 new Movies(4, "Ishq", 4.4, 1997),
                new Movies(5, "insaan", 3, 1995),
                new Movies(6, "Dil Hai tumharai", 4.5, 1996)
        );

    }
}
