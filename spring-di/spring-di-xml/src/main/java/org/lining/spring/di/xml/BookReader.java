package org.lining.spring.di.xml;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * description:
 * date 2017/10/13
 *
 * @author lining1
 * @version 1.0.0
 */
public class BookReader implements Reader {

    private Book book;

    @Autowired
    public BookReader(Book book) {
        this.book = book;
    }

    public void read() {
        book.content();
    }
}
