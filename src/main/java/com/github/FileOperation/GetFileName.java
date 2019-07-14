package com.github.FileOperation;

public class GetFileName {
    public static void main(String[] args) {
        String path = "F:/opt/hauwei/2.jpg";
        int index = path.lastIndexOf("/");
        System.out.println(index);
        String fileName = path.substring(index + 1);
        System.out.println(fileName);
    }
}
