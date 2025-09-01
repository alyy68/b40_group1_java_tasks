package niloufar;

public class T5_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencySimple("AAABABCADD"));
        System.out.println(frequencySimple("AABBBBCCVV"));
    }

    public static String frequencySimple(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);


            if (result.contains(current + "")) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }

            result += current + "" + count;
        }

        return result;
    }


}


