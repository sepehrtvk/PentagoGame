/**
 * the Board class represents a 6*6 board , that players put nut on its blocks.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class Board extends PentagoGame {
    /**
     * the addNut takes a board number and a block on it , then adds a nut with current color
     * to the board.
     *
     * @param boardNumber number of the board.
     * @param blockNumber number of the block.
     */
    public void addNut(int boardNumber, int blockNumber) {

        switch (boardNumber) {
            case 1:
                switch (blockNumber) {
                    case 1:
                        if (map[0][0].equals("⚪"))
                            map[0][0] = nutColor;
                        break;
                    case 2:
                        if (map[0][1].equals("⚪"))
                            map[0][1] = nutColor;
                        break;
                    case 3:
                        if (map[0][2].equals("⚪"))
                            map[0][2] = nutColor;
                        break;
                    case 4:
                        if (map[1][0].equals("⚪"))
                            map[1][0] = nutColor;
                        break;
                    case 5:
                        if (map[1][1].equals("⚪"))
                            map[1][1] = nutColor;
                        break;
                    case 6:
                        if (map[1][2].equals("⚪"))
                            map[1][2] = nutColor;
                        break;
                    case 7:
                        if (map[2][0].equals("⚪"))
                            map[2][0] = nutColor;
                        break;
                    case 8:
                        if (map[2][1].equals("⚪"))
                            map[2][1] = nutColor;
                        break;
                    case 9:
                        if (map[2][2].equals("⚪"))
                            map[2][2] = nutColor;
                        break;

                }
                break;
            case 2:
                switch (blockNumber) {
                    case 1:
                        if (map[0][3].equals("⚪"))
                            map[0][3] = nutColor;
                        break;
                    case 2:
                        if (map[0][4].equals("⚪"))
                            map[0][4] = nutColor;
                        break;
                    case 3:
                        if (map[0][5].equals("⚪"))
                            map[0][5] = nutColor;
                        break;
                    case 4:
                        if (map[1][3].equals("⚪"))
                            map[1][3] = nutColor;
                        break;
                    case 5:
                        if (map[1][4].equals("⚪"))
                            map[1][4] = nutColor;
                        break;
                    case 6:
                        if (map[1][5].equals("⚪"))
                            map[1][5] = nutColor;
                        break;
                    case 7:
                        if (map[2][3].equals("⚪"))
                            map[2][3] = nutColor;
                        break;
                    case 8:
                        if (map[2][4].equals("⚪"))
                            map[2][4] = nutColor;
                        break;
                    case 9:
                        if (map[2][5].equals("⚪"))
                            map[2][5] = nutColor;
                        break;

                }
                break;
            case 3:
                switch (blockNumber) {
                    case 1:
                        if (map[3][0].equals("⚪"))
                            map[3][0] = nutColor;
                        break;
                    case 2:
                        if (map[3][1].equals("⚪"))
                            map[3][1] = nutColor;
                        break;
                    case 3:
                        if (map[3][2].equals("⚪"))
                            map[3][2] = nutColor;
                        break;
                    case 4:
                        if (map[4][0].equals("⚪"))
                            map[4][0] = nutColor;
                        break;
                    case 5:
                        if (map[4][1].equals("⚪"))
                            map[4][1] = nutColor;
                        break;
                    case 6:
                        if (map[4][2].equals("⚪"))
                            map[4][2] = nutColor;
                        break;
                    case 7:
                        if (map[5][0].equals("⚪"))
                            map[5][0] = nutColor;
                        break;
                    case 8:
                        if (map[5][1].equals("⚪"))
                            map[5][1] = nutColor;
                        break;
                    case 9:
                        if (map[5][2].equals("⚪"))
                            map[5][2] = nutColor;
                        break;

                }
                break;
            case 4:
                switch (blockNumber) {
                    case 1:
                        if (map[3][3].equals("⚪"))
                            map[3][3] = nutColor;
                        break;
                    case 2:
                        if (map[3][4].equals("⚪"))
                            map[3][4] = nutColor;
                        break;
                    case 3:
                        if (map[3][5].equals("⚪"))
                            map[3][5] = nutColor;
                        break;
                    case 4:
                        if (map[4][3].equals("⚪"))
                            map[4][3] = nutColor;
                        break;
                    case 5:
                        if (map[4][4].equals("⚪"))
                            map[4][4] = nutColor;
                        break;
                    case 6:
                        if (map[4][5].equals("⚪"))
                            map[4][5] = nutColor;
                        break;
                    case 7:
                        if (map[5][3].equals("⚪"))
                            map[5][3] = nutColor;
                        break;
                    case 8:
                        if (map[5][4].equals("⚪"))
                            map[5][4] = nutColor;
                        break;
                    case 9:
                        if (map[5][5].equals("⚪"))
                            map[5][5] = nutColor;
                        break;

                }
                break;
        }
        checkEndGame();
    }

    /**
     * this checkInColumn method checks that if we have a set of 5 nuts with same color in a column , game has finished.
     *
     * @return true if the game has finished.
     */
    public boolean checkInColumn() {
        String nutColorCheck;
        for (int k = 0; k < 2; k++) {
            if (k == 0) nutColorCheck = nutColor;
            else nutColorCheck = nutColor2;
            for (int i = 0; i < 6; i++) {
                if ((map[0][i].equals(nutColorCheck) && map[1][i].equals(nutColorCheck) && map[2][i].equals(nutColorCheck) && map[3][i].equals(nutColorCheck) && map[4][i].equals(nutColorCheck)) ||
                        (map[1][i].equals(nutColorCheck) && map[2][i].equals(nutColorCheck) && map[3][i].equals(nutColorCheck) && map[4][i].equals(nutColorCheck) && map[5][i].equals(nutColorCheck))) {
                    if (k == 0) winner1 = nutColorCheck;
                    if (k == 1) winner2 = nutColorCheck;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * this checkInAngle method checks that if we have a set of 5 nuts with same color in a angle , game has finished.
     *
     * @return true if the game has finished.
     */

    public boolean checkInAngle() {
        String nutColorCheck;
        for (int k = 0; k < 2; k++) {
            if (k == 0) nutColorCheck = nutColor;
            else nutColorCheck = nutColor2;
            if ((map[0][0].equals(nutColorCheck) && map[1][1].equals(nutColorCheck) && map[2][2].equals(nutColorCheck) && map[3][3].equals(nutColorCheck) && map[4][4].equals(nutColorCheck)) ||
                    (map[1][1].equals(nutColorCheck) && map[2][2].equals(nutColorCheck) && map[3][3].equals(nutColorCheck) && map[4][4].equals(nutColorCheck) && map[5][5].equals(nutColorCheck))) {
                if (k == 0) winner1 = nutColorCheck;
                if (k == 1) winner2 = nutColorCheck;
                return true;
            }
        }
        for (int k = 0; k < 2; k++) {
            if (k == 0) nutColorCheck = nutColor;
            else nutColorCheck = nutColor2;
            if ((map[0][5].equals(nutColorCheck) && map[1][4].equals(nutColorCheck) && map[2][3].equals(nutColorCheck) && map[3][2].equals(nutColorCheck) && map[4][1].equals(nutColorCheck)) ||
                    (map[1][4].equals(nutColorCheck) && map[2][3].equals(nutColorCheck) && map[3][2].equals(nutColorCheck) && map[4][1].equals(nutColorCheck) && map[5][0].equals(nutColorCheck))) {
                if (k == 0) winner1 = nutColorCheck;
                if (k == 1) winner2 = nutColorCheck;
                return true;
            }
        }
        return false;
    }

    /**
     * this checkInRow method checks that if we have a set of 5 nuts with same color in a row , game has finished.
     *
     * @return true if the game has finished.
     */

    public boolean checkInRow() {
        String nutColorCheck;
        for (int k = 0; k < 2; k++) {
            if (k == 0) nutColorCheck = nutColor;
            else nutColorCheck = nutColor2;
            for (int i = 0; i < 6; i++) {
                if ((map[i][0].equals(nutColorCheck) && map[i][1].equals(nutColorCheck) && map[i][2].equals(nutColorCheck) && map[i][3].equals(nutColorCheck) && map[i][4].equals(nutColorCheck)) ||
                        (map[i][1].equals(nutColorCheck) && map[i][2].equals(nutColorCheck) && map[i][3].equals(nutColorCheck) && map[i][4].equals(nutColorCheck) && map[i][5].equals(nutColorCheck))) {
                    if (k == 0) winner1 = nutColorCheck;
                    if (k == 1) winner2 = nutColorCheck;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * the checkEndGame method checks if the board is full and no one won the game , game is a draw.
     * also it checks if we have a set of 5 same color nuts in a row , column or angle , the game has finished.
     */
    public void checkEndGame() {
        if (checkInAngle() || checkInColumn() || checkInRow()) {
            endGame = true;
        }
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (map[i][j].equals("\u26ab") || map[i][j].equals("\uD83D\uDD34️")) count++;
            }
        }
        if (count == 36) endGame = true;
    }

}
