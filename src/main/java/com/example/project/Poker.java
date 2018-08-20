package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poker {


    public static String HandDeck(int [] cards) {

        Arrays.sort(cards);

        if  (cards[0] == 1 && cards[1] == 10 && cards[2] == 11 && cards[3] == 12 && cards[4] == 13) {
            return "ロイヤルストレートフラッシュ";
        }

        if (cards[0] == 14 && cards[1] == 23 && cards[2] == 24 && cards[3] == 25 && cards[4] == 26) {
            return "ロイヤルストレートフラッシュ";
        }

        if (cards[0] == 27 && cards[1] == 36 && cards[2] == 37 && cards[3] == 38 && cards[4] == 39) {
            return "ロイヤルストレートフラッシュ";
        }

        if (cards[0] == 40 && cards[1] == 49 && cards[2] == 50 && cards[3] == 51 && cards[4] == 52) {
            return "ロイヤルストレートフラッシュ";
        }

        if  (cards[0] % 13 == 1 && cards[1] % 13 == 10 && cards[2] % 13 == 11 && cards[3] % 13 == 12 && cards[4] % 13 == 0) {
            return "ロイヤルストレート";
        }
        if ( cards[4] <= 13) {
            return "フラッシュ";
        }
        if ( cards[4] <= 26) {
            return "フラッシュ";
        }
        if ( cards[4] <= 39) {
            return "フラッシュ";
        }
        if ( cards[4] <= 52) {
            return "フラッシュ";
        }


         return "ハイカード";
    }


}
