package test;

import club.borderlands.dao.PictureMapper;
import club.borderlands.pojo.Picture;
import club.borderlands.utils.PictureUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PictureMapperTest {
    ApplicationContext context;
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring-dao.xml");
    }
    @Test
    public void testInsertPic(){
        PictureMapper mapper= (PictureMapper) context.getBean("pictureMapper");
        mapper.insertPic(PictureUtils.getPicture("images/image008.jpg"),1);
    }
    @Test
    public void testFindAll(){
        PictureMapper mapper= (PictureMapper) context.getBean("pictureMapper");
        List<Picture> list= (List<Picture>) mapper.findAll(1);
        for (Picture picture:list) {
            System.out.println(picture.getId());
        }
    }
    @Test
    public void testDeleteByMessageId(){
        PictureMapper mapper= (PictureMapper) context.getBean("pictureMapper");
        mapper.deleteByMessageId(1);
    }
}
