package club.borderlands.service;

import club.borderlands.pojo.Admin;

public interface LoginService {
    //用户注册
    int register(String admin,String password,String name,int addressId);

    //用户登录
    Admin login(String admin,String password);
}
