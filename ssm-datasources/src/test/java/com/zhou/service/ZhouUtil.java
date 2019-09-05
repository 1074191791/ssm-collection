package com.zhou.service;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhous
 * @create 2019-08-27 16:17
 */
public class ZhouUtil {


    @Test
    public void test() throws Exception {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\input\\1.txt"));
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File("D:\\output\\1.txt")));

        String line = "";
        Set<String> hashSet = new HashSet<String>();

        while((line = bfr.readLine()) != null) {
            if(line.contains("变量名")) {
                String reverse = StringUtils.reverse(line);
                int begin = reverse.indexOf("ssalc.") + 6;
                int end = reverse.indexOf("/");
                hashSet.add(reverse.substring(begin, end));
            }
        }

        bfr.close();


        for(String str : hashSet) {
            bfw.write(StringUtils.reverse(str));
            bfw.newLine();
            System.out.println(StringUtils.reverse(str));
        }

        bfw.close();


    }


}
