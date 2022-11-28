/**
 * This class represents a five card poker hand
 * 
 * @author Erica Eddy
 */
public class PokerHand
{
    private Card [] hand;        // the hand of 5 cards
    
    // the default constructor
    public PokerHand ()
    {
        hand = new Card [5];
    }

    // A constructor to help with testing
    public PokerHand (Card c0, Card c1, Card c2, Card c3, Card c4)
    {
        hand = new Card [5];
        hand[0] = c0;
        hand[1] = c1;
        hand[2] = c2;
        hand[3] = c3;
        hand[4] = c4;
    }
    
    // This methods fills the hand with cards from the deck.
    // It uses an insertion sort so that the cards are ordered by rank.
    public void fillHand (Deck deck)
    {
        for (int i=0; i<5; i++)
        {
            int j=i-1;
            Card temp = deck.dealCard();
            while (j>=0 && hand[j].getRank() > temp.getRank())
            {   
                hand[j+1] = hand[j];
                j--;
            }
            hand[j+1] = temp;
        }
    }

    // PLACE ADDITIONAL METHODS AFTER THIS COMMENT
}
