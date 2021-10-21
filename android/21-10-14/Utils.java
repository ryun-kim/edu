package com.koreait.first;

import android.widget.Toast;

public class Utils {
    /*
    public static int parseStringToInt(String val) {
        //예외처리

        int intVal = 0;

        try{
            intVal = Integer.parseInt(val);

        } catch(Exception e) {
            //예외가 발생되었을 때 실행되고 싶은 것들을 여기에다가 작성.
            e.printStackTrace(); //에러 내용 로그에 찍는다.

        } finally{
            //에러가 터지든 안터지든 !!!무조건!!! 실행됬으면 하는 것들을 작성.
        }

        return intVal;

    }

     */


    public static int parseStringToInt(String val){
        return parseStringToInt(val,0);
    }


    public static int parseStringToInt(String val, int defVal){
        try{
            return Integer.parseInt(val);
        } catch(Exception e) {
            return defVal;
        }finally{

        }
    }

    public static String getNumberComma(int val){

        return String.format("%,d",val);

    }

    public static String getNumberComma(String val){
        int intVal = parseStringToInt(val);
        return getNumberComma(intVal);
        //return  getNumberComma(parseStringToInt((val)));
    }
}
