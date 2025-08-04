public class Main {
    public static void main(String[] args){
        System.out.println("Задача №1");
        var dog = 8.0;
       System.out.println(dog);
       var cat = 3.6;
       System.out.println(cat);
       var paper = 763789;
       System.out.println(paper);

        System.out.println("Задача №2");
        dog = dog * 4;
        System.out.println(dog);
        cat = cat * 4;
        System.out.println(cat);
        paper = paper *4;
        System.out.println(paper);

        System.out.println("Задача №3 (Возможно я сделал не верно, потому что по своему понял задание!! Но итоговый результат я считаю верен!");
        dog = dog - 3.5;
       System.out.println(dog);
       cat = cat - 1.6;
       System.out.println(cat);
       paper = paper - 7639;
       System.out.println(paper);

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача №6");
        var theboxer1 = 78.2;
        System.out.println(theboxer1);
        var theboxer2 = 82.7;
        System.out.println(theboxer2);
        var totalWeight = theboxer1 + theboxer2;
        System.out.println("Общий вес боксёров " + totalWeight + " кг");
        var difference = theboxer2 - theboxer1;
        System.out.println("Разница в весе бойцов " + difference + " кг");

        System.out.println("Задача №7");
        var remains = (theboxer2 / theboxer1) % totalWeight;
        System.out.println("Остаток от деления составляет " + remains + " кг");

        System.out.println("Задача №8");
        var totalHours = 640;
        System.out.println("Всего " + totalHours +  " часов");
        var worker1 = 8;
        System.out.println("Один сотрудник посвещает работе " + worker1 + " часов");
        var totalWorker = totalHours / worker1;
        System.out.println("Всего работник в комании " + totalWorker +   " человек");
        totalWorker = totalWorker + 94;
        System.out.println("Если в комании работает " + totalWorker + " человека" );
        var totalHours1 = totalHours /  totalWorker;
        System.out.println("то всего " + totalHours1 + " по часа работы может быть поделено между сотрудниками");










    }
}