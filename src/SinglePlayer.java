import java.util.Random;
import java.util.Scanner;

/**
 * the SinglePlayer class represents a set of game that player , plays with the computer.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class SinglePlayer extends RotationBoard {
    /**
     * this method runs the single player game.
     */
    public void startSinglePlayerGame() {

        //new scanner.
        Scanner scanner = new Scanner(System.in);

        //show game map and guide.
        printMap();
        showGuide();
        //make a random color.
        Random random = new Random();
        int rand = random.nextInt(2);
        while (!endGame) {
            if (rand == 0) setNutColor("\u26ab");
            if (rand == 1) setNutColor("\uD83D\uDD34");
            int boardNumber;
            int blockNumber;
            while (true) {
                while (true) {
                    //get input of board number.
                    System.out.println("Player " + getNutColor() + " Enter Board Number :");
                    boardNumber = scanner.nextInt();
                    if (boardNumber > 0 && boardNumber < 5) break;
                    System.out.println("! wrong input choose a number between 1 and 4 !");
                }

                while (true) {
                    //get input of the block number.
                    System.out.println("Choose one Block on Board Number " + boardNumber + " :");
                    blockNumber = scanner.nextInt();
                    if (blockNumber > 0 && blockNumber < 10) break;
                    else System.out.println("! Wrong input choose a number between 1 and 9 !");
                }
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

            int bn;
            while (true) {
                //get input the board want to rotate.
                System.out.println("Choose which board you want to rotate : ");
                bn = scanner.nextInt();
                if (bn > 0 && bn < 5) break;
                else System.out.println("! Wrong input choose another board !");
            }

            int rotateMode;
            while (true) {
                //choose rotation mode.
                System.out.println("Choose rotate mode :  1) Clock Wise ⟳\n                      2) Anti-Clock Wise ⟲");
                rotateMode = scanner.nextInt();
                if (rotateMode == 1 || rotateMode == 2) break;
                else System.out.println("! Wrong input choose another rotate mode !");
            }

            if (rotateMode == 1) rotateClockWise(bn);
            if ((rotateMode == 2)) rotateAntiClockWise(bn);

            //show game map and guide.
            printMap();
            showGuide();

            //check end of the game.
            if (endGame) break;

            //set new player.
            if (rand == 1) setNutColor("\u26ab");
            if (rand == 0) setNutColor("\uD83D\uDD34");
            int a, b;
            //find a random block for the computer.
            while (true) {
                a = random.nextInt(4) + 1;
                b = random.nextInt(9) + 1;
                if (isEmpty(a, b)) {
                    addNut(a, b);
                    break;
                }
            }
            //show map.
            printMap();
            System.out.println();
            System.out.println("After rotate :");
            System.out.println();

            //check end of the game.
            if (endGame) break;

            //make a random rotation.
            int randomRotate = random.nextInt(2) + 1;
            int randomRotateNumber = random.nextInt(4) + 1;
            if (randomRotate == 1) rotateClockWise(randomRotateNumber);
            if ((randomRotate == 2)) rotateAntiClockWise(randomRotateNumber);

            //show game map and guide.
            printMap();
            showGuide();

            //check end of the game.
            if (endGame) break;
        }
        //show the winner.
        displayWinner();
    }


}
