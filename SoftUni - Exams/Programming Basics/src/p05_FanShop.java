import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p05_FanShop {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int budged = Integer.parseInt(reader.readLine());
        int itemsToBuy = Integer.parseInt(reader.readLine());
        int itemsPrice = 0;

        for (int i = 0; i < itemsToBuy; i++) {
            String item = reader.readLine();

            switch (item) {
                case "hoodie":
                    itemsPrice += 30; break;
                case "keychain":
                    itemsPrice += 4; break;
                case "T-shirt":
                    itemsPrice += 20; break;
                case "flag":
                    itemsPrice += 15; break;
                case "sticker":
                    itemsPrice += 1; break;
                    default: break;
            }
        }

            if (budged >= itemsPrice) {
                System.out.printf("You bought %d items and left with %d lv.", itemsToBuy, budged - itemsPrice);
            } else {
                System.out.printf("Not enough money, you need %d more lv.", itemsPrice - budged);
            }
    }
}
