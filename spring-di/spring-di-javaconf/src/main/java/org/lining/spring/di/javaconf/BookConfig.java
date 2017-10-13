package org.lining.spring.di.javaconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * date 2017/10/13
 *
 * @author lining1
 * @version 1.0.0
 */
@Configuration
public class BookConfig {

    @Bean
    public Reader reader() {
        return new BookReader(book());
    }

    @Bean
    public Book book() {
        return new ScienceBook();
    }
}
