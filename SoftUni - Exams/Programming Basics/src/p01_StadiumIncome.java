import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01_StadiumIncome {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sectors = Integer.parseInt(reader.readLine());
        int capacity = Integer.parseInt(reader.readLine());
        double ticketPrice = Double.parseDouble(reader.readLine());

        double totalIncome = capacity * ticketPrice;
        double totalIncPerSector = totalIncome / sectors;
        double moneyForCharity = (totalIncome - totalIncPerSector * 0.75) / 8;

        System.out.printf("Total income - %.2f BGN%n" , totalIncome);
        System.out.printf("Money for charity - %.2f BGN%n" , moneyForCharity);
    }
}
