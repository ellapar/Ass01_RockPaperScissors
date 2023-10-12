public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            char moveA;
            do {
                System.out.println("Player A, enter your move (R/P/S): ");
                moveA = Character.toLowerCase(scanner.next().charAt(0));
            } while (moveA != 'r' && moveA != 'p' && moveA != 's');

            char moveB;
            do {
                System.out.println("Player B, enter your move (R/P/S: ");
                moveB = Character.toLowerCase(scanner.next().charAt(0));
            } while (moveB != 'r' && moveB != 'p' && moveB != 's');

            if (moveA == moveB) {
                System.out.println("Rock vs Rock, it's a Tie!");
            } else if ((move A == 'r' && moveB == 's') (move A == 's' && moveB == 'p') (moveA == 'p' && moveB == 'r')); {
                System.out.println("Player A wins!");
            } else if{
                System.out.println("Player B wins!");
            }

            System.out.println("Do you want to play again? (Y/N): ");
            char playAgainChoice = Character.toLowerCase(scanner.next().charAt(0));
            playAgain = (playAgainChoice == 'y');
        }
            scanner.close();
        }
    }
}