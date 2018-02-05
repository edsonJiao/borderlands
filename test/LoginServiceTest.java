package test;

import club.borderlands.dao.AdminMapper;
import club.borderlands.pojo.Admin;
import club.borderlands.service.LoginService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.DocFlavor;

public class LoginServiceTest {
    ApplicationContext context;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring-dao.xml");
    }
    @Test
    public void testRegister(){
        String admin="aaaaaa";
        String password="123456789";
        String name="我爱中国";
        int addressId=1;
        LoginService loginService= (LoginService) context.getBean("loginService");
        int code=loginService.register(admin,password,name,addressId);
        System.out.println(code);
    }
    @Test
    public void testLogin(){
        LoginService loginService= (LoginService) context.getBean("loginService");
        Admin admin=loginService.login("aaaaaa","123456789");
        System.out.println(admin.getName());
    }
}
