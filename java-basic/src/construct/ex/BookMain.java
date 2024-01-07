package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Hello Java", "Seo");
        book1.displayInfo();
        Book book2 = new Book("JPA 프로그래밍", "kim", 700);
        book2.displayInfo();
        Book book3 = new Book();
        book3.displayInfo();
    }
}
