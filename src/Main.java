public class Main {
    public static void main(String[] args) {
        System.out.println(min(9, 5));
        System.out.println(isEven(4));
        System.out.println(raiseSecondPower(4));
        System.out.println(raiseThirdPower(4));
        checkNumber(16);

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
        int[] result = new int[numbers.length];
        for (int i = 0; i < result.length; i++) {

        }

    }
}
