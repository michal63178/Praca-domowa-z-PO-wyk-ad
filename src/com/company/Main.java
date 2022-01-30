package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        long whole = 0;

        while (input.hasNext()) {
            String word = input.next();
            long call = System.currentTimeMillis();
            words.add(word);
            call = System.currentTimeMillis() - call;
            whole += call;

        }

        Iterator<String> iteration = words.iterator();

        for (int j = 1; j <= 20; ++j) {
            System.out.println(iteration.next());

        }

        System.out.println(". . .");
        System.out.println(words.size() +
                " unikalnych słów. " + whole + " milisekund.");

    }
}
