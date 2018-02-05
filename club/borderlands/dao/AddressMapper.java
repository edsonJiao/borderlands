package club.borderlands.dao;

import club.borderlands.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("addressMapper")
public interface AddressMapper {
    //通过学校名查找地址
    List<Address> selectByName(@Param("schoolName")String schoolName);

    //通过id查询地址信息
    Address selectById(@Param("id")int id);
}
