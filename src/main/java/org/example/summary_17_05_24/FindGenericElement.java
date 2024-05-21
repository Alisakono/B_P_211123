package org.example.summary_17_05_24;

import java.util.Arrays;

public class FindGenericElement {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};


        int[] commonElement = findGenericElement(array1, array2);
        System.out.println(Arrays.toString(commonElement));
    }

    public static int[] findGenericElement(int[] array1, int[] array2) {
      int[] temp = new int[Math.min(array1.length, array2.length)];
      int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i]==array2[j]){
                    boolean found = false;
                    for (int k = 0; k < count; k++) {
                        if (temp[k]==array1[i]){
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        temp[count++]= array1[i];
                    }
                    break;
                }
            }
        }
        int[] result = new int[count];
        System.arraycopy(temp,0,result,0,count);
        return result;
    }

    }




   /* Напишите программу на Java и тест для нее для поиска общих элементов между двумя массивами целых чисел
        example input:
        Array1: [1, 2, 5, 5, 8, 9, 7, 10]
        Array2: [1, 0, 6, 15, 6, 4, 7, 0]
        example expected:
        [1,7]*/
