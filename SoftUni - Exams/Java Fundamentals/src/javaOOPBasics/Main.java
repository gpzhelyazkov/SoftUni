package javaOOPBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] colonyAndFamilySize = reader.readLine().split("\\s+");

        Colony colony = new Colony(Integer.parseInt(colonyAndFamilySize[0]),
                Integer.parseInt(colonyAndFamilySize[1]));

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("end")) {
                break;
            }

            colony.getMaxFamilyCapacity();
            colony.getMaxFamilyCount();

            switch (input[0]) {
                case "insert":
                    colony.addColonist(Factory.createColonist(input));
                case "remove":
                    if(input[1].equals("family")) {
                        colony.removeFamily(input[2]);
                    } else {
                        colony.removeColonist(input[2], input[3]);
                    }
                    break;
                case "grow":
                    colony.grow(Integer.parseInt(input[1]));
                    break;
                case "potential":
                    System.out.println("potential: " + colony.getPotential());
                    break;
                case "capacity":
                    System.out.println(colony.getCapacity());
                    break;
                case "family":
                    System.out.println(colony.familyInformation(input[1]));
                    colony.getColonistsByFamilyId(input[1]);
                    break;
            }
        }
    }
}
