package com.lab.tasks;

import java.util.HashMap;
import java.util.Map;

public class Score {

    public static int getScore(String s1, String s2) {
        
        int score = 0;        
        
        String cardsSeq = "23456789TJKA";
        Map<Character, Integer> cards = new HashMap<>();
        
        char[] playerOne = s1.toCharArray();
        char[] playerTwo = s2.toCharArray();
        
        for(int i = 0; i < cardsSeq.length(); i++) {
            cards.put(cardsSeq.charAt(i), i);
        }
        
        for(int i = 0; i < s1.length(); i++) {
            if(cards.get(playerOne[i]) > cards.get(playerTwo[i])) {
                score++;
            } else if(cards.get(playerOne[i]) < cards.get(playerTwo[i])) {
                score--;
            }
        }
        
        return score;
    }
    
    public static void main(String[] args) {
                
        System.out.println(getScore("33KK", "22JJ"));
        
    }

}
