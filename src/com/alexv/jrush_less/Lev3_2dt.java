package com.alexv.jrush_less;

import java.util.Calendar;

public class Lev3_2dt {

    //Class constructor
    public  Lev3_2dt(){
        //Formatting date from string variable
        Calendar date =  Calendar.getInstance();
        date.set(1977,7,27);
        System.out.printf("%1$Tb %1$td %1$tY\n", date.getTime()); //Tue Aug 31 10:20:56 SGT 1982
    }


}
