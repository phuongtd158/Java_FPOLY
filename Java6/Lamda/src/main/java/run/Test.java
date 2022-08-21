package run;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        duplicateWords("Phuonggguuupp");
    }

    public static void duplicateWords(String word) {

        char[] characters = word.toCharArray();

        char a = 1;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : characters) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println("Word: " + k + " Duplicate: " + v);
            }
        });

    }
}
