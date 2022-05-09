/**
 * A Card class represents a playing card with a face 
 * value and a suit.
*/

/**
 * @author: Ria Nair
 * @version: 
 */
public class Card
{
	//declaring all static variables in class Card
    public static enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS}
    public static enum Face {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
    private Suit suit;
    private Face face;
    char spades = '\u2660'; 
    char hearts = '\u2661';
    char diamonds = '\u2662';
    char clubs = '\u2663';

    //Constructor that creates an empty Card
    public Card() 
    {
    	suit = null;
    	face = null;
    }

    //Constructor that inializes all 
    public Card(Suit s, Face f)
    {
    	suit = s;
    	face = f;
    }


//getting face and suit for cards that already exist and have a face and suit
    public Face getFace()
    {
    	// gets the value of the face/number of the card
    	return face;
    }

    public Suit getSuit()
    {
    	// gets the value of the suit of the card
    	return suit;
    }
   
//setting the face and su9it for cards regardless of empty or full

    public void setFace(Face f)
    {
    	face = f;
    }

    public void setSuit(Suit s)
    {
    	suit = s;
    }

//Print statement method
    public String toString()
    {
    	String output = "";

    	switch (face)
    	{
    		case ACE:
    			output += "1:";
    			break;
    		case TWO:
    			output += "2:";
    			break;
    		case THREE:
    			output += "3:";
    			break;
    		case FOUR:
    			output += "4:";
    			break;
    		case FIVE:
    			output += "5:";
    			break;
    		case SIX:
    			output += "6:";
    			break;
    		case SEVEN:
    			output += "7:";
    			break;
    		case EIGHT:
    			output += "8:";
    			break;
    		case NINE:
    			output += "9:";
    			break;
    		case TEN:
    			output += "t:";
    			break;
    		case JACK:
    			output += "J:";
    			break;
    		case QUEEN:
    			output += "Q:";
    			break;
    		case KING:
    			output += "K:";
    			break;
    	}

	    switch(suit)
	    {
	    	case SPADES:
	    		output += spades;
	   			break;
	   		case HEARTS:
	   			output += hearts;
	   			break;
    		case DIAMONDS:
	    		output += diamonds;
	    		break;
	    	case CLUBS:
	   			output += clubs;
	   			break;
	    }

	    return output;
    }
}