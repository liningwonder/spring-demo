package org.lining.spring.di.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * description:
 * date 2017/10/13
 *
 * @author lining1
 * @version 1.0.0
 */
@Component("bookReader2")
public class BookReader2 implements Reader {

    private Book book;

    @Autowired
    @Qualifier("scienceBook")
    public void setBook(Book book) {
        this.book = book;
    }

    public void read() {
        book.content();
    }
}
