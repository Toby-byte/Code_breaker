import java.util.ArrayList;
import java.util.Scanner;

public class Ceasar_code {
    // encryption
    // takes a word and convert it to a number arraylist with equivalent numbers in alfabet
    public static ArrayList<Integer> encodeCharacter(String word) {
        ArrayList<Integer> numbersArraylist = new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < word.length() ; i++) {
            numbersArraylist.add(alfabet.indexOf(word.charAt(i)));
        }
        return(numbersArraylist);
    }
    // Takes number arraylist from encodeCharacter and encrypts to cesar code in arraylist
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

    // Takes number arraylist from encodeCharacter and decrypts it to an arraylist with letters
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

    // main
    // here the user choose to decrypt or encrypt and initiates choice with methods
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

