import java.util.ArrayList;

public class java_array_test {

    public static ArrayList<Integer> encodeCharacter(String word) {
        ArrayList<Integer> charcters = new ArrayList<>();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 1; i < word.length() ; i++) {
            charcters.add(alfabet.indexOf(word.charAt(i)));
        }

        return(charcters);
    }

    public static void main(String[] args) {

        System.out.println(encodeCharacter("abekat"));

    }
}
