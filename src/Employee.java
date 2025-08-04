/**
 * Класс описывает одного сотрудника.
 * Здесь храним ФИО, номер отдела (1–5), зарплату (50–450) и уникальный id.
 * id генерируется автоматически на основе статического счётчика.
 */
public class Employee {
    // Статический счётчик — общее для всех объектов значение.
    // Каждый новый Employee получает текущий counter и увеличивает его.
    private static int counter = 1;

    // Поля делаем private по ТЗ, доступ — через геттеры/сеттеры.
    private final int id;       // Уникальный идентификатор, присваивается один раз в конструкторе
    private final String fullName;    // ФИО сотрудника
    private int department;     // Номер отдела (1–5)
    private int salary;         // Зарплата (50–450)

    /**
     * Все поля (кроме id) передаются через конструктор.
     * id берём из счётчика и сразу увеличиваем его.
     */
    public Employee(String fullName, int department, int salary) {
        this.id = counter++;           // Берём текущее значение counter и сразу готовим следующее
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    // --- Геттеры: позволяем читать все поля ---
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    // --- Сеттеры: по ТЗ можно менять только отдел и зарплату ---
    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Контракт equals() по ТЗ: сравниваем сотрудников только по зарплате.
     * Это «бухгалтерская» логика — важен размер выплаты.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return this.salary == other.salary;
    }

    /**
     * Удобное строковое представление — выводим все поля.
     * Используется при печати списка сотрудников.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    /**
     * Короткий вывод: только ФИО и зарплата.
     * По ТЗ печатаем через System.out.println внутри метода.
     */
    public void printShortInfo() {
        System.out.println(fullName + " — зарплата: " + salary);
    }
}