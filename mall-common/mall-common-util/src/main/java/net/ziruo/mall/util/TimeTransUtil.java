package net.ziruo.mall.util;

/**
 * @Author: october
 * @Date: 2020/1/3 11:06
 * @Description:
 */
public class TimeTransUtil {

    // 获取当前时间戳并转换为int
    public static int currentTimeToInt(){
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        return (int) (timestamp / 1000);
    }

}
