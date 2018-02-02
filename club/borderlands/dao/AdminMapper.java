package club.borderlands.dao;

import club.borderlands.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("adminMapper")
public interface AdminMapper {
    //查找用户
    Admin getUser(@Param("admin")String admin, @Param("password")String password);

    //添加用户
    void insertAdmin(@Param("admin")String admin,@Param("password")String password,
                      @Param("name")String name,@Param("addressId")int id);
}
