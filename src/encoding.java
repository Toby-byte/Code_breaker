import java.util.ArrayList;
import java.util.Scanner;

public class encoding {
    // encoding
    public static ArrayList<Integer> encodeCharacter(String word) {
        ArrayList<Integer> characters = new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < word.length() ; i++) {
            // 1. Først tager vi ordet word "meme som input"
            // 2. Derefter finder vi ud af hvilket bogstav er på index 0, her er det "m"
            // 3. Derefter tager vi index af "m", hvilket er 12
            // 4. Derefter bliver index 12 tilføjet til characters Arraylist
            characters.add(alfabet.indexOf(word.charAt(i)));
        }
        return(characters);
    }

public static void decodeIndex(ArrayList<Integer> Arraylist) {
    String alfabet = "abcdefghijklmnopqrstuvwxyz";

    for (int i = 0; i < Arraylist.size(); i++) {
        // 1. Først tager vi det 0'de index af Arraylist, som er 12
        // 2. Derefter siger vi hvad er det 12'de index af alfabet
        // 3. Derefter bliver der printet til terminalen
        System.out.print(alfabet.charAt(Arraylist.get(i)));
    }
}

    public static ArrayList<Character> ceasarCharacterEncoder(ArrayList<Integer> IndexArraylist) {
        ArrayList<Integer> ceasarLetterIndexNumbers = new ArrayList<>();
        ArrayList<Character> FromIndexNumbersToLetters= new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < IndexArraylist.size(); i++) {

            int NormalLetter = IndexArraylist.get(i);
            int ceasarLetter = NormalLetter+3;
            ceasarLetterIndexNumbers.add(ceasarLetter);
            FromIndexNumbersToLetters.add(alfabet.charAt(ceasarLetterIndexNumbers.get(i)));
        }

        return (FromIndexNumbersToLetters);
        }

        public static ArrayList<Character> ceasarCharacterDecoder(ArrayList<Integer> Arraylist) {
            ArrayList<Integer> ceasarLetterIndexNumbers = new ArrayList<>();
            ArrayList<Character> FromIndexNumbersToLetters = new ArrayList<>();
            String alfabet = "abcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i < Arraylist.size(); i++) {

                int NormalLetter = Arraylist.get(i);
                int ceasarLetter = NormalLetter-3;
                ceasarLetterIndexNumbers.add(ceasarLetter);
                FromIndexNumbersToLetters.add(alfabet.charAt(ceasarLetterIndexNumbers.get(i)));
            }

            return (FromIndexNumbersToLetters);
            }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to encode or decode a word?\nPress 1 or 2");
        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")) {
            System.out.println("please input word you wish to encode");
            String userInputEncoder = scanner.nextLine();
            System.out.println(ceasarCharacterEncoder(encodeCharacter(userInputEncoder)));
        } else if (userChoice.equals("2")) {
            System.out.println("please input encoded word");
            String userInputDecoder = scanner.nextLine();
            // prøv og brug join her er link https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
            // prøv toString
            System.out.println(ceasarCharacterDecoder(encodeCharacter(userInputDecoder)));
        }
        //System.out.println(encodeCharacter("meme")); // Done
        //decodeIndex(encodeCharacter("meme"));


    }

    }

