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
	private String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
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
		shuffle();
	 }
	public String toString(){
		String deckPrint = "";
		for (int x = 0; x<size; x++){
			deckPrint += "" + cards.get(x).toString() + "\n";
		}
		return deckPrint;
	}
	private void swap(int index1, int index2){
		Card c1 = cards.get(index1);
		cards.set(index1, cards.get(index2));
		cards.set(index2, c1);
	}
	/*private void shuffle(){
		for (int x = 0; x<1000; x++){
			int r = (int)(Math.random()*52);
			int s = (int)(Math.random()*52);
			while (r==s){
				r = (int)(Math.random()*52);
				s = (int)(Math.random()*52);
			}
			swap(r,s);
		}
	}*/
	private void shuffle(){
		int lugar = (int)(Math.random()*52);
		for (int x = 0; x<cards.size(); x++){
			int randLoc1 = (int)(Math.random()*52);
			int randLoc2 = (int)(Math.random()*52);
			while (cards.get(randLoc1).matches(cards.get(randLoc2)) == true){
				randLoc1 = (int)(Math.random()*52);
				randLoc2 = (int)(Math.random()*52);
			}
		}
	}
}
