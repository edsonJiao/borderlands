package club.borderlands.dao;

import club.borderlands.pojo.Root;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("rootMapper")
public interface RootMapper {
    //通过帐号密码查询管理员
    Root getRoot(@Param("admin")String admin,@Param("password")String password);
}
