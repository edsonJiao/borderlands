package club.borderlands.pojo;

import org.springframework.beans.factory.annotation.Qualifier;

//管理员类对应root表
@Qualifier("root")
public class Root {
    private String admin;
    private String password;

    public Root() {
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
}
