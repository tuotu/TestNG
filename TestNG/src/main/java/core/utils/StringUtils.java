package core.utils;

/**
 * @author wiley
 * @date 2018/1/29 0029 14:11
 */
public class StringUtils {
    public static boolean isBlank(String str){
        return (str == null || str.length() == 0);
    }

    public static boolean isNotBank(String str){
        return (str != null || str.length() != 0);
    }
}
