package merveB;

public class Task5_FrequencyOfChars {

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = frequencyOfChars(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    public static String frequencyOfChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            // if already counted, skip
            if (result.contains("" + each)) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == each) {
                    count++;
                }
            }
            result += "" + each + count;
        }

        return result;
    }
}

/*Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/