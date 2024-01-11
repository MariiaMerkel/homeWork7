import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(min(9, 5));
        System.out.println(isEven(4));
        System.out.println(raiseSecondPower(4));
        System.out.println(raiseThirdPower(4));
        checkNumber(16);
        System.out.println(Arrays.toString(sortAscending(new int[]{1, 2, 8, 9, 55, 4})));
        System.out.println(generateFloat());
        System.out.println(generateInt(20));
        System.out.println(roundFloat(5.9f));

    }

    public static int min(int first, int second) {
        return first < second ? first : second;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int raiseSecondPower(int number) {
        return number * number;
    }

    public static int raiseThirdPower(int number) {
        return number * number * number;
    }

    public static void checkNumber(int number) {
        System.out.println(number >= 10);
    }

    public static int[] sortAscending(int[] numbers) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    replaceElement(numbers, i, i + 1);
                    unsorted = true;
                }
            }
        }
        return numbers;
    }

    public static int[] replaceElement(int[] array, int one, int two) {
        array[one] += array[two];
        array[two] = array[one] - array[two];
        array[one] -= array[two];
        return array;
    }

    public static float generateFloat() {
        return -9 + new Random().nextFloat() * (9 - (-9));
    }

    public static int generateInt(int num) {
        return new Random().nextInt(num * (-1), num);
    }

    public static int roundFloat(float number) {
        float fraction = number%1;
        return fraction < 0.5 ? (int) number : (int) number + 1;
    }
}
