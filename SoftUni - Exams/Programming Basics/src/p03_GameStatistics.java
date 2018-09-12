import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03_GameStatistics {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int minutes = Integer.parseInt(reader.readLine());
        String playerName = reader.readLine();

        if(minutes == 0) {
            System.out.println("Match has just began!");
        } else if (minutes < 45) {
            System.out.println("First half time.");

            if (minutes <= 10) {
                System.out.printf("%s missed a penalty.%n" , playerName);
                if (minutes % 2 == 0) {
                    System.out.printf("%s was injured after the penalty.%n", playerName);
                }
            } else if (minutes <= 35) {
                System.out.printf("%s received yellow card.%n", playerName);
                if(minutes % 2 == 1) {
                    System.out.printf("%s got another yellow card.%n" , playerName);
                }
            } else {
                System.out.printf("%s SCORED A GOAL !!!%n" , playerName);
            }
        } else {
            System.out.println("Second half time.");

            if (minutes > 45 && minutes <= 55) {
                System.out.printf("%s got a freekick.%n" , playerName);

                if (minutes % 2 == 0) {
                    System.out.printf("%s missed a freekick.%n", playerName);
                }
            } else if (minutes <= 80) {
                System.out.printf("%s missed a shot from corner.%n" , playerName);

                if (minutes % 2 == 1) {
                    System.out.printf("%s has been changed with another player.%n" , playerName);
                }
            } else {
                System.out.printf("%s SCORED A GOAL FROM PENALTY !!!%n" , playerName);
            }
        }
    }
}
