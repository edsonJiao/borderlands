package club.borderlands.service.impl;

import club.borderlands.dao.MessageMapper;
import club.borderlands.pojo.Message;
import club.borderlands.pojo.TempMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("messageService")
public class MessageServiceImpl implements club.borderlands.service.MessageService{
    @Autowired
    private MessageMapper messageMapper;

    /**
     * 插入消息的规范
     * messageTile为3-15字符
     * messageContent为10-300字符
     * @param adminId
     * @param date
     * @param messageTitle
     * @param content
     * @return  -1 messageTitle不规范
     *          0   messageContent不规范
     *          1  插入成功
     */
    @Override
    public int insertTempMessage(int adminId, Date date, String messageTitle, String content) {
        if (messageTitle.length()<3||messageTitle.length()>30){
//            System.out.println(messageTitle.length());
//            System.out.println(messageTitle);
            return -1;
        }
        if (content.length()>200||content.length()<10){
            return 0;
        }
        messageMapper.insertTempMessage(adminId,date,messageTitle,content);
        return 1;
    }

    @Override
    public List<TempMessage> findAllTemp() {
        List<TempMessage> list=messageMapper.findAllTemp();
        return list;
    }

    @Override
    public void updateTempMessage(int id) {
        messageMapper.updateTempMessage(id);
    }

    @Override
    public void deleteTempMessage() {
        messageMapper.deleteTempMessage();
    }

    @Override
    public void inertMessage(int adminId, Date date, String messageTitle, String content) {
        messageMapper.insertTempMessage(adminId,date,messageTitle,content);
    }

    @Override
    public List<Message> findAllById(int id) {

        return messageMapper.findAll(id);
    }

    @Override
    public List<Message> findAllByTitle(String messageTitle) {

        return messageMapper.selectByTitle(messageTitle);
    }

    @Override
    public void deleteById(int id) {
        messageMapper.deleteById(id);
    }
}
