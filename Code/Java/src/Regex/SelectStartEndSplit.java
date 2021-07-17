package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectStartEndSplit {
    public static void main(String args[]){
        String[] strs = new String[]{
                "ajfelsfd @id112,id113,id115 kejklkaklfmr",
                "ajfelsfd @id112,id113,id114",
                "ajfelsfd @id113,id117,id115 kejklkaklfmr",
                "ajfelsfd"
        };
        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("@(\\S+)(\\s|$)");
        for(String str: strs){
            Matcher m = pattern.matcher(str);
            if(m.find()){
                System.out.println(m.group(0)); // group(0) will select @ and trailing space
                System.out.println(m.group(1));
                for(String user: m.group(1).split(",")){
//                    System.out.println(user);
                    map.put(user, map.getOrDefault(user, 0) + 1);
                }
            }
        }
//        System.out.println(map);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> {
            if(Integer.compare(a.getValue(), b.getValue()) == 0){
                return a.getKey().compareTo(b.getKey());
            }
            else{
                return Integer.compare(a.getValue(), b.getValue());
            }
        });
        System.out.println(list);

    }
}
