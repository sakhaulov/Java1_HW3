import java.util.Random;

public class task_7 {

    public static void main(String[] args) {
        int[] test_array = Main.getArray(10, 10);

        Main.printArray(test_array);
        System.out.println();
        System.out.println(checkEquals(test_array));
    }


    // Считает сумму всех элементов массива
    public static int getArraySum(int[] array) {
        int array_sum = 0;
        for (int i = 0; i < array.length; i++) {
            array_sum += array[i];
        }
        return array_sum;
    }

    // Задание 7. Проверяет, есть ли в массиве место, в котором сумма левой и правой части массива равны.
    public static boolean checkEquals(int[] array) {
        int temp = 0;
        int sum = getArraySum(array);

        for (int i = 0; i < array.length; i++) {
            temp += array[i];
            if (temp == sum - temp) return true;
        }
        return false;
    }

}