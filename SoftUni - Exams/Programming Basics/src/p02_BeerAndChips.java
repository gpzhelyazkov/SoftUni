import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_BeerAndChips {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String fanName = reader.readLine();
        double fanMoney = Double.parseDouble(reader.readLine());
        int beers = Integer.parseInt(reader.readLine());
        int chips = Integer.parseInt(reader.readLine());

        double beerValue = beers * 1.20;
        int chipsValue = (int) Math.ceil(beerValue * chips * 0.45);
        double totalValue = chipsValue + beerValue;

        if(fanMoney >= totalValue) {
            double moneyLeft = fanMoney - totalValue;
            System.out.printf("%s bought a snack and has %.2f leva left." , fanName ,moneyLeft);
        } else {
            double need = totalValue - fanMoney;
            System.out.printf("%s needs %.2f more leva!" , fanName, need);
        }
    }
}
