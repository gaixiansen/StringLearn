/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/13 0:32
 * @ Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = "c";
        System.out.println(s1==s2 + s3);
        System.out.println(s1.equals(s2+s3));
    }
}
