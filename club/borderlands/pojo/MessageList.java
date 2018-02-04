package club.borderlands.pojo;

import java.util.List;

//消息列表类
//封装从数据库中查询到的消息列表传给前台
public class MessageList {
    private List<Message> messageList;

    public MessageList() {
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
