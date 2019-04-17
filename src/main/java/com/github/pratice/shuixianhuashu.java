package com.github.pratice;

/**
 * @ Author: 瞎驴
 * @ description:
 * @ Date: 2019/4/17 23:53
 * @ Version 1.0
 */
import java.util.Scanner;
public class shuixianhuashu {

    public static boolean isShuixianhua(int n){
        int a = n%10;
        int b = n/10%10;
        int c = n/100%10;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        if(n==Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "no";
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            //System.out.println(m);
            //System.out.println(n);
            int flag = 0;
            for(int i = m;i<=n;i++){
                if(isShuixianhua(i)){
                    flag ++;
                    if(flag==1){
                        System.out.print(i);
                    }else{
                        System.out.print(" "+i);
                    }
                }
            }
            if(flag ==0){System.out.println("no");}
        }
        int num = 369;
        int a = num%10;
        int b = num/10%10;
        int c = num/100%10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
