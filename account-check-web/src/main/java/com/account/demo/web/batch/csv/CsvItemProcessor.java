package com.account.demo.web.batch.csv;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * @author chengchenrui
 * @version Id: CsvItemProcessor.java, v 0.1 2017.2.27 15:43 chengchenrui Exp $$
 */
@Component("csvItemProcessor")
public class CsvItemProcessor implements ItemProcessor<StudentCsv, StudentCsv> {

    /**
     * 对数据进行转换
     * @param item
     * @return
     * @throws Exception
     */
    public StudentCsv process(StudentCsv item) throws Exception {

        item.setName(item.getStudentId() + "--" + item.getName());
        item.setAge(item.getAge() + 2);
        item.setScore(item.getScore() + 10);

        return item;
    }
}
