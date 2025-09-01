package arnoldN;

public class Task5_FrequencyofCharacters {

            /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {


        FrequencyOfChars("AAABBCDD");
        FrequencyOfChars("AAAHHHHBBCDDHHHGGGFFF");


        }

        public static void FrequencyOfChars(String word){
            String result = "";


            for (int i = 0; i < word.length(); i++) {
                char charachter = word.charAt(i);
                if (result.contains(charachter + "")) {
                    continue;
                }

                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    char charachterForCounter = word.charAt(j);
                    if (charachterForCounter == charachter)
                        count++;
                }

                result += charachter + "" + count;

            }

            System.out.println(result);


        }

    }

