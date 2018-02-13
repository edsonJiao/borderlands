package club.borderlands.dao;

import club.borderlands.pojo.Message;
import club.borderlands.pojo.TempMessage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.sql.Date;
import java.util.List;
@Repository("messageMapper")
public interface MessageMapper {
    //插入消息
    void insertMessage(@Param("adminId")int adminId, @Param("messageDate")Date date,
                       @Param("messageTitle")String messageTitle,@Param("content")String content);

    //通过标题关键字查询消息
    List<Message> selectByTitle(@Param("messageTitle")String messageTitle);

    //通过用户id查询消息
    List<Message> findAll(@Param("adminId")int adminId);

    //通过信息id删除信息
    void deleteById(@Param("id")int id);


    //插入未经过审核的消息
    void insertTempMessage(@Param("adminId")int adminId, @Param("messageDate")Date date,
                           @Param("messageTitle")String messageTitle,@Param("content")String content);

    //查询未经审核消息
    List<TempMessage> findAllTemp();

    //通过未审核消息的id将其标记为已审核
    void updateTempMessage(@Param("id")int id);

    //从临时表中删除已经通过审核的消息
    void deleteTempMessage();
}
