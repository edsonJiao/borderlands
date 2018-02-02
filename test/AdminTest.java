package test;

import club.borderlands.dao.AdminMapper;
import club.borderlands.pojo.Admin;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class AdminTest {
    ApplicationContext context;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring-dao.xml");
    }
    @Test
    public void testInsert(){
        AdminMapper adminMapper= (AdminMapper) context.getBean("adminMapper");
        adminMapper.insertAdmin("edson123","123456","edson",1);
    }
    @Test
    public void testSelect(){
        AdminMapper adminMapper= (AdminMapper) context.getBean("adminMapper");
        Admin admin=adminMapper.getUser("edson123","123456");
        System.out.println(admin.getAdmin()+"  "+admin.getPassword());
    }
}
