//3. Library & Book:-
//        ==============
//
//Create:
//        - Book class → bookId, bookName
//- Library class → libraryName, Book book
//Assign a Book object to Library from main method.

public class Library {
    String libraryname;
    Book book;

    void libraryDetails(){
        System.out.println("The libraryname is " + libraryname);
    }

    public static void main(String[] args){

        Library library = new Library();
        library.libraryname = "StudyGlobe";
        library.book = new Book();
        library.book.bookId = 345;
        library.book.bookName = "Atomic Habits";
        library.libraryDetails();
        library.book.bookDetails();
    }
}
