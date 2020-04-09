/**
 * the RotationBoard represents a rotation board that can rotate 90 degrees in arrows clock-wise or anti-clock-wise.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class RotationBoard extends Board {
    /**
     * this rotateClockWise method takes a board number and rotate it in arrow of clock-wise.
     *
     * @param boardNumber number of the board want to rotate.
     */
    public void rotateClockWise(int boardNumber) {

        //make a temp of current map.
        String[][] mapTemp = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mapTemp[i][j] = map[i][j];
            }
        }
        switch (boardNumber) {
            case 1:
                map[0][0] = mapTemp[2][0];
                map[0][1] = mapTemp[1][0];
                map[0][2] = mapTemp[0][0];
                map[1][0] = mapTemp[2][1];
                map[1][2] = mapTemp[0][1];
                map[2][0] = mapTemp[2][2];
                map[2][1] = mapTemp[1][2];
                map[2][2] = mapTemp[0][2];
                break;
            case 2:
                map[0][3] = mapTemp[2][3];
                map[0][4] = mapTemp[1][3];
                map[0][5] = mapTemp[0][3];
                map[1][3] = mapTemp[2][4];
                map[1][5] = mapTemp[0][4];
                map[2][3] = mapTemp[2][5];
                map[2][4] = mapTemp[1][5];
                map[2][5] = mapTemp[0][5];
                break;
            case 3:
                map[3][0] = mapTemp[5][0];
                map[3][1] = mapTemp[4][0];
                map[3][2] = mapTemp[3][0];
                map[4][0] = mapTemp[5][1];
                map[4][2] = mapTemp[3][1];
                map[5][0] = mapTemp[5][2];
                map[5][1] = mapTemp[4][2];
                map[5][2] = mapTemp[3][2];
                break;
            case 4:
                map[3][3] = mapTemp[5][3];
                map[3][4] = mapTemp[4][3];
                map[3][5] = mapTemp[3][3];
                map[4][3] = mapTemp[5][4];
                map[4][5] = mapTemp[3][4];
                map[5][3] = mapTemp[5][5];
                map[5][4] = mapTemp[4][5];
                map[5][5] = mapTemp[3][5];
                break;
        }
        //check if the game has finished.
        checkEndGame();
    }

    /**
     * this rotateAntiClockWise method takes a board number and rotate it in arrow of anti-clock-wise.
     *
     * @param boardNumber number of the board want to rotate.
     */

    public void rotateAntiClockWise(int boardNumber) {

        //make a temp of current map.
        String[][] mapTemp = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mapTemp[i][j] = map[i][j];
            }
        }
        switch (boardNumber) {
            case 1:
                map[0][0] = mapTemp[0][2];
                map[0][1] = mapTemp[1][2];
                map[0][2] = mapTemp[2][2];
                map[1][0] = mapTemp[0][1];
                map[1][2] = mapTemp[2][1];
                map[2][0] = mapTemp[0][0];
                map[2][1] = mapTemp[1][0];
                map[2][2] = mapTemp[2][0];
                break;
            case 2:
                map[0][3] = mapTemp[0][5];
                map[0][4] = mapTemp[1][5];
                map[0][5] = mapTemp[2][5];
                map[1][3] = mapTemp[0][4];
                map[1][5] = mapTemp[2][4];
                map[2][3] = mapTemp[0][3];
                map[2][4] = mapTemp[1][3];
                map[2][5] = mapTemp[2][3];
                break;
            case 3:
                map[3][0] = mapTemp[3][2];
                map[3][1] = mapTemp[4][2];
                map[3][2] = mapTemp[5][2];
                map[4][0] = mapTemp[3][1];
                map[4][2] = mapTemp[5][1];
                map[5][0] = mapTemp[3][0];
                map[5][1] = mapTemp[4][0];
                map[5][2] = mapTemp[5][0];
                break;
            case 4:
                map[3][3] = mapTemp[3][5];
                map[3][4] = mapTemp[4][5];
                map[3][5] = mapTemp[5][5];
                map[4][3] = mapTemp[3][4];
                map[4][5] = mapTemp[5][4];
                map[5][3] = mapTemp[3][3];
                map[5][4] = mapTemp[4][3];
                map[5][5] = mapTemp[5][3];
                break;
        }
        //check if the game has finished.
        checkEndGame();
    }

}
