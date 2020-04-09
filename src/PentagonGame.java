/**
 * Pentago is a two-player abstract strategy game invented by Tomas Flodén.
 * The game is played on a 6×6 board divided into four 3×3 sub-boards.
 * Taking turns, the two players place a marble of their color (either black or white) onto an unoccupied space on the board,
 * and then rotate one of the sub-boards by 90 degrees either clockwise or anti-clockwise.
 * This is optional in the beginning of the game, up until every sub-board no longer has rotational symmetry,
 * at which point it becomes mandatory (this is because until then,
 * a player could rotate an empty sub-board or one with just a marble in the middle,
 * either of which has no real effect). A player wins by getting five of their marbles in a vertical,
 * horizontal or diagonal row (either before or after the sub-board rotation in their move).
 * If all 36 spaces on the board are occupied without a row of five being formed then the game is a draw.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class PentagoGame {
    //main map of the game.
    protected String[][] map;
    //first color.
    protected String nutColor;
    //second color.
    protected String nutColor2;
    //check end of the game.
    boolean endGame = false;
    //show the winner.
    protected String winner1 = " ";
    protected String winner2 = " ";

    //text colors.
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[33m";
    private static final String ANSI_PURPLE = "\u001B[34m";

    /**
     * the constructor makes a set of game and fills the map with white nuts as empty blocks.
     */
    public PentagoGame() {
        map = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                map[i][j] = "⚪";
            }
        }
    }

    /**
     * set the nut color.(black or red)
     *
     * @param nutColor new nut color.
     */
    public void setNutColor(String nutColor) {
        this.nutColor = nutColor;
        if (nutColor.equals("\u26ab")) nutColor2 = "\uD83D\uDD34";
        else nutColor2 = "\u26ab";

    }

    /**
     * get the color of the nut.
     *
     * @return nut color.
     */
    public String getNutColor() {
        return nutColor;
    }

    /**
     * this printMap method prints the board game in 4 different parts.
     */
    public void printMap() {

        System.out.println(ANSI_PURPLE + " 1                                                     2" + ANSI_RESET);
        System.out.println("\uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37");
        for (int i = 0; i < 6; i++) {
            if (i == 0 || i == 3) System.out.println("                                                      ");
            System.out.println("                                                      ");
            System.out.println("\uD83D\uDD37     " + map[i][0] + "     " + map[i][1] + "     " + map[i][2] + ANSI_RESET + "     \uD83D\uDD37     " + map[i][3] + "     " + map[i][4] + "     " + map[i][5] + "     \uD83D\uDD37");
            System.out.println("                                                      ");
            if (i == 2 || i == 5) System.out.println("                                                      ");
            if (i == 2 || i == 5) {
                System.out.println("\uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37     \uD83D\uDD37");
                if (i == 5)
                    System.out.println(ANSI_PURPLE + " 3                                                     4" + ANSI_RESET);

            }
        }
        System.out.println();
    }

    /**
     * show the guide how the player can choose a cell in each board.
     */
    public void showGuide() {
        System.out.println(ANSI_BLUE + "                          Guide" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "                       \uD83D\uDD38 1 2 3 \uD83D\uDD38" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "                       \uD83D\uDD38 4 5 6 \uD83D\uDD38" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "                       \uD83D\uDD38 7 8 9 \uD83D\uDD38" + ANSI_RESET);
        System.out.println();
    }

    /**
     * if the game has finished , this method shows the winner or if we dont have a winner , the game is a draw.
     */
    public void displayWinner() {
        System.out.println();
        if ((winner1.equals(" ") && winner2.equals(" ")) || (winner1.equals("\u26ab") && winner2.equals("\uD83D\uDD34️")) || (winner2.equals("\u26ab") && winner1.equals("\uD83D\uDD34️"))) {
            System.out.println("              \uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B");
            System.out.println(ANSI_PURPLE + "               ! ! The game is a draw ! !" + ANSI_RESET);
            System.out.println("              \uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A");
        }
        if (winner1.equals("\u26ab") || winner2.equals("\u26ab")) {
            System.out.println("              \uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B");
            System.out.println(ANSI_PURPLE + "               ! The Winner is BLACK Player !" + ANSI_RESET);
            System.out.println("              \uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A");
        }
        if (winner1.equals("\uD83D\uDD34️") || winner2.equals("\uD83D\uDD34️")) {
            System.out.println("              \uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B\uD83D\uDD3B");
            System.out.println(ANSI_PURPLE + "               ! The Winner is RED Player !" + ANSI_RESET);
            System.out.println("              \uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A\uD83D\uDD3A");
        }
    }

    /**
     * the isEmpty method checks the that the given cell is empty or not.
     *
     * @param boardNumber number of the board.
     * @param blockNumber number of the block.
     * @return true if the block is empty.
     */
    public boolean isEmpty(int boardNumber, int blockNumber) {
        switch (boardNumber) {
            case 1:
                switch (blockNumber) {
                    case 1:
                        if (map[0][0].equals("⚪")) return true;
                        break;
                    case 2:
                        if (map[0][1].equals("⚪")) return true;
                        break;
                    case 3:
                        if (map[0][2].equals("⚪")) return true;
                        break;
                    case 4:
                        if (map[1][0].equals("⚪")) return true;
                        break;
                    case 5:
                        if (map[1][1].equals("⚪")) return true;
                        break;
                    case 6:
                        if (map[1][2].equals("⚪")) return true;
                        break;
                    case 7:
                        if (map[2][0].equals("⚪")) return true;
                        break;
                    case 8:
                        if (map[2][1].equals("⚪")) return true;
                        break;
                    case 9:
                        if (map[2][2].equals("⚪")) return true;
                        break;
                }
                break;
            case 2:
                switch (blockNumber) {
                    case 1:
                        if (map[0][3].equals("⚪")) return true;
                        break;
                    case 2:
                        if (map[0][4].equals("⚪")) return true;
                        break;
                    case 3:
                        if (map[0][5].equals("⚪")) return true;
                        break;
                    case 4:
                        if (map[1][3].equals("⚪")) return true;
                        break;
                    case 5:
                        if (map[1][4].equals("⚪")) return true;
                        break;
                    case 6:
                        if (map[1][5].equals("⚪")) return true;
                        break;
                    case 7:
                        if (map[2][3].equals("⚪")) return true;
                        break;
                    case 8:
                        if (map[2][4].equals("⚪")) return true;
                        break;
                    case 9:
                        if (map[2][5].equals("⚪")) return true;
                        break;
                }
                break;
            case 3:
                switch (blockNumber) {
                    case 1:
                        if (map[3][0].equals("⚪")) return true;
                        break;
                    case 2:
                        if (map[3][1].equals("⚪")) return true;
                        break;
                    case 3:
                        if (map[3][2].equals("⚪")) return true;
                        break;
                    case 4:
                        if (map[4][0].equals("⚪")) return true;
                        break;
                    case 5:
                        if (map[4][1].equals("⚪")) return true;
                        break;
                    case 6:
                        if (map[4][2].equals("⚪")) return true;
                        break;
                    case 7:
                        if (map[5][0].equals("⚪")) return true;
                        break;
                    case 8:
                        if (map[5][1].equals("⚪")) return true;
                        break;
                    case 9:
                        if (map[5][2].equals("⚪")) return true;
                        break;

                }
                break;
            case 4:
                switch (blockNumber) {
                    case 1:
                        if (map[3][3].equals("⚪")) return true;
                        break;
                    case 2:
                        if (map[3][4].equals("⚪")) return true;
                        break;
                    case 3:
                        if (map[3][5].equals("⚪")) return true;
                        break;
                    case 4:
                        if (map[4][3].equals("⚪")) return true;
                        break;
                    case 5:
                        if (map[4][4].equals("⚪")) return true;
                        break;
                    case 6:
                        if (map[4][5].equals("⚪")) return true;
                        break;
                    case 7:
                        if (map[5][3].equals("⚪")) return true;
                        break;
                    case 8:
                        if (map[5][4].equals("⚪")) return true;
                        break;
                    case 9:
                        if (map[5][5].equals("⚪")) return true;
                        break;

                }
                break;
        }
        return false;
    }

}
