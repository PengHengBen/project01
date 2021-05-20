package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author heng.peng
 * @date 2021/5/17 - 22:06
 */
public class TemplatesTest {

    //template six: prsf can be generated： private static final
    private static final Customer cust = new Customer();

    //distortion: psf
    public static final int NUM = 1;

    //distortion: psfi
    public static final int NUM2 = 2;
    
    //distortion psfs
    public static final String NATION = "china";

    //template one: psvm
    public static void main(String[] args) {

        //template two: sout
        System.out.println("hello!");
        //distortion: soutp / soutm / soutv / xxx.out
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //template three: fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //distortion: iter
        for (String s : arr) {
            System.out.println(s);
        }

        //distortion: itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //template four: list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            
        }

        //distortion: list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //distortion: list.forr  reverse traversal
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //template five: ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        if (list == null) {
            
        }
        
        //distortion: inn
        if (list != null) {
            
        }

        //distortion: xxx.nn / xxx.null
        if (list == null) {

        }

        if (list != null) {

        }
    }

    //generate template demo one
    public void testUpdate(){

    }

    //generate template demo two
    /**
      *Customer id
      */
    private int id;

    /**
      *Customer name
      */
    private String name;
    
    

}
