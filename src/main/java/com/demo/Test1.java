package com.demo;

import org.apache.hadoop.io.Text;

/**
 * @author jiangmb
 * @version 1.0.0
 * @date 2021/6/24 7:44
 */
public class Test1 {
    public static void main(String[] args) {
        Text text = new Text();
        text.set("zhang");
        System.out.println(text.toString());
    }
}
