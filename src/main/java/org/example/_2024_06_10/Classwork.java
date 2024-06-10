package org.example._2024_06_10;

import java.util.Arrays;

public class Classwork {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 6, 7, 8};
        int[] array6 = {0, 1, 2, 3, 4, 6, 7, 8};
        int[] array2 = new int[10];
        int[] array3;
        int[] array4;
        int[] array5 = {-7, 4, 6, 0, -1, -5, 3, 8, 26};

        // fill используется для заполнения массива переданным значением
        Arrays.fill(array2, 8);
        System.out.println(Arrays.toString(array2));

        // copyOf используется для создания массива на основании другого массива, с указанием новой длинны
        array3 = Arrays.copyOf(array1, 10);
        array3 = Arrays.copyOf(array1, 4);
        System.out.println(Arrays.toString(array3));

        // copyOfRange используется для создание массива с указанием индексов от и до какого значения нужно копировать из оригинального массива
        array4 = Arrays.copyOfRange(array1, 2, 4);
        array4 = Arrays.copyOfRange(array1, 4, array1.length);
        System.out.println(Arrays.toString(array4));

        // линейный поиск в не отсортированном массиве
        System.out.println(linearSearch(array5, 27));

        // бинарный поиск, используется для поиска индекса элемента в отсортированном массиве, в случае отсутствия вернёт (-(точка вставки + 1).
        System.out.println(Arrays.binarySearch(array1, 5));

        //сортировка массива по возростанию
        /*bubbleSort(array5);*/
        Arrays.sort(array5);
        System.out.println(Arrays.toString(array5));

        //сравнение двух массивов
        System.out.println(Arrays.equals(array1, array6));

    }

    // найти искомый элемент в массиве и вывести его индекс, при отсутствии вывести -1;
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // отсортировать массив по возрастанию
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
