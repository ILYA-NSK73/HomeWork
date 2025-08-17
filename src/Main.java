public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        int age = 24;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " года, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " года, то он несовершеннолетний, и стоит немного подождать");
        }

        System.out.println("Task #2");
        int temperature = 12;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
            if (temperature >= 5) {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
            }


        System.out.println("Task #3");
        int speed = 90;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч то придётся заплатить");
        } else {
            System.out.println("Если скорость " + speed + " км/ч то можно ехать спокойно");
            }

        System.out.println("Task #4");
        int year = 10;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в детский сад");
        } else if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в школу");
        } else if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в университет");
        } else if (year > 24) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить на работу");
        }

        System.out.println("Task #5");
        int year1 = 4;
        if (year1 <= 5) {
            System.out.println("Если возраст ребёнка равен " + year1 + " то ему нельзя кататься на аттракционе");
        } else if (year1 > 5 && year1 <= 14) {
            System.out.println("Если возраст ребёнка равен " + year1 + " то ему можно кататься на аттракционе в сопровождении");
        } else if (year1 > 14) {
            System.out.println("Если возраст ребёнка равен " + year1 + " то ему можно кататься на аттракционе без сопровождения");
        }

        System.out.println("Task #6");
        int passengers = 48;
        if (passengers < 60) {
            System.out.println("Есть сидячие места");
        } else if (passengers >= 60 && passengers <= 102) {
            System.out.println("Есть стоячие места");
        } else if (passengers > 102) {
            System.out.println("Свободных мест - нет");
        }

        System.out.println("Task #7");
        int one = 3;
        int two = 6;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else if (three > one && three > two) {
            System.out.println("Третье число самое большое");
        }
    }
}