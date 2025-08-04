/**
 * Хранилище сотрудников на основе массива фиксированного размера Employee[10].
 * Здесь реализованы все операции по ТЗ: печать, средняя зарплата, налоги,
 * индексация по отделу, поиски с разными циклами и т. д.
 */
public class EmployeeBook {
    // Массив на 10 элементов — «книга» сотрудников.
    private final Employee[] employees = new Employee[10];

    /**
     * Добавление сотрудника в первую свободную ячейку.
     * Ищем место с начала массива. Если свободного места нет — возвращаем false.
     */
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    /**
     * Вывод всех сотрудников, кроме null.
     * Требование ТЗ: использовать for-each и печатать через toString().
     */
    public void printAllEmployees() {
        for (Employee e : employees) {          // for-each по всему массиву
            if (e != null) {                    // пропускаем пустые ячейки
                System.out.println(e);
            }
        }
    }

    /**
     * Средняя зарплата. По ТЗ считаем количество только до первого null.
     * Это имитирует «последовательное» заполнение массива.
     */
    public double getAverageSalary() {
        int count = 0;
        int sum = 0;
        for (Employee e : employees) {
            if (e == null) break;               // как только встретили null — дальше не считаем
            sum += e.getSalary();
            count++;
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    /**
     * Печать налогов для каждого сотрудника.
     * Тип расчёта задаётся строкой: PROPORTIONAL или PROGRESSIVE.
     * По ТЗ нужен switch и такие правила:
     * PROPORTIONAL: всегда 13%
     * PROGRESSIVE: до 150 — 13%, до 350 — 17%, выше 350 — 21%
     */
    public void printTaxes(String type) {
        if (type == null) type = "PROPORTIONAL";
        String t = type.toUpperCase();

        for (Employee e : employees) {
            if (e == null) continue;            // пропускаем пустые ячейки
            double tax;
            switch (t) {
                case "PROGRESSIVE":
                    int s = e.getSalary();
                    if (s <= 150) tax = s * 0.13;
                    else if (s <= 350) tax = s * 0.17;
                    else tax = s * 0.21;
                    break;
                case "PROPORTIONAL":
                default:
                    tax = e.getSalary() * 0.13;
                    break;
            }
            System.out.println(e.getFullName() + ": налог = " + tax);
        }
    }

    /**
     * Индексация зарплат по отделу на заданный процент.
     * По ТЗ должны использовать continue для пропуска случаев,
     * когда зарплата не меняется (percent == 0) или сотрудник из другого отдела.
     */
    public void indexSalaryByDepartment(int department, int percent) {
        for (Employee e : employees) {
            if (e == null) continue;                 // пустая ячейка — пропускаем
            if (percent == 0) continue;              // индексация 0% — пропускаем
            if (e.getDepartment() != department) continue; // другой отдел — тоже пропускаем

            int current = e.getSalary();
            int delta = (current * percent) / 100;   // простая индексация в процентах
            e.setSalary(current + delta);
        }
    }

    /**
     * Найти первого сотрудника заданного отдела с зарплатой больше указанной.
     * По ТЗ используем цикл for и оператор break, а вывод делаем через printShortInfo().
     */
    public void findFirstByDepartmentAndSalary(int department, int minSalary) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e != null && e.getDepartment() == department && e.getSalary() > minSalary) {
                System.out.print("Порядковый номер: " + (i + 1) + " — ");
                e.printShortInfo();             // короткий вывод: ФИО + зарплата
                break;                          // нашли первого — завершаем поиск
            }
        }
    }

    /**
     * Вывести первых employeeNumber сотрудников с зарплатой меньше wage.
     * По ТЗ использовать цикл while и оператор break (для досрочного выхода, когда набрали нужное количество).
     */
    public void findEmployeesByWageLimit(int wage, int employeeNumber) {
        int found = 0;      // сколько уже вывели
        int i = 0;          // индекс по массиву
        while (i < employees.length) {
            if (found >= employeeNumber) break; // как только нашли нужное количество — выходим
            Employee e = employees[i];
            if (e != null && e.getSalary() < wage) {
                e.printShortInfo();
                found++;
            }
            i++;            // не забываем двигать индекс
        }
    }

    /**
     * Проверка наличия «такого же» сотрудника с точки зрения бухгалтерии.
     * equals() у Employee сравнивает только зарплату.
     */
    public boolean contains(Employee target) {
        for (Employee e : employees) {
            if (e != null && e.equals(target)) return true;
        }
        return false;
    }

    /**
     * Поиск сотрудника по его id. Если не нашли — возвращаем null.
     */
    public Employee getById(int id) {
        for (Employee e : employees) {
            if (e != null && e.getId() == id) return e;
        }
        return null;
    }
}