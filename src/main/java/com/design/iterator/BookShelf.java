package com.design.iterator;

/**
 * @author xpf
 * @since 2023/5/15 23:30
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf() {

    }

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last++] = book;
    }

    public int getLength() {
        return last;
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
