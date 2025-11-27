import java.util.Random ;
public class DeckCards {

    private static final String[]  SUITS =  {"Clubs","Diamonds","Hearts","Spades"};
    private static final String[] RANKS =
            {
                    "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"
            };

    private static String[] deck = new String[52];

    public static void initialzeDeck(){
        int index = 0;
        for(String suit : SUITS){
            for(String rank : RANKS){
                deck[index++] = rank + " of " + suit ;
            }
        }
    }

    public static void shuffleDeck(){
        Random random = new Random();
        for(int i =0; i <deck.length; i++){
            int j = random.nextInt(deck.length);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] =temp ;
        }
    }

    public static String[][] distributeCards(){
        String[][] players = new String[4][9];
        int deckIndex = 0;

        for(int i =0; i < 4; i++){
            for (int j = 0; j <9 ; j++){
                players[i][j] = deck[deckIndex++];
            }
        }
        return players ;
    }

    public static void printCards(String[][] players){
        for (int i = 0; i < 4 ; i++){
            System.out.println("\n Player " + (i + 1) + " Cards :");
            for(int j = 0 ; j < 9 ; j++){
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args){
        initialzeDeck();
        shuffleDeck();

        String[][] players = distributeCards();
        printCards(players);
    }
}
