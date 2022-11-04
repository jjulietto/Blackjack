public enum Suit{
  SPADES  ("\u2660"), // SPADES  ("S"),
  CLUBS   ("\u2663"), // CLUBS   ("C"),
  DIAMONDS("\u2666"), // DIAMONDS("D"),
  HEARTS  ("\u2665"); // HEARTS  ("H");

  private final String symbol;

  Suit(String symbol){
    this.symbol = symbol;
  }

  public String symbol(){
    return symbol;
  }
}
