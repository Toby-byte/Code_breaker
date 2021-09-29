import java.util.ArrayList;
import java.util.Scanner;

public class Ceasar_code {
    // encoding
    public static ArrayList<Integer> encodeCharacter(String word) {
        ArrayList<Integer> characters = new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < word.length() ; i++) {
            characters.add(alfabet.indexOf(word.charAt(i)));
        }
        return(characters);
    }

public static void decodeIndex(ArrayList<Integer> Arraylist) {
    String alfabet = "abcdefghijklmnopqrstuvwxyz";

    for (int i = 0; i < Arraylist.size(); i++) {
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
        System.out.println("would you like to encrypt or decrypt a word?\nPress 1 or 2");
        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")) {
            System.out.println("please input word you wish to encrypt");
            String userInputEncoder = scanner.nextLine();
            System.out.println(ceasarCharacterEncoder(encodeCharacter(userInputEncoder)));
        } else if (userChoice.equals("2")) {
            System.out.println("please input encrypted word");
            String userInputDecoder = scanner.nextLine();
            System.out.println(ceasarCharacterDecoder(encodeCharacter(userInputDecoder)));
        }


    }

    }

