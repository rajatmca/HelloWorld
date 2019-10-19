package com.hydes.test;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class HashMapSEtExample{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(map.containsKey(s))
            {
            	//Iterator<Entry<String, Integer>> itr= map.entrySet().iterator();
				/*Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
				Map.Entry<String, Integer> entry = itr.equals(map);*/
            	System.out.println(s+"="+map.values());
            }
            else
            {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}



