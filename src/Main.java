import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        System.out.println("Task #2");
        for (int i = 10; i >= 1; i--)
            System.out.println(i);

        System.out.println("Task #3");
        for (int i = 0; i <= 17; i = i + 2)
            System.out.println(i + " - чётные числа");

        System.out.println("Task #4");
        for (int i = 10; i >= -10; i--)
            System.out.println(i);

        System.out.println("Task #5");
        for (int i = 1904; i < 2096; i = i + 4)
            System.out.println(i + " год является високосным");

        System.out.println("Task #6");
        for (int i = 7; i <= 98; i = i + 7)
            System.out.println(i);

        System.out.println("Task #7");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println(i);

        System.out.println("Task #8");
        int money = 29000;
        int total = 1;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task #9");
        int money1 = 29000;
        int total1 = 1;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + money1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " рублей");
        }

        System.out.println("Task #10");
        int number = 2;
        for (int i = 1; i <= 10; i++)
            System.out.println(number + " * " + i + " = " + number * i);

// Циклы. Урок №2

        System.out.println("Task #1");
        int targetAmount = 2_459_000;
        int monthlyDeposit = 15_000;
        int saving = 0;
        int month = 0;
        while (saving < targetAmount) {
            month++;
            saving += monthlyDeposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + saving + " рублей");
        }

        System.out.println("Task #2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task #3");
        int population = 12_000_000;
        int birthRate = 17;     // Рождаемость на 1000 человек
        int deathRate = 8;      // Смертность на 1000 человек
        for (int year = 1; year <= 10; year++) {
            population += (population / 1000) * (birthRate - deathRate);
            System.out.printf("Год %2d, численность населения составляет %d\n", year, population);
        }

        System.out.println("Task #4");
        double savingsVasily = 15_000;
        double targetVasily = 12_000_000;
        double monthlyInterest = 0.07;
        month = 0;

        while (savingsVasily < targetVasily) {
            month++;
            savingsVasily *= (1 + monthlyInterest);
            System.out.printf("Месяц %3d, сумма накоплений равна %11.2f рублей\n", month, savingsVasily);
        }

        System.out.println("Task #5");
        savingsVasily = 15_000;
        month = 0;

        while (savingsVasily < targetVasily) {
            month++;
            savingsVasily *= (1 + monthlyInterest);
            if (month % 6 == 0) {
                System.out.printf("Месяц %3d, сумма накоплений равна %11.2f рублей\n", month, savingsVasily);
            }
        }

        System.out.println("Task #6");
        savingsVasily = 15_000;
        int years = 9;
        int totalMonths = years * 12;

        for (month = 1; month <= totalMonths; month++) {
            savingsVasily *= (1 + monthlyInterest);
            if (month % 6 == 0) {
                System.out.printf("Месяц %3d, сумма накоплений равна %12.2f рублей\n", month, savingsVasily);
            }
        }

        System.out.println("Task #7");
        int firstFriday = 5;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.printf("Сегодня пятница, %2d-е число. Необходимо подготовить отчет%n", day);
        }

        System.out.println("Task #8");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

        // Массивы. Урок #3

        System.out.println("Task #1");

        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        System.out.println("Массив цифр: ");
        for (int num : first) {
            System.out.println(num + " ");
        }

        double[] doubleArray = {1.57, 7.654, 9.986};
        System.out.println("Массив дробных чисел ");
        for (double num : doubleArray) {
            System.out.println(num + " ");
        }

        int[] freet = {124, 256, 488};

        System.out.println("Task #2");
        for (int z = 0; z < first.length; z++) {
            if (z > 0) {
                System.out.print(", ");
            }
            System.out.print(first[z]);
        }
        System.out.println();

        for (int z = 0; z < doubleArray.length; z++) {
            if (z > 0) {
                System.out.print(", ");
            }
            System.out.print(doubleArray[z]);
        }
        System.out.println();

        for (int z = 0; z < freet.length; z++) {
            if (z > 0) {
                System.out.print(", ");
            }
            System.out.print(freet[z]);
        }

        System.out.println();

        System.out.println("Task #3");
        for (int z = first.length - 1; z >= 0; z--) {
            System.out.print(first[z]);
            if (z > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int z = doubleArray.length - 1; z >= 0; z--) {
            System.out.print(doubleArray[z]);
            if (z > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task #4");
        for (int z = 0; z < first.length; z++) {
            if (first[z] % 2 != 0) {
                first[z] += 1;
            }
        }
        System.out.print(Arrays.toString(first) + " ");
        System.out.println();

        // Массивы 2

        System.out.println("Task #1");

        int[] spending = {2000, 3000, 5500, 5600, 9000};
        int sum = 0;
        for (int expenses : spending) {
            sum += expenses;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task #2");

        int[] expenses = {2000, 3000, 5500, 5600, 9000};
        int minExpenses = expenses[0];
        int maxExpenses = expenses[0];

        for (int expense : expenses) {
            if (expense < minExpenses) {
                minExpenses = expense;
            }
            if (expense > maxExpenses) {
                maxExpenses = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");

        System.out.println("Task #3");

        int[] expenses1 = {2000, 3000, 5500, 5600, 9000};
        int full = 0;
        for (int expense : expenses1) {
            full += expense;
        }
        double average = (double) full / expenses1.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Task #4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int name = reverseFullName.length - 1; name >= 0; name--) {
            System.out.print(reverseFullName[name]);
        }
    }
}