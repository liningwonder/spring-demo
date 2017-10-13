package org.lining.spring.di.auto;

import org.springframework.stereotype.Component;

/**
 * description:
 * date 2017/10/13
 *
 * @author lining1
 * @version 1.0.0
 */
@Component("scienceBook")
public class ScienceBook implements Book {

    public void content() {
        System.out.println("This is a science book.");
    }
}
