public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        int clientOC = 0;
        if (clientOC == 1) {
            System.out.println("Установите версию приложение Android по ссылке");
        } else if (clientOC == 0) {
            System.out.println("Установите версию приложение IOS по ссылке");
        }

        System.out.println("Task #2");
        int clientDeviceYear = 2014;
        if (clientOC == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOC == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOC == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task #3");
        int year = 2027;
        if (year <= 1584) {
            System.out.println(year + " год не поддерживается (должен быть больше 1584)");
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Task #4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки - нет");
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        System.out.println("Task #5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}
