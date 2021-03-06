package club.borderlands.pojo;

import org.springframework.beans.factory.annotation.Qualifier;


import java.sql.Date;
import java.util.List;
//信息类对应message表
//与Admin类为多对一的关系

/**
 * id   消息id
 * adminId 消息发布者的Id
 * messageDate 消息发布日期
 * messageTitle 消息标题
 * content 消息文本内容
 * pictureList 消息图片列表
 */
public class Message {
    private int id;
    private int adminId;
    private Date messageDate;
    private String messageTitle;
    private String content;
    private List<Picture> pictureList;

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }
}
