public class Card{
  private Suit suit;
  private Rank rank;
  public int value; 

  public Card(Suit suit, Rank rank, int value){
    this.suit = suit;
    this.rank = rank;
    this.value = value;
  }//end

  public Suit getSuit(){ 
    return suit; 
    }//end

  public Rank getRank(){ 
    return rank; 
    }//end

  public int getValue(){ 
    return value;
   }//end


  public String toString(){
    return rank.symbol() + suit.symbol();
  }//toString 


}//endCard
