package com.github.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_TryFinally {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            fi = new FileInputStream("1.txt");
            fo = new FileOutputStream("copy2.txt");
            int b;
            byte[] arry = new byte[8 * 1024];
            while ((b = fi.read(arry)) != -1){
                fo.write(arry,0 ,b);
            }
        }finally {
            try{
                if(fi != null){
                    fi.close();
                }
            }finally {                  //try fianlly的嵌套目的是能关一个尽量关一个
                if (fo != null){
                    fo.close();
                }
            }
        }


    }
}
