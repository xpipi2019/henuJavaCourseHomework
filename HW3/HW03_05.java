/**
 * @author XPIPI
 */
class TheBook {
    private int bookId;
    private String title;
    private String author;
    private boolean isBorrowed;

    public TheBook(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBookStatus(boolean nowStatus) {
        this.isBorrowed = nowStatus;
    }
}

class LibraryCard {
    private TheBook borrowedBook;
    public void borrowBook(TheBook book) {
        borrowedBook = book;
        System.out.println("已借阅: " + book.getTitle());
    }

    public void returnBook() {
        if (borrowedBook != null) {
            System.out.println("已归还: " + borrowedBook.getTitle());
            //borrowedBook = null;
            borrowedBook.setBookStatus(false);
        } else {
            System.out.println("当前没有借阅的书籍。");
        }
    }
}

class Student {
    private int studentId;
    String name;
    private LibraryCard card;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.card = new LibraryCard();
    }

    public void borrowBook(Operation operation, String bookTitle) {
        TheBook book = operation.findBookByTitle(bookTitle);
        if (book != null && !book.isBorrowed()) {
            card.borrowBook(book);
            book.setBookStatus(true);
        } else {
            System.out.println("没有借到书: " + bookTitle);
        }
    }

    public void returnBook(Operation operation) {
        card.returnBook();
    }
}

class Operation {
    private TheBook[] books;

    public Operation() {
        books = new TheBook[2];
        books[0] = new TheBook(1, "Java Programming", "John Doe");
        books[1] = new TheBook(2, "Data Structures", "Jane Smith");
    }

    public TheBook findBookByTitle(String title) {
        for (TheBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(Student student, String bookTitle) {
        student.borrowBook(this, bookTitle);
    }

    public void returnBook(Student student) {
        student.returnBook(this);
    }
}

public class HW03_05 {
    public static void main(String[] args) {
        Operation operation = new Operation();

        Student student1 = new Student(1, "张三");
        Student student2 = new Student(2, "李四");

        System.out.println(student1.name + " 来到图书馆:");
        operation.borrowBook(student1, "Java Programming");

        System.out.println(student2.name + " 来到图书馆:");
        operation.borrowBook(student2, "Java Programming");

        System.out.println(student1.name + " 来到图书馆:");
        operation.returnBook(student1);

        System.out.println(student2.name + " 来到图书馆:");
        operation.returnBook(student2);
        operation.borrowBook(student2, "Java Programming");
    }
}
