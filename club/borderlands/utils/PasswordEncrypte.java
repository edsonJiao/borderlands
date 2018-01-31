package club.borderlands.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

//密码加密工具类
public class PasswordEncrypte {
    /**
     * 通过传入的密码对其进行加密
     * @param password
     * @return
     */
    public static String encodePassword(String password)  {
        String encodeP="";
        Base64.Encoder baseEncode=Base64.getEncoder();
        try {
            encodeP=baseEncode.encodeToString(password.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodeP;
    }

    /**
     * 通过传入的加密之后的密码对其解密
     * @param encodePs
     * @return
     */
    public static String decodePassword(String encodePs){
        Base64.Decoder decoder=Base64.getDecoder();
        String password= null;
        try {
            password = new String(decoder.decode(encodePs),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return password;
    }

}
