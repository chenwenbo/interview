package com.interview.other;

public class Yeap {
    public boolean isYeap(int yeap) {
        if(yeap%100==0){
            return yeap % 400 == 0;
        }
        return yeap%4==0;
    }
}
