import java.util.Scanner;

/**
 * the Main class manages game modes single player or multi player and starts the game.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */
public class Main {

    //the main method.
    public static void main(String[] args) {

        //new scanner.
        Scanner scanner = new Scanner(System.in);

        //welcome menu.
        System.out.println();
        System.out.println("             ! WELCOME TO PENTAGON GAME !");
        System.out.println();
        System.out.println("                \uD83D\uDD18\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD18");
        System.out.println("                \uD83D\uDD32 Choose game mode  \uD83D\uDD32");
        System.out.println("                \uD83D\uDD32-------------------\uD83D\uDD32");
        System.out.println("                \uD83D\uDD32 1) Single Player  \uD83D\uDD32");
        System.out.println("                \uD83D\uDD32 2) Multi PLayer   \uD83D\uDD32");
        System.out.println("                \uD83D\uDD18\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD18");

        //get mode input.
        int menuInput = scanner.nextInt();

        switch (menuInput) {
            case 1:
                //start single player.
                SinglePlayer singlePlayer = new SinglePlayer();
                singlePlayer.startSinglePlayerGame();
                break;
            case 2:
                //start multi player.
                MultiPlayer multiPlayer = new MultiPlayer();
                multiPlayer.startMultiPlayerGame();
                break;
        }
    }
}
