import java.util.ArrayList;
import java.util.Scanner;

public class NumberToLetter {
    // encoding
    public static ArrayList<Integer> encodeCharacter(String word) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < word.length() ; i++) {
            // 1. Først tager vi ordet word "meme som input"
            // 2. Derefter finder vi ud af hvilket bogstav er på index 0, her er det "m"
            // 3. Derefter tager vi index af "m", hvilket er 12
            // 4. Derefter bliver index 12 tilføjet til characters Arraylist
            numbers.add(alfabet.indexOf(word.charAt(i)));
        }
        return(numbers);
    }

    public static void decodeIndex(ArrayList<Integer> Arraylist) {
        ArrayList<Character> Characters = new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < Arraylist.size(); i++) {
            // 1. Først tager vi det 0'de index af Arraylist
            // 2. Derefter siger vi hvad er det 12'de index af alfabet
            // 3. Derefter bliver der printet til terminalen
            System.out.print(alfabet.charAt(Arraylist.get(i)));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please write word the word you would like to encode");
        String wordFromUserToEncode = scanner.nextLine();
        System.out.println(encodeCharacter(wordFromUserToEncode));
        System.out.println("here it is decoded again:");
        decodeIndex(encodeCharacter(wordFromUserToEncode));
    }
}
