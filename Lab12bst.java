// Lab12bvst.java     This is the Student-Starting file.
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;

public class Lab12bst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
      System.out.println(deck);
	}
}

class Deck
{
	private ArrayList<Card> cards;
	private int size;
	private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	private int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	public Deck()
   {
    size = 52;
		cards = new ArrayList<Card>();
		for (int x = 0; x<4; x++){
			for (int y = 0; y<13; y++){
				Card card = new Card(suits[x], ranks[y], values[y]);
				cards.add(card);
			}
		 }
	 }
	public String toString(){
		String deckPrint = "";
		for (int x = 0; x<size; x++){
			deckPrint += "" + cards.get(x).toString() + "\n";
		}
		return deckPrint;
	}
}
