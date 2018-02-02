package club.borderlands.pojo;
//图片类 对应数据库中的picture表
public class Picture {
    private int id;
    private int messageId;
    private byte[] picture;

    public Picture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}
