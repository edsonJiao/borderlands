package club.borderlands.service;

import club.borderlands.pojo.Message;
import club.borderlands.pojo.TempMessage;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

public interface MessageService {
    //插入临时消息
    int insertTempMessage(int adminId, Date date, String messageTitle, String content);

    //查询未审核的消息
    List<TempMessage> findAllTemp();

    //通过未审核的消息并将其标记为已读
    void updateTempMessage(int id);

    //从临时表中删除已经通过审核的消息
    void deleteTempMessage();

    //插入消息
    void inertMessage(int adminId, Date date, String messageTitle, String content);

    //通过用户id查询消息
    List<Message> findAllById(int id);

    //通过标题关键字查询消息
    List<Message> findAllByTitle(String messageTitle);

    //通过信息id删除消息
    void deleteById(int id);

}
