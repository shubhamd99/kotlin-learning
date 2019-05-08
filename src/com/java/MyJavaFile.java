package com.java;

import com.kotlin.App7Kt;
import com.kotlin.MyCustomKotlinFileName;

// Java interoperability
public class MyJavaFile {

    public static void main(String[] args) {

        int sum = App7Kt.add2(3, 4);
        System.out.println("Printing from the kotlin file " + sum);

        int result1 = MyCustomKotlinFileName.findVolume1(4, 7);
        System.out.println(result1);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}
