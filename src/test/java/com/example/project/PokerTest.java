package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerTest {

    @Test
    void royal_straight_flash_heart () {
        int [] cards = {1, 10, 11, 12, 13};
        Assertions.assertEquals("ロイヤルストレートフラッシュ", Poker.HandDeck(cards));
    }

    @Test
    void royal_straight_flash_heart_other () {
        int [] cards = {1, 10, 11, 12, 13};
        Assertions.assertEquals("ロイヤルストレートフラッシュ", Poker.HandDeck(cards));
    }

    @Test
    void royal_straight_flash_heart_false () {
        int [] cards = {1, 10, 11, 6, 13};
        Assertions.assertEquals("ハイカード", Poker.HandDeck(cards));
    }

    @Test
    void royal_straight_flash_clover () {
        int [] cards = {14, 23, 24, 25, 26};
        Assertions.assertEquals("ロイヤルストレートフラッシュ", Poker.HandDeck(cards));
    }

    @Test
    void royal_straight_flash_clover_other () {
        int [] cards = {23, 14, 24, 25, 26};
        Assertions.assertEquals("ロイヤルストレートフラッシュ", Poker.HandDeck(cards));
    }

    @Test
    void royal_straight_flash_spade () {
        int [] cards = {27, 37, 36, 38, 39};
        Assertions.assertEquals("ロイヤルストレートフラッシュ", Poker.HandDeck(cards));
    }

    @Test
    void royal_straight_flash_diamond () {
        int [] cards = {40, 49, 51, 52, 50};
        Assertions.assertEquals("ロイヤルストレートフラッシュ", Poker.HandDeck(cards));
    }

    @Test
    void royal_straight () {
        int [] cards = {1, 23, 37, 52, 51};
        Assertions.assertEquals("ロイヤルストレート", Poker.HandDeck(cards));
    }

    @Test
    void flash_heart () {
        int [] cards = {1, 2, 3, 4, 7};
        Assertions.assertEquals("フラッシュ",Poker.HandDeck(cards));
    }

    @Test
    void flash_clover () {
        int [] cards = {25, 20, 21, 22, 15};
        Assertions.assertEquals("フラッシュ",Poker.HandDeck(cards));
    }

    @Test
    void flash_spade () {
        int [] cards = {27, 30, 36, 35, 38};
        Assertions.assertEquals("フラッシュ",Poker.HandDeck(cards));
    }

    @Test
    void flash_diamond () {
        int [] cards = {42, 46, 40, 45, 52};
        Assertions.assertEquals("フラッシュ",Poker.HandDeck(cards));
    }
}