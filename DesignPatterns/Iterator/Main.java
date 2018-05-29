package Iterator;

public class Main {
    public static void main(String[] args){
        BookShelf bookShelf=new BookShelf(4);

        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Godfather"));
        bookShelf.appendBook(new Book("Halmet"));
        Iterator it=bookShelf.iterator();
        while(it.hasNext()){
            Book book=(Book)it.next();
            System.out.println(book.getName());
        }
    }
}
