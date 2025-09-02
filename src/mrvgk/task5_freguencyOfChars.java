package mrvgk;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class task5_freguencyOfChars {
    public static void main(String[] args) {
        String input = "AAABBCDD";
        String output ="A3B2C1D2";
        System.out.println(output);
    }
    public static String freguencyOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            result += ch + "" + count;
        }
        return result;
    }
}
