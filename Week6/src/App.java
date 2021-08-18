public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        deck.shuffle();

        // Populating players' hands
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        System.out.println("-----PLAYERS-----");
        player1.describe();
        player2.describe();

        // Playing WAR
        for (int i = 0; i < 26; i++) {
            int player1CardValue = player1.flip().getValue();
            int player2CardValue = player2.flip().getValue();

            if (player1CardValue < player2CardValue) {
                player2.incrementScore();
            } else if (player1CardValue > player2CardValue) {
                player1.incrementScore();
            }
        }

        // Comparing players' scores
        int player1Score = player1.getFinalScore();
        int player2Score = player2.getFinalScore();

        System.out.println("-----FINAL SCORE-----");
        System.out.println("Player1 Score: " + player1Score);
        System.out.println("Player2 Score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 Wins!");
        } else if (player1Score < player2Score) {
            System.out.println("Player 2 Wins!");
        } else {
            System.out.println("It is a Draw!");
        }

    }
}
