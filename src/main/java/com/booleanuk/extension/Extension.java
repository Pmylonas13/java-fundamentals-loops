package com.booleanuk.extension;

public class Extension {
    public int[] numsEven=new int[4];

    public void stepOne() {
         int num=0;
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums
        for (int i=0;i<=3;i++) {
            numsEven[i] = num;
            num += 2;
        }
        
    }
}
