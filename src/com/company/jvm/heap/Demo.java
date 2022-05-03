package com.company.jvm.heap;

import java.util.ArrayList;
import java.util.List;


/**
 *-Xms1024m 初始值
 *-Xmx2048m 最大值
 *
 * 没加的时候为27次
 * 设置-Xmx8m 一共只运行了17次
 */
public class Demo {
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();
        String a = "hello";
        try {
            while (true){
                list.add(a);
                a = a + a;
                i++;
            }
        }catch (OutOfMemoryError e){
            e.printStackTrace();
            System.out.println(i);
        }

    }
}
