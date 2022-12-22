package com.split.array.in.chunck.wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatterArray {


    public static void main(String[] args) throws Exception {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};
        //Object[] arra = new Object[[[[1],2],[3,4]]];

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));
    }

    public static Integer[] flatten(Object[] inputArray) throws IllegalArgumentException {

        if (inputArray == null)
            return null;
        List<Integer> flatList = new ArrayList<Integer>();
        for (Object element : inputArray) {
            if (element instanceof Integer) {
                flatList.add((Integer) element);
            } else if (element instanceof Object[]) {
                flatList.addAll(Arrays.asList(flatten((Object[]) element)));
            } else {
                throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");
            }
            // System.out.println("Flattened Array "+flatList);
        }
        return flatList.toArray(new Integer[flatList.size()]);
    }

    public static Integer[] flattenArray(Object[] inputList) {

        ArrayList<Integer> flatten = new ArrayList<Integer>();

        if (inputList.length <= 0) {
            return new Integer[0];                          // if the inputList is empty, return an empty Integer[] array.
        }

        for (Object obj : inputList) {
            recursiveCall(inputList);                 // otherwise we can recursively flatten the input list.
        }

        Integer [] flatArray = new Integer[flatten.size()];
        return flatArray = flatten.toArray(flatArray);
    }

    private static void recursiveFlatten(ArrayList<Integer> flatten, Object o) {
        if (isInteger(o)) {                               // if the object is of type Integer, just add it into the list.
            flatten.add((Integer) o);
        }
        else if (o instanceof ArrayList) {              // otherwise, we need to call to recursively flatten the array
            for (Object obj : (ArrayList<Object>) o) {    // for the case where there are deeply nested arrays.
                recursiveFlatten(flatten, obj);
            }
        }
    }


    private static void recursiveCall(Object[] array) {

        for (int i=0;i<array.length;i++) {
            if (array[i] instanceof Object[]) {
                recursiveCall((Object[]) array[i]);
            }else {
                System.out.println(array[i]);
            }

        }

    }
    private static boolean isInteger(Object obj) {
        return obj instanceof Integer;
    }
}
