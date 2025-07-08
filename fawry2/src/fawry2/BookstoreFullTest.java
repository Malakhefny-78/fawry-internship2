package fawry2;

public class BookstoreFullTest {
    public static void main(String[] args) {
        Bookstore store = new Bookstore();

        store.addBook(new PaperBook("111", "Java Basics", "John Smith", 2015, 50, 10));
        store.addBook(new EBook("222", "Python 101", "Jane Doe", 2019, 30, "pdf"));
        store.addBook(new ShowcaseBook("333", "Functional JavaScript", "Linda Matthews", 2017));

        store.removeOutdatedBooks(10);        
       //store.removeOutdatedBooks(1);

       store.buyBook("111", 2, "Malak@google.com", "Smouha,Alexandria");
     //  store.buyBook("111", 30, "Malak@google.com", "Smouha,Alexandria");
       store.buyBook("222", 2, "Malak1@google.com", "");
      // store.buyBook("333", 1, "Malak2@google.com", "");
        
    //not sale book
        try {
            store.buyBook("444", 1, "Malak2@google.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
