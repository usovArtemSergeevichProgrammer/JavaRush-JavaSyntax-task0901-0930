package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        List<Integer> list = null;
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list = new ArrayList<>();
            while (list.add(Integer.valueOf(reader.readLine())));
        }catch (NumberFormatException y) {
            for(Integer integer : list) {
                System.out.println(integer);
            }
        }catch (Exception y)
        {

        }


    }
}
