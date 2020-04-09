import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("             ! WELCOME TO PENTAGON GAME !");
        System.out.println();
        System.out.println("                \uD83D\uDD18\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD18");
        System.out.println("                \uD83D\uDD32 Choose game mode  \uD83D\uDD32");
        System.out.println("                \uD83D\uDD32-------------------\uD83D\uDD32");
        System.out.println("                \uD83D\uDD32 1) Single Player  \uD83D\uDD32");
        System.out.println("                \uD83D\uDD32 2) Multi PLayer   \uD83D\uDD32");
        System.out.println("                \uD83D\uDD18\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD18");

        int menuInput = scanner.nextInt();

        switch (menuInput) {
            case 1:
                SinglePlayer singlePlayer = new SinglePlayer();
                //singlePlayer.startSinglePlayerGame();
                break;
            case 2:
                MultiPlayer multiPlayer = new MultiPlayer();
                //multiPlayer.startMultiPlayerGame();
                break;
        }
    }
}