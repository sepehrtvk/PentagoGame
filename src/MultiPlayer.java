public class MultiPlayer extends RotationBoard {
    public void startMultiPlayerGame() {
        Scanner scanner = new Scanner(System.in);
        printMap();
        showGuide();
        int i = 0;
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
                System.out.println("Player " + getNutColor() + " Enter Board Number :");
                boardNumber = scanner.nextInt();
                System.out.println("Choose one Block on Board Number " + boardNumber + " :");
                blockNumber = scanner.nextInt();
                if (isEmpty(boardNumber, blockNumber)) break;
                else {
                    System.out.println("Wrong input ! block is full ! try again...");
                    System.out.println();
                }
            }
            addNut(boardNumber, blockNumber);
            printMap();
            if (endGame) break;

            System.out.println("Choose which board you want to rotate : ");
            int bn = scanner.nextInt();
            System.out.println("Choose rotate mode :  1) Clock Wise ⟳\n                      2) Anti-Clock Wise ⟲");
            int rotateMode = scanner.nextInt();
            if (rotateMode == 1) rotateClockWise(bn);
            if ((rotateMode == 2)) rotateAntiClockWise(bn);
            printMap();
            showGuide();
            if (endGame) break;
            i++;

        }
        displayWinner();
    }

}
