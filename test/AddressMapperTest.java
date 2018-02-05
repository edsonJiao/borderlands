package test;

import club.borderlands.dao.AddressMapper;
import club.borderlands.pojo.Address;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AddressMapperTest {

    ApplicationContext context;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring-dao.xml");
    }
    @Test
    public void testSelectByName(){
        AddressMapper mapper= (AddressMapper) context.getBean("addressMapper");
        List<Address> list=mapper.selectByName("青岛大学");
        for (Address address:list) {
            System.out.println(address.getAddressId());
        }
    }
    @Test
    public void testSelectById(){
        AddressMapper mapper= (AddressMapper) context.getBean("addressMapper");
        Address address=mapper.selectById(1);
        System.out.println(address.getSchoolName());
    }
}
