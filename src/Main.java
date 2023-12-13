public class Main {
    public static void main(String[] args) {

        // task 4
        StringBuilder fullName = new StringBuilder("Ivanov Ivan Ivanovich");
        char[] reverseFullName = fullName.reverse().toString().toCharArray();
        reverseFullName(reverseFullName);

        // task 5
        String string = "aabccddefgghiijjkk";
        checkDuplicate(string.toCharArray());

        // task 6
        calculateAverage();

    }
    public static void reverseFullName(char[] reverseFullName ) {
        int intermediateSymbol;
        int j = reverseFullName.length - 1;
        for(int i = 0; i < reverseFullName.length/2; i++) {
                intermediateSymbol = reverseFullName[i] + reverseFullName[j];
                reverseFullName[i] = (char) (intermediateSymbol - reverseFullName[i]);
                reverseFullName[j] = (char) (intermediateSymbol - reverseFullName[j--]);
        }
        System.out.println(reverseFullName);
    }

    public static void checkDuplicate(char[] chars) {
        for(int i = 0; i < chars.length; i++) {
            for (int j = 1; j < chars.length - 1; j++) {
                if (chars[i] == chars[j]) System.out.println("В строке задублирован символ " + chars[i] );
                break;
            }
        }
    }

    public static float[] generateArray() {
        float[] array = new float[30];
        for (int i = 0; i < array.length; i++){
            array[i] = (float) (Math.random() * 100000 + 100000);
        }
        for (float i : array) {
            System.out.println(i);
        }
        return array;
    }

    public static int calculateAmountElements(float[] array) {
        return array.length;
    }
    public static float calculateSum(float[] array) {
        float sum = 0;
        for (float f : array) {
            sum += f;
        }
        return sum;
    }
    public static void calculateAverage () {
        float[] array = generateArray();
        float sum = calculateSum(array);
        int amountElements = calculateAmountElements(array);
        float avg = sum / amountElements;
        System.out.println("Среднее значение элементов массива = " + avg);
    }

}