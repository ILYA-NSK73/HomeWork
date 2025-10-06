public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Роберт", "Мартин");
        Author author2 = new Author("Дмитрий", "Глуховский");
        Book book1 = new Book("Чистый код", author1,2024);
        Book book2 = new Book("Метро 2035", author2, 2024);

        book2.setPublicationYear(2021);

        System.out.println("Книга: " + book1.getName() + " - Автор " + author1.getFirstName() + ". Год издания " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getName() + " - Автор " + author2.getFirstName() + ". Год издания " + book2.getPublicationYear());

        System.out.println(book1.equals(book1));
        System.out.println(book1);

        System.out.println(book2.equals(book2));
        System.out.println(book2);
    }
}