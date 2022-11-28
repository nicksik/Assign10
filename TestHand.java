/**
 * Sample program to run a few tests on a PokerHand
 * 
 * @author Erica Eddy
 */
public class TestHand
{
    public static void main (String [] args)
    {
        Card c0 = new Card (10, 'H');
        Card c1 = new Card (10, 'C');
        Card c2 = new Card (10, 'D');
        Card c3 = new Card (10, 'S');
        Card c4 = new Card (2, 'H');
        
        PokerHand hand = new PokerHand (c0, c1, c2, c3, c4);
        // System.out.println("This hand is a straight: " + hand.isStraight());
        // System.out.println("This hand is 4 of a kind: " + hand.is4OfAKind());
    }
}
