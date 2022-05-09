import java.util.*;
/**
 * A Deck class represents a complete deck of Cards
 * @author: Ria Nair
 * @version: 
 */
public class Deck
{
    //edited from canvas
    Random rand = new Random();
    private Card[] cards = new Card[52];

    public Deck()
    {

        for (int i = 0; i < 13; i++) 
        //goes through spades | Card.Suit.SPADES | Cards[i].setFace(Card.Face.ACE)
        {
            cards[i] = new Card(Card.Suit.SPADES, Card.Face.ACE);
        }

        for (int j = 13; j > 12 && j < 26; j++) 
        //goes through hearts
        {
            cards[j] = new Card(Card.Suit.HEARTS, Card.Face.ACE);
        } 

        for (int m = 26; m > 25 && m < 39; m++) 
        //goes through diamonds
        {
            cards[m] = new Card(Card.Suit.DIAMONDS, Card.Face.ACE);
        }

        for (int n = 39; n > 38 && n < 52; n++) 
        //goes through clubs
        {
            cards[n] = new Card(Card.Suit.CLUBS, Card.Face.ACE);
        }

        //faces to go with suits
        for (int i = 0; i < 4; i++) //
        {
            for (int n = 0; n < 13; n++)
            {
                switch (n)
                {
                    case 0:
                        cards[i * 13 + n].setFace(Card.Face.ACE);
                        break;
                    case 1:
                        cards[i * 13 + n].setFace(Card.Face.TWO);
                        break;
                    case 2:
                        cards[i * 13 + n].setFace(Card.Face.THREE);
                        break;
                    case 3:
                        cards[i * 13 + n].setFace(Card.Face.FOUR);
                        break;
                    case 4:
                        cards[i * 13 + n].setFace(Card.Face.FIVE);
                        break;
                    case 5:
                        cards[i * 13 + n].setFace(Card.Face.SIX);
                        break;
                    case 6:
                        cards[i * 13 + n].setFace(Card.Face.SEVEN);
                        break;
                    case 7:
                        cards[i * 13 + n].setFace(Card.Face.EIGHT);
                        break;
                    case 8:
                        cards[i * 13 + n].setFace(Card.Face.NINE);
                        break;
                    case 9:
                        cards[i * 13 + n].setFace(Card.Face.TEN);
                        break;
                    case 10:
                        cards[i * 13 + n].setFace(Card.Face.JACK);
                        break;
                    case 11:
                        cards[i * 13 + n].setFace(Card.Face.QUEEN);
                        break;
                    case 12:
                        cards[i * 13 + n].setFace(Card.Face.KING);
                        break;
                }
            }
        }
    }


    //print method similar to card.java
    public String toString()
    {
        String output = "";

        for (int i = 0; i < countCards; i++)
        {
            output += cards[i] + "  ";
            if (i == 12 || i == 25 || i == 38)
            {
                output += "\n";
            }
        }

        return output;
    }


    // shuffle cards
    public void shuffle()
    {
       for (int i = 0; i < cards.length; i++)
       {
            int rNum = rand.nextInt(51);
            Card spot = cards[i];
            cards[i] = cards[rNum];
            cards[rNum] = spot;
       }
    }


    //deal cards
    int countCards = 51;
    public Card deal() 
    {
        countCards--;
        return cards[countCards + 1];
    }


    // count courds
    public int getCardCount()
    {
        return countCards;
    }

    public boolean hasMoreCards()
    {
        if (countCards <= 0)
        {
            return false;
        } else
        {
            return true;
        }
    }
    public void printCards()
    {
        for (int i = 0; i < 21; i++) 
        //i only wanted to print out a few cards because 52 cards printed out seemed too much
        {
            System.out.println("#" + i + " Dealt: " + deal());
        }
    }
}