import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p06_Substitute {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int firstNumberFirstDigit = Integer.parseInt(reader.readLine());
        int firstNumberSecondDigit = Integer.parseInt(reader.readLine());
        int secondNumberFirstDigit = Integer.parseInt(reader.readLine());
        int secondNumberSecondDigit = Integer.parseInt(reader.readLine());
        int possibleChanges = 6;

        for (int k = firstNumberFirstDigit; k <= 8; k++) {
            for (int l = 9; l >= firstNumberSecondDigit; l--) {
                for (int m = secondNumberFirstDigit; m <= 8; m++) {
                    for (int n = 9; n >= secondNumberSecondDigit; n--) {
                        if (k % 2 == 0 && m % 2 == 0) {
                            if (l % 2 == 1 && n % 2 == 1) {
                                if(k == m && l == n) {
                                    System.out.println("Cannot change the same player.");
                                } else {
                                    System.out.printf("%d%d - %d%d%n",k ,l ,m ,n);
                                    possibleChanges--;
                                    if(possibleChanges == 0) return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
