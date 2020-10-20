package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        if (post.length > word.length || post.length == 0) {
            return false;
        }

        int postLength = post.length;
        int wordLength = word.length;

        for (int i = 0; i < postLength; i++) {
            if (post[postLength - 1 - i] != word[wordLength - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
