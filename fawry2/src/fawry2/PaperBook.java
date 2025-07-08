package fawry2;

class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        super(isbn, title, author, year, price);
        this.stock = stock;
    }

    public boolean reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    @Override
    public boolean isForSale() { return true; }

    @Override
    public void handleDelivery(String email, String address) {
        System.out.println("book store: shipping paper book to " + address);
    }
}