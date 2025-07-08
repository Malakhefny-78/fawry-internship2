package fawry2;

import java.util.*;

class Bookstore {
    private List<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("book store: added book " + book.title);
    }

    public void removeOutdatedBooks(int yearsOld) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        inventory.removeIf(book -> currentYear - book.getYear() > yearsOld);
        System.out.println("Book store: removed outdated books.");
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isForSale()) {
                    throw new IllegalArgumentException("book store: book not for sale");
                }

                if (book instanceof PaperBook) {
                    PaperBook pb = (PaperBook) book;
                    if (!pb.reduceStock(quantity)) {
                        throw new IllegalArgumentException("book store: not enough stock");
                    }
                }

                double total = book.getPrice() * quantity;
                book.handleDelivery(email, address);
                System.out.println("book store: total paid = " + total);
                return total;
            }
        }

        throw new IllegalArgumentException("book store: book not found");
    }
}
