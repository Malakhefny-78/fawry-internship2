package fawry2;

class EBook extends Book {
    private String filetype;

    public EBook(String isbn, String title, String author, int year, double price, String filetype) {
        super(isbn, title, author, year, price);
        this.setFiletype(filetype);
    }

    @Override
    public boolean isForSale() { return true; }

    @Override
    public void handleDelivery(String email, String address) {
        System.out.println("book store: sending ebook to " + email);
    }

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
}