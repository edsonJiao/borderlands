package club.borderlands.service.impl;

import club.borderlands.dao.AdminMapper;
import club.borderlands.pojo.Admin;
import club.borderlands.service.LoginService;
import club.borderlands.utils.PasswordEncrypte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
    @Autowired
    private AdminMapper mapper;
    /**
     * 用户注册
     * 帐号注册规范：6-10位大小写字母跟数字
     * 密码注册规范：8-16位大小写字母、数字和简单字符
     * 昵称注册规范：3-8位双字节字符包括中文
     * @param admin
     * @return -1 admin不符合规范
     * @return -2 password不符合规范
     * @return -3 userName不符合规范
     * @return -4 admin被注册
     * @return 1  注册成功
     *
     */
    @Override
    public int register(String admin,String password,String name,int addressId) {
        Pattern pattern=Pattern.compile("[A-z0-9]{6,10}");
        Matcher matcher=pattern.matcher(admin);

        if (!matcher.matches()){
            System.out.println("admin不符合规范");
            return -1;
        }
        pattern=Pattern.compile("[A-z0-9!@#$%^&*]{8,16}");
        matcher=pattern.matcher(password);
        if (!matcher.matches()){
            System.out.println("password不符合规范");
            return -2;
        }
        pattern=Pattern.compile("[^\\x00-\\xff]{3,8}");
        matcher=pattern.matcher(name);
        if(!matcher.matches()){
            System.out.println("name不符合规范");
            return -3;
        }
        Admin admin1=mapper.getUserByAdmin(admin);
        //判断用户名是否被注册
        if (admin1!=null){

            return -4;
        }

        mapper.insertAdmin(PasswordEncrypte.encodePassword(admin),PasswordEncrypte.encodePassword(password),name,addressId);
        System.out.println("注册成功！");
        return 1;
    }

    @Override
    public Admin login(String admin, String password) {
        Admin admin1=mapper.getUser(PasswordEncrypte.encodePassword(admin),PasswordEncrypte.encodePassword(password));
        return admin1;
    }
}
