package org.lining.spring.di.auto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * description:
 * date 2017/10/13
 *
 * @author lining1
 * @version 1.0.0
 */
@Component("programmingBook")
@Primary
public class ProgrammingBook implements Book {

    public void content() {
        System.out.println("This is a programming book.");
    }
}
