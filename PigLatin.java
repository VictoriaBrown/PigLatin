/*
Program Name: Pig Latin
Programmer:   Victoria Brown
Date:         July 2016
Purpose:      A program that takes a word entered by user and
              translates it into pig latin.
*/

import java.util.Scanner;

public class PigLatin {

  public static void main(String[] args) {

    // Variables:
    String wordToChange;
    System input = new Scanner(System.in);

    // Get word from user:
    System.out.println("Please enter the word you would like to be translated to Pig Latin: ");
    wordToChange = input.nextLine();
    System.out.println();

    // TODO: Change the word into Pig Latin.
    /* Pig Latin Rules:
    Words that begin with consonant -> all letter before vowel go to end of word, then ay is added at end
    Words that begin with vowel -> add yay to the end of word
    */

    // Figure out if first character of string is a vowel.
    if (wordToChange.charAt(0) = 'A') or (wordToChange.charAt(0) = 'a') or (wordToChange.charAt(0) = 'E') or
      (wordToChange.charAt(0) = 'e') or (wordToChange.charAt(0) = 'i') or (wordToChange.charAt(0) = 'O') or
      (wordToChange.charAt(0) = 'o') or (wordToChange.charAt(0) = 'U') or (wordToChange.charAt(0) = 'u') {
        System.out.println(wordToChange + "yay");
      }
  }
}
