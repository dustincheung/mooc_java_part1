import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(){ }

    public void addBook(Book newBook){
        books.add(newBook);
    }

    public void printBooks(){
        for(Book book : this.books){
            System.out.print(book.title() + ", " + book.publisher() + ", " + book.year());
            System.out.println("");
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : this.books){
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : this.books){
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : this.books){
            if(year == book.year()){
                found.add(book);
            }
        }
        return found;
    }
}
