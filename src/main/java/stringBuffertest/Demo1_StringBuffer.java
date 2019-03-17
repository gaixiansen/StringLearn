package stringBuffertest;
import java.lang.StringBuffer;
/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/17 20:14
 * @ Version 1.0
 */
public class Demo1_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
        sb.append("hello");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        sb.insert(5, " world");
        System.out.println(sb.toString());
    }
}
