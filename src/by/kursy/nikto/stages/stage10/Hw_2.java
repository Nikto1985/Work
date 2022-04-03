package by.kursy.nikto.stages.stage10;
import java.util.Scanner;
import java.util.Random;

public class Hw_2 {
   public static void main(String[] args){
       System.out.println("Please enter number of players (2...9)");
       Scanner scanner = new Scanner(System.in);
       int playersNumber = scanner.nextInt();
       int cards;
       if (playersNumber > 1 && playersNumber < 10){
           cards = playersNumber * 2 + 5;
           generateCards(cards);
       } else {
           System.out.println("Number o players is incorrect");
       }
   }
   public static void generateCards(int cards) {
       int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23;
       c1 = c2 = c3 = c4 = c5 = c6 = c7 = c8 = c9 = c10 = c11 = c12 = c13 = c14 = c15 = c16 = c17 = c18 = c19 = c20 = c21 = c22 = c23 = 0;
       Random random = new Random();
       String player9 = "";
       String player8 = "";
       String player7 = "";
       String player6 = "";
       String player5 = "";
       String player4 = "";
       String player3 = "";
       String player2 = "";
       String player1 = "";
       String river = "";
       switch (cards) {
           case 23:
           c1 = (random.nextInt(52)) + 1;
           c2 = random.nextInt(52) + 1;
           while (c2 == c1) {
               c2 = random.nextInt(52) + 1;
           }
           if (c1 != 0 ){
               player9 = "Player 9 cards:" + detectCard(c1) + detectCard(c2) + "\n";
           }
           case 21:
           c3 = random.nextInt(52) + 1;
           while ((c3 == c1) || (c3 == c2)) {
               c3 = random.nextInt(52) + 1;
           }
           c4 = random.nextInt(52) + 1;
           while ((c4 == c1) || (c4 == c2) || (c4 == c3)) {
               c4 = random.nextInt(52) + 1;
           }
           if (c3 != 0 ){
               player8 = "Player 8 cards:" + detectCard(c3) + detectCard(c4) + "\n";
           }
           case 19:
           c5 = random.nextInt(52) + 1;
           while ((c5 == c1) || (c5 == c2) || (c5 == c3) || (c5 == c4)) {
               c5 = random.nextInt(52) + 1;
           }
           c6 = random.nextInt(52) + 1;
           while ((c6 == c1) || (c6 == c2) || (c6 == c3) || (c6 == c4) || (c6 == c5)) {
               c6 = random.nextInt(52) + 1;
           }
           if (c5 != 0 ){
               player7 = "Player 7 cards:" + detectCard(c5) + detectCard(c6) + "\n";
           }
           case 17:
           c7 = random.nextInt(52) + 1;
           while ((c7 == c1) || (c7 == c2) || (c7 == c3) || (c7 == c4) || (c7 == c5) || (c7 == c6)) {
               c7 = random.nextInt(52) + 1;
           }
           c8 = random.nextInt(52) + 1;
           while ((c8 == c1) || (c8 == c2) || (c8 == c3) || (c8 == c4) || (c8 == c5) || (c8 == c6) || (c8 == c7)) {
               c8 = random.nextInt(52) + 1;
           }
           if (c7 != 0 ){
               player6 = "Player 6 cards:" + detectCard(c7) + detectCard(c8) + "\n";
           }
           case 15:
           c9 = random.nextInt(52) + 1;
           while ((c9 == c1) || (c9 == c2) || (c9 == c3) || (c9 == c4) || (c9 == c5) || (c9 == c6) || (c9 == c7) || (c9 == c8)) {
               c9 = random.nextInt(52) + 1;
           }
           c10 = random.nextInt(52) + 1;
           while ((c10 == c1) || (c10 == c2) || (c10 == c3) || (c10 == c4) || (c10 == c5) || (c10 == c6) || (c10 == c7) || (c10 == c8) || (c10 == c9)) {
               c10 = random.nextInt(52) + 1;
           }
           if (c9 != 0 ){
               player5 = "Player 5 cards:" + detectCard(c9) + detectCard(c10) + "\n";
           }
           case 13:
           c11 = random.nextInt(52) + 1;
           while ((c11 == c1) || (c11 == c2) || (c11 == c3) || (c11 == c4) || (c11 == c5) || (c11 == c6) || (c11 == c7) || (c11 == c8) || (c11 == c9) || (c11 == c10)) {
               c11 = random.nextInt(52) + 1;
           }
           c12 = random.nextInt(52) + 1;
           while ((c12 == c1) || (c12 == c2) || (c12 == c3) || (c12 == c4) || (c12 == c5) || (c12 == c6) || (c12 == c7) || (c12 == c8) || (c12 == c9) || (c12 == c10) || (c12 == c11)) {
               c12 = random.nextInt(52) + 1;
           }
           if (c11 != 0 ){
               player4 = "Player 4 cards:" + detectCard(c11) + detectCard(c12) + "\n";
           }
           case 11:
           c13 = random.nextInt(52) + 1;
           while ((c13 == c1) || (c13 == c2) || (c13 == c3) || (c13 == c4) || (c13 == c5) || (c13 == c6) || (c13 == c7) || (c13 == c8) || (c13 == c9) || (c13 == c10) || (c13 == c11) || (c13 == c12)) {
               c13 = random.nextInt(52) + 1;
           }
           c14 = random.nextInt(52) + 1;
           while ((c14 == c1) || (c14 == c2) || (c14 == c3) || (c14 == c4) || (c14 == c5) || (c14 == c6) || (c14 == c7) || (c14 == c8) || (c14 == c9) || (c14 == c10) || (c14 == c11) || (c14 == c12) || (c14 == c13)) {
               c14 = random.nextInt(52) + 1;
           }
           if (c13 != 0 ){
               player3 = "Player 3 cards:" + detectCard(c13) + detectCard(c14) + "\n";
           }
           case 9:
           c15 = random.nextInt(52) + 1;
           while ((c15 == c1) || (c15 == c2) || (c15 == c3) || (c15 == c4) || (c15 == c5) || (c15 == c6) || (c15 == c7) || (c15 == c8) || (c15 == c9) || (c15 == c10) || (c15 == c11) || (c15 == c12) || (c15 == c13) || (c15 == c14)) {
               c15 = random.nextInt(52) + 1;
           }
           c16 = random.nextInt(52) + 1;
           while ((c16 == c1) || (c16 == c2) || (c16 == c3) || (c16 == c4) || (c16 == c5) || (c16 == c6) || (c16 == c7) || (c16 == c8) || (c16 == c9) || (c16 == c10) || (c16 == c11) || (c16 == c12) || (c16 == c13) || (c16 == c14) || (c16 == c15)) {
               c16 = random.nextInt(52) + 1;
           }
           c17 = random.nextInt(52) + 1;
           while ((c17 == c1) || (c17 == c2) || (c17 == c3) || (c17 == c4) || (c17 == c5) || (c17 == c6) || (c17 == c7) || (c17 == c8) || (c17 == c9) || (c17 == c10) || (c17 == c11) || (c17 == c12) || (c17 == c13) || (c17 == c14) || (c17 == c15) || (c17 == c16)) {
               c17 = random.nextInt(52) + 1;
           }
           c18 = random.nextInt(52) + 1;
           while ((c18 == c1) || (c18 == c2) || (c18 == c3) || (c18 == c4) || (c18 == c5) || (c18 == c6) || (c18 == c7) || (c18 == c8) || (c18 == c9) || (c18 == c10) || (c18 == c11) || (c18 == c12) || (c18 == c13) || (c18 == c14) || (c18 == c15) || (c18 == c16) || (c18 == c17)) {
               c18 = random.nextInt(52) + 1;
           }
           c19 = random.nextInt(52) + 1;
           while ((c19 == c1) || (c19 == c2) || (c19 == c3) || (c19 == c4) || (c19 == c5) || (c19 == c6) || (c19 == c7) || (c19 == c8) || (c19 == c9) || (c19 == c10) || (c19 == c11) || (c19 == c12) || (c19 == c13) || (c19 == c14) || (c19 == c15) || (c19 == c16) || (c19 == c17) || (c19 == c18)) {
               c19 = random.nextInt(52) + 1;
           }
           c20 = random.nextInt(52) + 1;
           while ((c20 == c1) || (c20 == c2) || (c20 == c3) || (c20 == c4) || (c20 == c5) || (c20 == c6) || (c20 == c7) || (c20 == c8) || (c20 == c9) || (c20 == c10) || (c20 == c11) || (c20 == c12) || (c20 == c13) || (c20 == c14) || (c20 == c15) || (c20 == c16) || (c20 == c17) || (c20 == c18) || (c20 == c19)) {
               c20 = random.nextInt(52) + 1;
           }
           c21 = random.nextInt(52) + 1;
           while ((c21 == c1) || (c21 == c2) || (c21 == c3) || (c21 == c4) || (c21 == c5) || (c21 == c6) || (c21 == c7) || (c21 == c8) || (c21 == c9) || (c21 == c10) || (c21 == c11) || (c21 == c12) || (c21 == c13) || (c21 == c14) || (c21 == c15) || (c21 == c16) || (c21 == c17) || (c21 == c18) || (c21 == c19) || (c21 == c20)) {
               c21 = random.nextInt(52) + 1;
           }
           c22 = random.nextInt(52) + 1;
           while ((c22 == c1) || (c22 == c2) || (c22 == c3) || (c22 == c4) || (c22 == c5) || (c22 == c6) || (c22 == c7) || (c22 == c8) || (c22 == c9) || (c22 == c10) || (c22 == c11) || (c22 == c12) || (c22 == c13) || (c22 == c14) || (c22 == c15) || (c22 == c16) || (c22 == c17) || (c22 == c18) || (c22 == c19) || (c22 == c20) || (c22 == c21)) {
               c22 = random.nextInt(52) + 1;
           }
           c23 = random.nextInt(52) + 1;
           while ((c23 == c1) || (c23 == c2) || (c23 == c3) || (c23 == c4) || (c23 == c5) || (c23 == c6) || (c23 == c7) || (c23 == c8) || (c23 == c9) || (c23 == c10) || (c23 == c11) || (c23 == c12) || (c23 == c13) || (c23 == c14) || (c23 == c15) || (c23 == c16) || (c23 == c17) || (c23 == c18) || (c23 == c19) || (c23 == c20) || (c23 == c21) || (c23 == c22)) {
               c23 = random.nextInt(52) + 1;
           }
               player2 = "Player 2 cards:" + detectCard(c15) + detectCard(c16) + "\n";
               player1 = "Player 1 cards:" + detectCard(c17) + detectCard(c18) + "\n";
               river = "River cards:" + detectCard(c19) + detectCard(c20) + detectCard(c21) + detectCard(c22) + detectCard(c23);
           break;
       }
       System.out.println(player1 + player2 + player3 + player4 + player5 + player6 + player7 + player8 + player9 + river);
       return;
   }
   public static String detectCard(int c){
       String msg = "";
       String mast = "";
       int card;
       String cardT = "";
       if (c == 0){
           return msg;
       }
       if (c < 14){
           mast = "C";
           card = c;
       } else if ((c >= 14) && (c < 27)){
           mast = "B";
           card = c - 13;
       } else if ((c >= 27) && (c < 40)){
           mast = "T";
           card = c - 26;
       } else {
           mast = "P";
           card = c - 39;
       }
       switch (card){
           case 1:  cardT = "A"; break;
           case 2:  cardT = "2"; break;
           case 3:  cardT = "3"; break;
           case 4:  cardT = "4"; break;
           case 5:  cardT = "5"; break;
           case 6:  cardT = "6"; break;
           case 7:  cardT = "7"; break;
           case 8:  cardT = "8"; break;
           case 9:  cardT = "9"; break;
           case 10: cardT = "10"; break;
           case 11: cardT = "J"; break;
           case 12: cardT = "Q"; break;
           case 13: cardT = "K"; break;
       }
       msg = cardT + mast + " ";
       return msg;
   }
}
