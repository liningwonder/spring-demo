package org.lining.spring.di.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * description:
 * date 2017/10/13
 *
 * @author lining1
 * @version 1.0.0
 */
@Component("bookReader")
public class BookReader implements Reader {

    Book book;

    @Autowired
    public BookReader(Book book) {
        this.book = book;
    }

    public void read() {
        book.content();
    }
}
