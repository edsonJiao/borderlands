package test;

import club.borderlands.service.MessageService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.time.LocalDate;

public class MessageServiceTest {
    ApplicationContext context;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring-dao.xml");
    }
    @Test
    public void testInsertTempMessage(){
        MessageService messageService= (MessageService) context.getBean("messageService");
        int id=1;
        String messagetitle="aaaaaaaaaaa中";
        String content="b";
        int result=messageService.insertTempMessage(id,Date.valueOf(LocalDate.now()),messagetitle,content);
        System.out.println(result);
    }
}
