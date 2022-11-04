import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main {
  static Deck deck = new Deck(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10);
  static int dealerTotal = 0;
  static int total = 0;

  public static void main(String[] args) {
      boolean turn = false;
      Scanner kb = new Scanner(System.in);
      ArrayList<Card> hand = new ArrayList<>();
      deck.shuffle();

    System.out.println("\u001B[1m Welcome to Blackjack");
    System.out.println("\u001b[1m To Start Type 'start'");

    String word = kb.nextLine();
  
  if(word.equalsIgnoreCase("start")){
      hand.add(deck.draw());
      hand.add(deck.draw());
     System.out.println("You were dealt a " + hand );
      for(Card c : hand){
        total += c.getValue();
      }
        System.out.println("The total value of your cards right now is: " + total);
        hand.clear();
    }//endif
    while(!turn){
     System.out.println("");
      System.out.println("Would you like to hit(h) or stand(s)?");
      String userInput = kb.nextLine();

      if(userInput.equalsIgnoreCase("h")){
        hand.add(deck.draw());
        System.out.println("You were dealt a " + hand );
       for(Card c : hand){
        total += c.getValue();
      }//endFor
       hand.clear();
        System.out.println("The total value of your cards right now is: " + total);
        if(total > 21){
          System.out.println("");
          System.out.println("BUSTED YOU WENT OVER 21");
          turn = true;
        }//endTotal
        
       } else if(userInput.equalsIgnoreCase("s")){
        System.out.println("You decided to Stand");
        System.out.println("The total value of your cards is: " + total);
        System.out.println("Your turn is done, dealers turn.");
        turn = true;
        dealerTime();
        }//endIf
      }//while
  }//endMain

  public static void dealerTime(){
    ArrayList<Card> dealerHand = new ArrayList<>();
    System.out.println("");
    System.out.println("ITS DEALER TIME");
      dealerHand.add(deck.draw());
      dealerHand.add(deck.draw());
     System.out.println("The dealer was dealt " + dealerHand );
      for(Card b : dealerHand){
        dealerTotal += b.getValue();
      }
      dealerHand.clear();
      System.out.println("The total value of the dealer cards is: " + dealerTotal);
      //To see if the Dealer should stand or hit
      if(dealerTotal < 17){
        System.out.println("");
        System.out.println("The Dealer hits");
        dealerHand.add(deck.draw());
        System.out.println("The dealer drew " + dealerHand );
        for(Card b : dealerHand){
        dealerTotal += b.getValue();
         } 
        if (dealerTotal >= 22 ){
          System.out.println("The dealer was busted he went over 21");
          System.out.println("You win!");
        }   
         //To Check which one of you won 
         if(dealerTotal > total && dealerTotal <= 21 ){
            System.out.println("You lost, the dealer had more than you");
          }else if (dealerTotal < total){
            System.out.println("You WON THE GAME CONGRATS");
          }else if(dealerTotal == total){
            System.out.println("It was a Tie");
          }
         System.out.println("The total value of the dealer cards is: " + dealerTotal);
         System.out.println(" The total value of your cards was: " + total);
        }else if (dealerTotal >= 17 && dealerTotal < 22){
          System.out.println("");
          //To Check which one of you won 
          System.out.println("The Dealer Stands");
          if(dealerTotal > total){
            System.out.println("You lost, the dealer had more than you");
          }else if (dealerTotal < total){
            System.out.println("You WON THE GAME CONGRATS");
          }
        }
        if (dealerTotal >= 22 ){
          System.out.println("The dealer was busted he went over 21");
          System.out.println("You win!");
        }//endIf
  
  }//endDealer
}//endClass