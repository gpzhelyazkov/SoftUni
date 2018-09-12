import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p04_BestPlayer {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int mostGoals = 0;
        String bestPlayer = "";

        while(true) {
            String input = reader.readLine();
            if (input.equals("END")) break;
            int goals = Integer.parseInt(reader.readLine());

            if (goals > mostGoals) {
                mostGoals = goals;
                bestPlayer = input;
            }

            if (mostGoals >= 10) break;
        }

        System.out.printf("%s is the best player!%n" , bestPlayer);
        if (mostGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n" , mostGoals);
        } else {
            System.out.printf("He has scored %d goals.%n" , mostGoals);
        }
    }
}
