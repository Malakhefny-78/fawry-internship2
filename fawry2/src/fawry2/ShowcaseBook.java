package fawry2;

class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, String author, int year) {
        super(isbn, title, author, year, 0.0);
    }

    @Override
    public boolean isForSale() { return false; }

    @Override
    public void handleDelivery(String email, String address) {
        System.out.println("book store: showcase book - not for sale.");
    }
}