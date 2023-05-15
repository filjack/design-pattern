package com.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xpf
 * @since 2023/5/15 23:30
 */
public class BookShelf implements Aggregate {

    private List<Book> books;
    private int last;

    public BookShelf() {
        books = new ArrayList<>();
        last = 0;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(last++, book);
    }

    public int getLength() {
        return last;
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
