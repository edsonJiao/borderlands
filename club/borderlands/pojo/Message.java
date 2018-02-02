package club.borderlands.pojo;

import java.util.Date;
//信息类
//与Admin类为多对一的关系

/**
 * adminId 消息发布者的Id
 * messageDate 消息发布日期
 * content 消息文本内容
 * picture 消息图片
 */
public class Message {
    private int adminId;
    private Date messageDate;
    private String content;
    private byte[] picture;

    public Message() {
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

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}
