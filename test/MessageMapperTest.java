package test;

import club.borderlands.dao.MessageMapper;
import club.borderlands.pojo.Message;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


public class MessageMapperTest {
    ApplicationContext context;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring-dao.xml");
    }
    @Test
    public void testInsertMessage(){
        MessageMapper mapper= (MessageMapper) context.getBean("messageMapper");
        mapper.insertMessage(1,Date.valueOf(LocalDate.now()),"title2","content");
    }
    @Test
    public void testSelectByTitle(){
        MessageMapper mapper= (MessageMapper) context.getBean("messageMapper");
        List<Message> list=mapper.selectByTitle("tit");
        for (Message message:list) {
            System.out.println(message.getId());
        }
    }
    @Test
    public void testFindAll(){
        MessageMapper mapper= (MessageMapper) context.getBean("messageMapper");
        List<Message> list=mapper.findAll(1);
        for (Message message:list) {
            System.out.println(message.getId());
        }
    }
    @Test
    public void testDelete(){
        MessageMapper mapper= (MessageMapper) context.getBean("messageMapper");
        mapper.deleteById(3);
    }
}
