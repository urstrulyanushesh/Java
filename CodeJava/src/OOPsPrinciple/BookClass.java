package OOPsPrinciple;

public class BookClass {
    static int totalBooks;
    String title;
    String author;
    String isbn; //BookId
    boolean isBorrowed;

    static {
        totalBooks=0;
    }

    { //init of obj
        totalBooks++;
    }

    BookClass(String isbn,String title,String author){//Parameterized Constructor
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    BookClass(String isbn){
        this(isbn, " Unknown", " Unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy" +this.title);
        }
    }
    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you Enjoy it");
        } else {
            System.out.println("Already in library");
        }
    }

    public static void main(String[] args) {
        BookClass SAD=new BookClass("1A"," System", " Van Dok" );
        BookClass DisStr=new BookClass("11A");
        System.out.println(BookClass.getTotalBooks());
        SAD.borrowBook();
        DisStr.borrowBook();
        SAD.borrowBook();
        SAD.returnBook();
        SAD.returnBook();
        System.out.println();
    }
}

