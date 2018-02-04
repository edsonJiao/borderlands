package club.borderlands.dao;

import club.borderlands.pojo.Picture;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("pictureMapper")
public interface PictureMapper {
    //插入图片
    void insertPic(@Param("picture")byte[] picture,@Param("messageId")int messageId);

    //通过messageId删除图片
    void deleteByMessageId(@Param("messageId")int messageId);

    //通过messageId查看所有图片
    List<Picture> findAll(@Param("messageId")int messageId);
}
