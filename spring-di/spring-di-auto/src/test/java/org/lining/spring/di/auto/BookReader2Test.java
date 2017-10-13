package org.lining.spring.di.auto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * description:
 * date 2017/10/13
 *
 * @author lining1
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookConfig.class)
public class BookReader2Test {

    @Autowired
    private Book book;

    @Autowired
    @Qualifier("bookReader2")
    private Reader reader;

    @Test
    public void read() {
        reader.read();
    }
}
