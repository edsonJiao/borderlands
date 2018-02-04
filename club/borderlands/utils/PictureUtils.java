package club.borderlands.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//图片存取的工具类
public class PictureUtils {
    public static byte[] getPicture(String fileUrl){
        FileInputStream in = null;
        byte[] picture=null;
        try {
            in=new FileInputStream(fileUrl);
            picture=new byte[in.available()];
            in.read(picture);
            return picture;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return picture;
    }
}
