package day3;

import java.util.Arrays;

public class C03_ArraysEquals {

    public static boolean arrayKiyasla(Object[] arr1, Object[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }

}
