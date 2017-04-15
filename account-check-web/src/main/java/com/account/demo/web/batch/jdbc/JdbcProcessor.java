package com.account.demo.web.batch.jdbc;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * @author chengchenrui
 * @version Id: JdbcProcessor.java, v 0.1 2017.3.8 15:00 chengchenrui Exp $$
 */
@Component("jdbcProcessor")
public class JdbcProcessor implements ItemProcessor<User,User>{

    public User process(User item) throws Exception {

        item.setUpdateTime(new Date());
        item.setUpdateUser("ADMIN");

        return item;
    }
}
