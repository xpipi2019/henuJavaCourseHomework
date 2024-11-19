/**
 * @author XPIPI
 */
class Book {
    private String bookNo;
    private String bookTitle;
    private String author;
    private int yearPublished;
    public Book() {}
    //初始化

    public Book(String bookNo, String bookTitle, String author, int yearPublished) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void showBookNo() {
        System.out.println(bookNo);
    }

    public void showBookTitle() {
        System.out.println(bookTitle);
    }

    public void showAuthor() {
        System.out.println(author);
    }

    public void showYearPublished() {
        System.out.println(yearPublished);
    }

    public void modifyYearPublished(int newYear) {
        this.yearPublished = newYear;
    }
}
public class S3_1 {
    public static void main(String[] args) {
        Book b1 = new Book("ISBN123456789", "Java Programming", "John Doe", 2024);
        Book b2 = new Book("ISBN987654321", "Data Structures", "Jane Smith", 2023);

        System.out.println("Book 1:");
        b1.showBookNo();
        b1.showBookTitle();
        b1.showAuthor();
        b1.showYearPublished();

        System.out.println("Book 2:");
        b2.showBookNo();
        b2.showBookTitle();
        b2.showAuthor();
        b2.showYearPublished();

        b1.modifyYearPublished(2021);
        System.out.println("Book 1 after modified year published:");
        b1.showBookNo();
        b1.showBookTitle();
        b1.showAuthor();
        b1.showYearPublished();
    }
}
