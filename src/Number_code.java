import java.util.ArrayList;
import java.util.Scanner;

public class Number_code {
    // encryption
    // takes a word and convert it to an arraylist with equivalent numbers in alfabet
    public static ArrayList<Integer> encodeCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please write the word you would like to encrypt");
        String wordFromUserToEncode = scanner.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < wordFromUserToEncode.length() ; i++) {
            numbers.add(alfabet.indexOf(wordFromUserToEncode.charAt(i)));
        }
        return(numbers);
    }
    //decryption
    //takes numbers and converts them into letters in an arraylist
    public static void numbersToLetters(int[] numbers) {

        ArrayList<Character> letters = new ArrayList<>();

        String alfabet = "abcdefghijklmnopqrstuvxyz";

        for (int i = 0; i < numbers.length; i++) {
            char a = alfabet.charAt(numbers[i]);
            letters.add(a);
        }
        System.out.println(letters);
    }
// sets array to specific length and puts them into an array
    public static int[] numberArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many letters is the word?");
        int howManyLetters = scanner.nextInt();
        System.out.println("please enter all the numbers you want decoded from 1-24, one at a time");
        int[] numbers = new int[howManyLetters];


        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number:");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }


// main
    // here the user choose to decrypt or encrypt and initiates choice with methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to encrypt or decrypt a word? 1 for encrypt, 2 for decrypt");
        int userChoice = scanner.nextInt();
        if (userChoice == 1) {
            System.out.println(encodeCharacter());
        }else if (userChoice == 2) {
            numbersToLetters(numberArray());
        }
    }
}
