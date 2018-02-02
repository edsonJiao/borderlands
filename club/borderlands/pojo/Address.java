package club.borderlands.pojo;

//地址类对应数据库的address表
//与Admin为一对多的关系

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * addressId 学校编号
 * schoolName 学校名称
 * schoolPart  校区
 */
public class Address {
    private int addressId;
    private String schoolName;
    private String schoolPart;

    public Address() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolPart() {
        return schoolPart;
    }

    public void setSchoolPart(String schoolPart) {
        this.schoolPart = schoolPart;
    }
}
