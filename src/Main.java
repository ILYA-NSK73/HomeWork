import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task #1");
        leapYear(2021);
        System.out.println();
        System.out.println("Task #2");
        checkDeviceYear(2015, 0);
        System.out.println();
        System.out.println("Task #3");
        checkDeliveryDistance(98);
        System.out.println();
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void checkDeviceYear(int clientDeviceYear, int clientOS) {
        boolean isOldDevice = clientDeviceYear < 2015;
        String osMessage = (clientOS == 0) ? "для iOS" : "для Android";
        String versionMessage = isOldDevice ? "облегченную версию" : "обычную версию";

        System.out.println("Установите " + versionMessage + " приложения " + osMessage + " по ссылке.");
    }

    public static void checkDeliveryDistance(int deliveryDistance) {
        int total = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + total);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            total += 1;
            System.out.println("Потребуется дней: " + total);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            total += 2;
            System.out.println("Потребуется дней: " + total);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}