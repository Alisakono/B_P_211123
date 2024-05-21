package org.example.summary_17_05_24;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsFinder {
    public static Set<Integer> findCommonElements(int[] array1, int[] array2){
        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());

        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        Set<Integer> commonElements = findCommonElements(array1,array2);
        System.out.println(commonElements);
    }
}
       /* 3. Напишите программу на Java и тест для нее для поиска общих элементов между двумя массивами целых чисел
         example input:
         Array1: [1, 2, 5, 5, 8, 9, 7, 10]
         Array2: [1, 0, 6, 15, 6, 4, 7, 0]
         example expected:
         [1,7]*/
