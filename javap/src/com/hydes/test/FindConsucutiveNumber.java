package com.hydes.test;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindConsucutiveNumber {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int r=0,q=0;
        List<Integer> list= new ArrayList<>();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n>0)
        {
        	n=n/2;
        	r=n%2;
        	list.add(r);
        }
        System.out.println(list);

        scanner.close();
    }

}
