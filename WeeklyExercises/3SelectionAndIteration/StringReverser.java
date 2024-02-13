import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        StringBuilder reversedSen = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSen.append(reversedWord).append(" ");
        }

        System.out.println(reversedSen.toString().trim());
    }
}