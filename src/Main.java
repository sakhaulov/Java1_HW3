import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array_a = getArray(10, 2);
        int[] array_b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] array_sq = getArray(7, 7, 1);

        System.out.println("Проверяем задание 1.");
        System.out.println("Отправили массив: " + Arrays.toString(array_a));
        System.out.println("Получили массив: " + Arrays.toString(swapNumbers(array_a)));

        System.out.println("Проверяем задание 2.");
        System.out.println("Получили массив: " + Arrays.toString(newArray()));

        System.out.println("Проверяем задание 3.");
        System.out.println("Отправили массив: " + Arrays.toString(array_b));
        System.out.println("Получили массив: " + Arrays.toString(multiplyElems(array_b)));

        System.out.println("Проверяем задание 4.");
        printArray(array_sq);
        System.out.println();
        printArray(fillDiagonal(array_sq));

        System.out.println("Проверяем задание 5.");
        System.out.println("Получили массив: " + Arrays.toString(newCustomArray(15, 8)));

        System.out.println("Проверяем задание 6.");
        System.out.println("Отправили массив: " + Arrays.toString(array_b));
        findMinMax(array_b);
    }

    // Генерит новый массив из рандомных чисел
    public static int[] getArray(int length, int bound) {
        Random rand = new Random();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(bound);
        }
        return array;
    }

    // Вариант для вложенных массивов
    public static int[][] getArray(int length, int height, int bound) {
        Random rand = new Random();
        int[][] array = new int[length][height];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(bound);
            }
        }
        return array;
    }

    // Выводит массив в консоль
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    // Вариант для вложенных массивов
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " | ");
            }
            System.out.println();
        }
    }

    // Задание 1. Заменяет в массиве 1 на  0, а 0 на 1
    public static int[] swapNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    // Задание 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static int[] newArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        return array;

    }

    //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] multiplyElems(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;

    }

    //Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //и с помощью цикла(-ов) заполнить его диагональные элементы единицами .
    public static int[][] fillDiagonal(int[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else if (j == array[i].length - 1 - i) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    //Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    //и возвращающий одномерный массив типа int длиной len,
    //каждая ячейка которого равна initialValue;
    public static int[] newCustomArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    //Задание 6. Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;
    public static void findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("Минимальное значение "+ min);
        System.out.println("Максимальное значение "+ max);
    }
}

