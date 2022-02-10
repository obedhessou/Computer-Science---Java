/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.game;

import java.util.Scanner;
import java.util.Random;

public class RanNumGenerator {

    
    public static void main(String[] args) {
    int answer;
    int guess;
    int numberattempt = 0;
    int maxAttempts = 10;
    String again;
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    answer = generator.nextInt(100)+1;

    System.out.println("Guess a number between 1 and 100 (Devinez un nombre entre 1 et 100)");
    System.out.println("What's your guess: (Entrez votre estimation)");

    guess = scan.nextInt();
    while (guess != answer && numberattempt < maxAttempts-1 && guess != 0 ) {
      if(guess==answer)
            System.out.println("You got it right! (Bon!)");
      else if (guess<answer) {
        System.out.println("Your guess was too Low. (Votre numéro est trop bas)");
        numberattempt++;
        guess = scan.nextInt();
      }
      else {
        System.out.println("Your guess was too High. (votre numéro est trop haut)");
        numberattempt++;
        guess = scan.nextInt();
      }
    }

    System.out.println ("The correct number was " + answer);
    System.out.println("Want to Play again? Enter: yes or no (Rejouer?: Oui ou Non) ");
    again = scan.next();
    if(again.equals("yes or Oui")){
    }else {
      System.out.println("Good bye! (Adieu!)");
    }
    }
    }
    