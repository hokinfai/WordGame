import java.util.Scanner;

import static java.lang.String.format;

public class WordGame {
    private static final String STARTING_WORD = "lamp";

    private static String[] words = {STARTING_WORD};

    private static boolean outcome = true;

    public static void gameStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(format("Word Game started with %s\n%s", STARTING_WORD, STARTING_WORD));
        do {
            System.out.print("Enter a word (caseSensitive) to play the game, such as pen->net->top...: ");
            String word = scanner.nextLine();
            if (isNotAlphanumeric(word)) {
                System.out.println("Entered word is invalid, please try again");
            } else if (word.length() == 0) {
                gameRestart();
            } else {
                gameContinueOrOver(word);
            }
        }
        while (outcome);
    }

    private static void gameContinueOrOver(String word) {
        boolean isFirstCharOfNewWordTheSameAsLastCharOfLastWord = words[words.length - 1].endsWith(Character.toString(word.charAt(0)));
        boolean ifWordNotFound = !isItemFound(word);

        if (ifWordNotFound && isFirstCharOfNewWordTheSameAsLastCharOfLastWord) {
            increaseTheSizeOfArrayIfFull();
            words[words.length - 1] = word;
            displayWordsInArray();
        } else {
            gameOver();
        }
    }

    private static boolean isItemFound(String word) {
        for (String s : words) {
            if (s.equals(word)) {
                return true;
            }
        }
        return false;
    }

    private static void increaseTheSizeOfArrayIfFull() {
        String[] newWords = new String[words.length + 1];
        System.arraycopy(words, 0, newWords, 0, words.length);
        words = newWords;
    }

    public static boolean isNotAlphanumeric(String word) {
        return !word.matches("^[a-zA-Z]*$");
    }

    private static void displayWordsInArray() {
        for (String s : words) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void gameOver() {
        System.out.println("Game over\n");
        outcome = false;
    }

    private static void gameRestart() {
        System.out.print("Game restarting as the entered word was empty...");
        System.out.println(format("Word game restarted with %s\n%s", STARTING_WORD, STARTING_WORD));
        words = new String[1];
        words[0] = STARTING_WORD;
    }

    public static void main(String args[]) {
        gameStart();
    }
}
