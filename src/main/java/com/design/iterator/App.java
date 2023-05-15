package com.design.iterator;

/**
 * @author xpf
 * @since 2023/5/15 23:34
 */
public class App {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(((Book) iterator.next()).getName());
        }
    }

}
