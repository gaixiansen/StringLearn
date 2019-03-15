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
        readString1(s1);
        readString2(s2);
    }

    public static void readString1(String input){
        for (int i=0; i<input.length(); i++){
            System.out.println(input.charAt(i));
        }
    }

    public static void readString2(String input){
        char[]  arry = input.toCharArray();
        System.out.println(arry.length);
        for (char i:arry) {
            System.out.println(i);
        }
    }

}
