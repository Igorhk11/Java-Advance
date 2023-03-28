package Library_02;

import Book_01.Book;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book...books) {
        this.books = books;
    }


    @Override
    public Iterator<Book> iterator() {
        return new LibIterator() {
        };
    }

    private class LibIterator implements Iterator<Book> {
        private int counter;


        public LibIterator() {
            this.counter =0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            Book result = books[this.counter];
            this.counter++;

            return result;
        }

    }

}
