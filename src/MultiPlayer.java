import java.util.Random;
import java.util.Scanner;

/**
 * the MultiPlayer class represents a set of pentago game with 2 players (black and red).
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class MultiPlayer extends RotationBoard {
    /**
     * this method runs the multi player game.
     */
    public void startMultiPlayerGame() {

        //new scanner.
        Scanner scanner = new Scanner(System.in);

        //show game map and guide.
        printMap();
        showGuide();
        int i = 0;

        //make a random color.
        Random random = new Random();
        int rand = random.nextInt(2);
        while (!endGame) {
            if (rand == 0) {
                if (i % 2 == 0) setNutColor("\u26ab");
                else setNutColor("\uD83D\uDD34");
            } else {
                if (i % 2 == 0) setNutColor("\uD83D\uDD34");
                else setNutColor("\u26ab");
            }
            int boardNumber;
            int blockNumber;
            while (true) {
                //get input of board number.
                System.out.println("Player " + getNutColor() + " Enter Board Number :");
                boardNumber = scanner.nextInt();

                //get input of the block number.
                System.out.println("Choose one Block on Board Number " + boardNumber + " :");
                blockNumber = scanner.nextInt();

                //check the selected block is empty or not.
                if (isEmpty(boardNumber, blockNumber)) break;
                else {
                    System.out.println("Wrong input ! block is full ! try again...");
                    System.out.println();
                }
            }
            //add a nut to the selected block.
            addNut(boardNumber, blockNumber);

            //show map.
            printMap();

            //check end of the game.
            if (endGame) break;

            //get input the board want to rotate.
            System.out.println("Choose which board you want to rotate : ");
            int bn = scanner.nextInt();

            //choose rotation mode.
            System.out.println("Choose rotate mode :  1) Clock Wise ⟳\n                      2) Anti-Clock Wise ⟲");
            int rotateMode = scanner.nextInt();
            if (rotateMode == 1) rotateClockWise(bn);
            if ((rotateMode == 2)) rotateAntiClockWise(bn);

            //show game map and guide.
            printMap();
            showGuide();

            //check end of the game.
            if (endGame) break;
            //increase counter.
            i++;

        }
        //show the winner.
        displayWinner();
    }
}
