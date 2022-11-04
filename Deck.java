import java.util.Collections;
import java.util.ArrayList;

public class Deck{

private ArrayList<Card> cards;

  //Default Card Deck
  public Deck(){
    this(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13);
  }//end

  //52 Card Deck
  public Deck(int ... values){
    cards = new ArrayList<>();
    for(Suit suit : Suit.values()){
      int i = 0;
      for(Rank rank : Rank.values()){
        cards.add(new Card(suit, rank, values[i]));
        i++;
      }
    }
  }//endDeck52

  public void shuffle(){
    Collections.shuffle(cards);
  }//endShuffle

    public Deck(ArrayList<Card> cards){
    this.cards = cards;
  }

    public Card draw(){
    if(!isEmpty()){
      return cards.remove(cards.size() - 1);
    }else{
      return null;
    }
  }

    public boolean isEmpty(){
    return (cards.size() == 0);
  }//endisEmpty

    public void addCardsToBottom(ArrayList<Card> newCards){
    cards.addAll(0, newCards);
  }

  public String toString(){
    String cardList = "";
    int i = 0;
    for (Card cards : this.cards){
      cardList += "\n" + i + "-" + cards.toString();
      i++;
    }
    return cardList;
  }


}//endDeck