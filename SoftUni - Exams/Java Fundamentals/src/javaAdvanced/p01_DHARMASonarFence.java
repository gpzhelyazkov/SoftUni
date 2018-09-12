package javaAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p01_DHARMASonarFence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = reader.readLine();
            if(input.equals("Reprogram")) {
                break;
            }

            int number = Integer.parseInt(input);
            String strNumber = String.format("%32s", Integer.toBinaryString(number)).replace(" ", "0");
            for (int i = 0; i < strNumber.length() - 1; i++) {
                char char1 = strNumber.charAt(i);
                char char2 = strNumber.charAt(i+1);
                if (char1 == char2 && char1 == '0') {
                    sb.append("11");
                    i++;
                    if(i == strNumber.length() - 2) {
                        sb.append(strNumber.charAt(i+1));}
                } else if (char1 == char2 && char1 == '1') {
                    sb.append("00");
                    i++;
                    if(i == strNumber.length() - 2) {
                        sb.append(strNumber.charAt(i+1));}
                } else {
                    sb.append(char1);
                    if(i == strNumber.length() - 2) {
                        sb.append(char2);
                    }
                }
            }
            BigInteger newNumber = new BigInteger(sb.toString(), 2);

            System.out.println(newNumber);


            sb = new StringBuilder();
        }
    }
}
