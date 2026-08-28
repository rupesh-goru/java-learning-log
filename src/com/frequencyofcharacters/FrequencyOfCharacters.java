package com.frequencyofcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacters {

    static void main(String[] args) {
        String str = "PROGRAMMING";

        Map<Character, Integer> map = new HashMap<>(); //to sort in alphabetical order simply use TreeMap in place of HashMap.
        /*To sort in ascending order*/
        //Map<Character, Integer> map = new TreeMap<>();
        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
/*Method 2(Simplest way to explain in interview)*/
            map.put(ch, map.getOrDefault(ch, 0) + 1);
/*Method 1*/
            /*if(map.get(c) == null){
                map.put(c, 1);
            }else {
                Integer count = map.get(c);
                map.put(c, count + 1);

            }*/

        }
        System.out.println(map);
    }
}
