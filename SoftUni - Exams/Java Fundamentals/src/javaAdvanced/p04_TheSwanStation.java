package javaAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p04_TheSwanStation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> theNumbers = new ArrayList<>();
        String[] input = reader.readLine().split(" ");

        for(int i = 0; i < 6; i++) {
            theNumbers.add(Integer.parseInt(input[i]));
        }

        List<Integer> numbers = new ArrayList<>();

        String[] input2 = reader.readLine().split(" ");
        for(int i = 0; i < input2.length; i++) {
            numbers.add(Integer.parseInt(input2[i]));
        }

        List<Integer> result = new ArrayList<>();
        while (!(result.size() == 6)) {
            int number = numbers.get(0);
            if(number % theNumbers.get(0) == 0) {
                result.add(number);
                numbers.remove(0);
                theNumbers.remove(0);
            } else {
                numbers.remove(0);
                numbers.add(number + 1);
            }
        }
        for(int i = 0; i < 6; i++) {
            if(i == 5) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
    }
}