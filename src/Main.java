public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        // Подготовим набор реальных сотрудников — зарплаты в пределах 50–450, отделы 1–5.
        Employee[] staff = {
                new Employee("Иванов Иван Иванович", 1, 120),
                new Employee("Петров Пётр Петрович", 2, 210),
                new Employee("Сидоров Сергей Николаевич", 3, 340),
                new Employee("Кузнецова Мария Андреевна", 4, 280),
                new Employee("Смирнов Алексей Павлович", 5, 450),
                new Employee("Морозова Анна Викторовна", 2, 160),
                new Employee("Попов Николай Евгеньевич", 1, 90),
                new Employee("Волкова Ольга Сергеевна", 3, 310),
                new Employee("Зайцев Роман Олегович", 4, 380),
                new Employee("Соколова Елена Дмитриевна", 5, 150),
                new Employee("Федорова Дарья Игоревна", 1, 75) // 11-й — проверим переполнение массива
        };

        // 11 раз вызываем addEmployee и печатаем результат (true/false).
        for (Employee e : staff) {
            boolean added = book.addEmployee(e);
            System.out.println("Добавление сотрудника " + e.getFullName() + ": " + added);
        }

        // --- Демонстрация всех методов по ТЗ ---

        // 1) Печать всех сотрудников (for-each + toString, пропуская null)
        System.out.println("\n--- Список сотрудников ---");
        book.printAllEmployees();

        // 2) Средняя зарплата (считаем только до первого null)
        System.out.println("\nСредняя зарплата (до первого null): " + book.getAverageSalary());

        // 3) Налоги: пропорциональные и прогрессивные (switch)
        System.out.println("\n--- Налоги (PROPORTIONAL) ---");
        book.printTaxes("PROPORTIONAL");

        System.out.println("\n--- Налоги (PROGRESSIVE) ---");
        book.printTaxes("PROGRESSIVE");

        // 4) Индексация зарплат отдела 3 на 10% (используем continue для пропусков)
        System.out.println("\n--- Индексация зарплат отдела 3 на 10% ---");
        book.indexSalaryByDepartment(3, 10);
        book.printAllEmployees();

        // 5) Найти первого сотрудника отдела 2 с зарплатой > 200 (for + break + printShortInfo)
        System.out.println("\n--- Первый сотрудник отдела 2 с зарплатой > 200 ---");
        book.findFirstByDepartmentAndSalary(2, 200);

        // 6) Первые 3 сотрудника с зарплатой < 200 (while + break)
        System.out.println("\n--- Первые 3 сотрудника с зарплатой < 200 ---");
        book.findEmployeesByWageLimit(200, 3);

        // 7) Проверка contains (equals сравнивает только зарплату)
        System.out.println("\n--- Проверка contains ---");
        Employee testSameSalaryAsPetrov = new Employee("Произвольный", 4, 210);
        System.out.println("Есть ли сотрудник с такой же зарплатой (210): " + book.contains(testSameSalaryAsPetrov));

        // 8) Поиск по id (пример: id = 3). Если не нашли — выведем сообщение.
        System.out.println("\n--- Поиск по id (пример: id = 3) ---");
        Employee found = book.getById(3);
        if (found != null) found.printShortInfo();
        else System.out.println("Сотрудник с id=3 не найден");

        // 12. Edge-кейсы — проверяем работу методов на пустом и частично заполненном справочнике
        // При разработке ПО важно программировать так, чтобы была защита от долбаебов, ну или чтобы программа не ломалась, если где-то есть деление на 0
        // В будущем будете проходить тему "Exception (Исключения)", там должны научить обрабатывать возможные ошибки приложения
        System.out.println("\n=== Edge-кейсы ===");
        EmployeeBook empty = new EmployeeBook();
        System.out.println("Средняя зарплата в пустом справочнике: " + empty.getAverageSalary());
        System.out.println("Поиск id=999 в пустом справочнике: " + (empty.getById(999) == null));
        System.out.println("contains() в пустом справочнике: " + empty.contains(new Employee("Тест", 1, 100)));
        System.out.println("Поиск первых 2 сотрудников с з/п < 100 в пустом справочнике:");
        empty.findEmployeesByWageLimit(100, 2);
        System.out.println("Первый сотрудник отдела 1 с з/п > 50 в пустом справочнике:");
        empty.findFirstByDepartmentAndSalary(1, 50);

        // Частично заполненный справочник — 2 сотрудника
        EmployeeBook partial = new EmployeeBook();
        partial.addEmployee(new Employee("А", 1, 60));
        partial.addEmployee(new Employee("Б", 2, 80));

        System.out.println("\nСредняя зарплата (частично заполненный): " + partial.getAverageSalary());
        System.out.println("Налоги (PROPORTIONAL) по частично заполненному:");
        partial.printTaxes("PROPORTIONAL");

        // Индексация на 0% — зарплата не меняется, по ТЗ должны применить continue
        System.out.println("Индексация отдела 1 на 0% (ожидаем пропуск via continue):");
        partial.indexSalaryByDepartment(1, 0);
        partial.printAllEmployees();

        System.out.println("Найти в отделе 2 > 70:");
        partial.findFirstByDepartmentAndSalary(2, 70);

        System.out.println("Первые 1 сотрудник с з/п < 100:");
        partial.findEmployeesByWageLimit(100, 1);
    }
}
