package com.zhou.service;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author zhous
 * @create 2019-08-22 16:29
 */
public class Solutions {


    @Test
    public void test01() {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 ) {
            return 0;
        }
        if(s.length() == 1 ) {
            return 1;
        }

        int maxLength = 0;
        int current = 0;
        char[] arr = s.toCharArray();
        HashSet hashSet = new HashSet();
        for(int i = 0; i < arr.length; ++i) {
            if(hashSet.contains(arr[i])) {
                current++;
                hashSet.remove(arr[i]);
            } else {
                hashSet.add(arr[i]);
            }
            if(maxLength < i - current+1) {
                maxLength = i - current+1;
            }
        }
        return maxLength;
    }

}
