import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Проверяем задание 1.");
        int[] array_a = getArray(10, 2);
        System.out.println("Отправили массив: " + Arrays.toString(array_a));
        System.out.println("Получили массив: " + Arrays.toString(swapNumbers(array_a)));

    }

    // Генерит новый массив из рандомных чисел
    public static int[] getArray(int lenght, int bound) {
        Random rand = new Random();
        int[] test_array = new int[lenght];

        for (int i = 0; i < test_array.length; i++) {
            test_array[i] = rand.nextInt(bound);
        }
        return test_array;
    }

    // Выводит массив в консоль
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
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
}
