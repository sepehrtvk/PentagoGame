public class SinglePlayer extends RotationBoard {
    public void startSinglePlayerGame() {
        Scanner scanner = new Scanner(System.in);
        printMap();
        showGuide();
        Random random = new Random();
        int rand = random.nextInt(2);
        while (!endGame) {
            if (rand == 0) setNutColor("\u26ab");
            if (rand == 1) setNutColor("\uD83D\uDD34");
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

            if (rand == 1) setNutColor("\u26ab");
            if (rand == 0) setNutColor("\uD83D\uDD34");
            int a, b;
            while (true) {
                a = random.nextInt(4) + 1;
                b = random.nextInt(9) + 1;
                if (isEmpty(a, b)) {
                    addNut(a, b);
                    break;
                }
            }
            printMap();
            System.out.println();
            System.out.println("After rotate :");
            System.out.println();
            if (endGame) break;
            int randomRotate = random.nextInt(2) + 1;
            int randomRotateNumber = random.nextInt(4) + 1;
            if (randomRotate == 1) rotateClockWise(randomRotateNumber);
            if ((randomRotate == 2)) rotateAntiClockWise(randomRotateNumber);
            printMap();
            showGuide();
            if (endGame) break;
        }
        displayWinner();
    }

}
