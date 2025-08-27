package aliti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        /*Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
        System.out.println(freqOfChars("AAABBCDD"));
        System.out.println(freqOfChars("AABACCCDAADDD"));

        System.out.println(usingFreqMethod("AAABBCDD"));
        System.out.println(usingFreqMethod("AABACCCDAADDD"));

    }

    public static String freqOfChars(String str) {
        int count = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                result += str.charAt(i) + "" + count;
            }
            count = 0;
        }
        return result;
    }

    public static String usingFreqMethod(String str) {
        List<String> characters = new ArrayList<>();
        String result = "";

        for (char each : str.toCharArray()) {
            characters.add(each + "");
        }

        for (String each : characters) {
            if (!result.contains(each)) {
                result += each + Collections.frequency(characters, each);
            }
        }

        return result;

    }
}
