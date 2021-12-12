import java.util.Arrays;

public class task_8 {

    public static void main(String[] args) {
        // int[] array_a = Main.getArray(15, 10);
        int[] array_a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Отправили массив: " + Arrays.toString(array_a));
        System.out.println("Получили массив: " + Arrays.toString(moveNumbers(array_a, -12)));

    }

    // Написать метод, которому на вход подается одномерный массив и
    // число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично.
        public static int[] moveNumbers(int[] array, int value) {
            int[] temp = Arrays.copyOf(array, array.length);
            int position = value - array.length * (value / array.length);
            for (int i = 0; i < array.length; i++) {
                if (position >= 0) {
                    if (position + i < array.length) {
                        array[position + i] = temp[i];
                    } else if (position + i >= array.length) {
                        array[position + i - array.length] = temp[i];
                    }
                } else {
                    if (array.length + i + position < array.length) {
                        array[array.length + i + position] = temp[i];
                    } else if (array.length + i + position >= array.length) {
                        array[position + i] = temp[i];
                    }
                }

            }
            return array;

        }

}
