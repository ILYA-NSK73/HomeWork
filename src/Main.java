public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int a = 5555;
        System.out.println("Значение переменной c типом " + "int" + " равно " + a);
        byte b = -50;
        System.out.println("Значение переменной c типом " + "byte" + " равно " + b);
        short c = -1520;
        System.out.println("Значение переменной c типом " + "short" + " равно " + c);
        long d = 900450000L;
        System.out.println("Значение переменной c типом " + "long" + " равно " + d);
        float e = 35.6545659f;
        System.out.println("Значение переменной c типом " + "float" + " равно " + e);
        double f = 885.8898778999752225;
        System.out.println("Значение переменной c типом " + "double" + " равно " + f);

        // Наставник, если, что я специально вышел за пределы допустимых знаков после запятой
        // Чтобы увидеть принципы работы той или иной команды!

        System.out.println("Задача №2");

        float g = (float) 27.12;
        System.out.println("Значение переменной " + g + " будет float");
        long h = 987678965549L;
        System.out.println("Значение переменной " + h + " будет long");

        // Значение "2,786" не может быть прописано в Java из-за запятой. Его можно  записать только так

        double i = 2.786;
        System.out.println("Значение переменной " + i + " будет double");
        int j = 569;
        System.out.println("Значение переменной " + j + " будет int");
        short k = -159;
        System.out.println("Значение переменной " + k + " будет short");
        short l = 27897;
        System.out.println("Значение переменной " + l + " будет short");
        byte m = 67;
        System.out.println("Значение переменной " + m + " будет byte");

        System.out.println("Задача №3");

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        int totalStudents = lP + aS + eA;
        System.out.println("Всего учеников на 3 класса " + totalStudents + " человек");
        short totalSheets = 480;
        System.out.println("Учителя закупили на 3 класса " + totalSheets + " листов бумаги");
        int sheets = totalSheets / totalStudents;
        System.out.println("На каждого ученика расчитано " + sheets + " листов бумаги");

        System.out.println("Задача №4");

        byte efficiency = 16;
        byte time = 2;
        System.out.println("За " + time + " минуты машина произвела " + efficiency + " штук бутылок");
        byte in1Minutes = (byte) (time / 2);
        byte in1efficience = (byte) (efficiency / time);
        System.out.println("За " + in1Minutes + " минуту машина произвела " + in1efficience + " штук бутылок");
        byte in20Minutes = 20;
        short in20Efficience = (short) (in20Minutes * in1efficience);
        System.out.println("За " + in20Minutes + " минут машина произвела " + in20Efficience + " штук бутылок");

        byte day = 24;
        System.out.println(day + " часа - это сутки");
        byte oneHour = 60;
        System.out.println(oneHour + " минут " + "один час");
        int minutes = day * oneHour;
        System.out.println("В сутках " + minutes + " минут");
        int in24Efficience = minutes * in1efficience;
        System.out.println("За " + day + " часа машина произвела " + in24Efficience + " штук бутылок");

        int day3 = day * 3;
        System.out.println("В трёх днях " + day3 + " часа");
        int hour72 = day3 * oneHour;
        System.out.println(hour72 + " минут за трое суток");
        int in72Efficience = hour72 * in1efficience;
        System.out.println("За " + day3 + " часа машина произвела " + in72Efficience + " штук бутылок");

        int mountAugust = day * 31;
        System.out.println("В месяце " + mountAugust + " часов");
        int mount = mountAugust * oneHour;
        System.out.println(mount + " минут за месяце");
        long mount1 = mount * in1efficience;
        System.out.println("За " + mountAugust + " часа машина произвела " + mount1 + " штук бутылок");

        System.out.println("Задача №5");

        byte totalCans = 120;
        System.out.println("Всего " + totalCans + " банок");
        byte cansWhite = 2;
        byte cansBrown = 4;
        int cansOneClass = cansBrown + cansWhite;
        System.out.println("На один класс уходит " + cansOneClass + " банок");
        byte totalClasses = (byte) (totalCans / cansOneClass);
        System.out.println("В школе всего " + totalClasses + " классов");
        byte totalWhite = (byte) (totalClasses * cansWhite);
        System.out.println("Всего нужно " + totalWhite + " банок белой краски на школу");
        int totalBrown = totalClasses * cansBrown;
        System.out.println("Всего нужно " + totalBrown + " банок коричневой краски на школу");
        System.out.println("В школе, где " + totalClasses + " классов,нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричевой краски");

        System.out.println("Задача №6");

        short banan = 5;
        short bananaMass = 80;
        int totalBanan = banan * bananaMass;
        System.out.println(totalBanan + " грамм банана");
        short milk = 2;
        short milkMass = 105;
        int totalMilk = milk * milkMass;
        System.out.println(totalMilk + " грамм молока");
        short iceCreamSundae = 2;
        short iceCreamSundaeMass = 100;
        int totalIceCream = iceCreamSundae * iceCreamSundaeMass;
        System.out.println(totalIceCream + " грамм мороженного");
        short rawEggs = 4;
        short rawEggsMass = 70;
        int totalRaw = rawEggs * rawEggsMass;
        System.out.println(totalRaw + " грамм яиц");
        int totalGram = totalBanan + totalMilk + totalIceCream + totalRaw;
        System.out.println(totalGram + " грамм весит завтрак спортсмена");
        float gramInKilogram = (float) 1000;
        System.out.println(gramInKilogram + " грамм в одном килограмме");
        float totalKilogram = totalGram / gramInKilogram;
        System.out.println(totalKilogram + " килограмм, весит завтрак спортсмена");

        System.out.println("Задача №7");

        byte kilo = 7;
        System.out.println(kilo + " кг нужно сброосить спортсмену");
        short min = 250;
        System.out.println(min + " грамм - минимальный вес который спортсмен может сбросить в день");
        short max = 500;
        System.out.println(max + " грамм - вес который максимум спортсмен может сбросить в день");
        long gram = 1000l;
        Long gramInKilo = kilo * gram;
        System.out.println(gramInKilo + " грамм в 7 килограммах");
        long minTime = gramInKilo / min;
        System.out.println(minTime + " дней понадобится для достижения заданного веса");
        long maxTime = gramInKilo / max;
        System.out.println(maxTime + " дней понадобится для достижения заданного веса");
        long average = (minTime + maxTime) / 2;
        System.out.println(average + " день в среднем понадобится для достижения заданного веса");

        System.out.println("Задача №8");

        int masha = 67760;
        System.out.println(masha + " рублей составляет Машина зарплата");
        float raising = 0.1F;
        System.out.println("Возьмём " + raising + " как за 10%");
        float raisingMasha = masha * raising;
        System.out.println("На " + raisingMasha + " вырастит месячная зарплата у Маши");
        float newZpMasha = masha + raisingMasha;
        System.out.println(newZpMasha + " рублей теперь получает Маша");
        float year = masha * 12;
        System.out.println(year + " рублей составляла годовая зарплата Маши");
        float newSalary = newZpMasha * 12;
        System.out.println(newSalary + " рублей составляет годовая зарплата Маши");
        float difference = newSalary - year;
        System.out.println("Маша теперь получает " + newZpMasha + " рублей. Годовой доход  вырос на " + difference);

        int denis = 83690;
        System.out.println(denis + " рублей составляет зарплата Дениса");
        float raisingDenis = denis * raising;
        System.out.println("На " + raisingDenis + " вырастит месячная зарплата у Дениса");
        float newZpDenis = denis + raisingDenis;
        System.out.println(newZpDenis + " рублей теперь получает Денис");
        float years = denis * 12;
        System.out.println(years + " рублей составляла годовая зарплата Дениса");
        float newSalary1 = newZpDenis * 12;
        System.out.println(newSalary1 + " рублей составляет годовая зарплата Дениса");
        float difference1 = newSalary1 - years;
        System.out.println("Денис теперь получает " + newZpDenis + " рублей. Годовой доход  вырос на " + difference1);

        int kristina = 76230;
        System.out.println(kristina + " рублей составляет зарплата Кристины");
        float raisingKristina = kristina * raising;
        System.out.println("На " + raisingKristina + " вырастит месячная зарплата у Кристины");
        float newZpKristina = kristina + raisingKristina;
        System.out.println(newZpKristina + " рублей теперь получает Кристина");
        float years1 = kristina * 12;
        System.out.println(years1 + " рублей составляла годовая зарплата Кристины");
        float newSalary2 = newZpKristina * 12;
        System.out.println(newSalary2 + " рублей составляет годовая зарплата Кристины");
        float difference2 = newSalary2 - years1;
        System.out.println("Кристина теперь получает " + newZpKristina + " рублей. Годовой доход  вырос на " + difference2);

    }
}