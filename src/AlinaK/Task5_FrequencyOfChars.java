package AlinaK;

import java.util.*;

public class Task5_FrequencyOfChars {
    public static void main(String[] args) {

        System.out.println(frequency("AAABABCADD"));
        System.out.println(frequency2("AAABABCADD"));
    }

   public static String frequency(String str) {
       Map<Character, Integer> map = new LinkedHashMap<>();


       for (char each: str.toCharArray()){
           if (!map.containsKey(each)){
               map.put(each,1);
           }else {
               map.put(each,map.get(each)+1);
           }}


       String result = "";
       for (char key: map.keySet()){
           result+=key;
           result+=map.get(key);
       }
       return result;
   }


   public static String frequency2(String str) {
        String result="";
        int count=0;


       for (int i=0; i<str.length();i++){
           if (!result.contains(str.charAt(i)+"")){
               for (int j=i;j<str.length();j++) {
                   if ((str.charAt(i)) == (str.charAt(j)))
                       count++;

               }
               result += str.charAt(i) + "" + count;
               count = 0;

           }
       }

       return result;
}}













