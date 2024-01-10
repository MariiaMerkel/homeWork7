public class Main {
    public static void main(String[] args) {
        isLeapYear(2000);
        recommendOS(2, 2000);
        printDelivery(calculateDeliveryDays(95));
        ;
    }

    public static void isLeapYear(int year) {
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void recommendOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Такой ОС не существует");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        if (distance > 100) {
            return 0;
        }
        return days;
    }

    private static void printDelivery(int days) {
        String wordForm = days > 1 ? " дня" : " день";
        if (days != 0) {
            System.out.println("Потребуется " + days + wordForm);
        } else {
            System.out.println("Доставки нет");
        }

    }
}
