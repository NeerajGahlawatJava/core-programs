package com.app.java.core;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

    public static void main(String... s){
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> largestString = words.stream().reduce((word1, word2)->word1.length() > word2.length()?word1:word2);
        System.out.println(largestString.get());
    }
}
