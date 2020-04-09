public class PentagonGame {
    protected String[][] map;
    protected String nutColor;
    protected String nutColor2;
    boolean endGame = false;
    protected String winner1 = " ";
    protected String winner2 = " ";

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[33m";
    private static final String ANSI_PURPLE = "\u001B[34m";


    public PentagoGame() {
        map = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                map[i][j] = "⚪";
            }
        }
    }

    public void setNutColor(String nutColor) {
        this.nutColor = nutColor;
        if (nutColor.equals("\u26ab")) nutColor2 = "\uD83D\uDD34";
        else nutColor2 = "\u26ab";

    }

    public String getNutColor() {
        return nutColor;
    }

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


}
