package test;

import club.borderlands.dao.RootMapper;
import club.borderlands.pojo.Root;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RootMapperTest {
    ApplicationContext context;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring-dao.xml");
    }
    @Test
    public void testGetRoot(){
        RootMapper rootMapper= (RootMapper) context.getBean("rootMapper");
        Root root=rootMapper.getRoot("edson123","123456");
        System.out.println(root.getAdmin()+"   "+root.getPassword());
    }
}
