package com.twschool.practice;

import javafx.beans.binding.StringExpression;

import java.util.Random;

public class GussNumberGenerater {
    private String random;

    public String random(){
        Random r=new Random();
        int tag[]={0,0,0,0,0,0,0,0,0,0};
        String random="";
        int temp=0;
        while(random.length()!=4){
            temp=r.nextInt(10);
            if(tag[temp]==0){
                random+=temp;
                tag[temp]=1;
            }
        }
        return random;
    }
}
