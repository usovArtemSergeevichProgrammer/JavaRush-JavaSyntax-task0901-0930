package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        char[] characters = string.toCharArray();
        ArrayList<Character> vowelsArray = new ArrayList<>();
        ArrayList<Character> consonantsArray = new ArrayList<>();
        for (int i = 0; i < characters.length; i++){
            if(characters[i] == ' '){
                continue;
            }
            if(isVowel(characters[i])){
                vowelsArray.add(characters[i]);
            }else {
                consonantsArray.add(characters[i]);
            }
        }



        char[] vowelsChar = new char[vowelsArray.size()];
        char[] consonantsChar = new char[consonantsArray.size()];

        for(int i = 0; i < vowelsArray.size(); i++){
            vowelsChar[i] = vowelsArray.get(i);
        }

        for(int i = 0; i < consonantsArray.size(); i++){
            consonantsChar[i] = consonantsArray.get(i);
        }

        for (int i = 0; i < vowelsChar.length;i++){
            System.out.print(vowelsChar[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < consonantsChar.length; i++){
            System.out.print(consonantsChar[i] + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}