package club.borderlands.pojo;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
//用户类对应admin表
//该类与Address类为多对一的关系
/**
 * adminId  用户id
 * admin 用户名
 * password 密码
 * name 昵称
 * addressId 地址id
 * messageList 历史消息列表
 */
@Qualifier("admin")
public class Admin {
    private int adminId;
    private String admin;
    private String password;
    private String name;
    private int addressId;
    private List<Message> messageList;

    public Admin() {
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
