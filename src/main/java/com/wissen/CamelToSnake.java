package com.wissen;

public class CamelToSnake {

    public static void main(String[] args) {

        String str = camelToSnakeCase("whatIsYourName");
        String str1 = camelToSnakeCase("whatIsYourName");
       //snakeToCamelCase9forSnakeSmallCase("snake_case_to_camel_case");
       // System.out.println( st);
        //snakeToCameCaseforUppercase("WHAT_IS_YOUR_NAME");
        snakeT0CamelCaseForEach("WHAT_IS_YOUR_NAME");

    }

//000 0022322

    public static String snakeToCamel(String str)
    {
        // Capitalize first letter of string
        str = str.substring(0, 3).toLowerCase()
                + str.substring(3);

        // Run a loop till string
        // string contains underscore
        while (str.contains("_")) {

            // Replace the first occurrence
            // of letter that present after
            // the underscore, to capitalize
            // form of next letter of underscore
            str = str
                    .replaceFirst(
                            "_[a-z]",
                            String.valueOf(
                                    Character.toUpperCase(
                                            str.charAt(
                                                    str.indexOf("_") + 1))));
        }
        // Return string
        return str;
    }

    public static String snakeT0CamelCaseForEach(String str){
        String[] words = str.split("_");
        String newPhrase = words[0].toLowerCase();
        for(int i=1; i<words.length; i++){

            newPhrase +=  words[i].substring(0,1).toUpperCase() +
                    words[i].substring(1).toLowerCase();
                //String.valueOf(words[i].charAt(0)).toUpperCase()
        }
        System.out.println(newPhrase);
       return newPhrase;
    }

    public static String camelToSnakeCase(String str){
        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";
        return str.replaceAll(regex, replacement).toUpperCase();
    }


       //https://youtu.be/vrP0IamyR5o
    //iterative approach
    public static String camelToSnakeWithoutRegex(String camel, boolean upper) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : camel.toCharArray()) {
            char nc = upper ? Character.toUpperCase(c) : Character.toLowerCase(c);
            if (Character.isUpperCase(c)) {
                stringBuilder.append('_').append(nc);
            }
            else {
                stringBuilder.append(nc);
            }
        }
            return stringBuilder.toString();

    }


    // regex


}
