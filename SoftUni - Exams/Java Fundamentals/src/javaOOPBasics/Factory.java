package javaOOPBasics;

import javaOOPBasics.colonists.*;

public class Factory {

    public static Colonist createColonist(String... type) {
        switch (type[1]) {
            case "SoftwareEngineer":
                return new SoftwareEngineer(type[2], type[3],
                        Integer.parseInt(type[4]), Integer.parseInt(type[5]));
            case "HardwareEngineer":
                return new HardwareEngineer(type[2], type[3],
                        Integer.parseInt(type[4]), Integer.parseInt(type[5]));
            case "Soldier":
                return new Soldier(type[2], type[3],
                        Integer.parseInt(type[4]), Integer.parseInt(type[5]));
            case "GeneralPractitioner":
                return new GeneralPractitioner(type[2], type[3],
                        Integer.parseInt(type[4]), Integer.parseInt(type[5]), type[6]);
            case "Surgeon":
                return new Surgeon(type[2], type[3],
                        Integer.parseInt(type[4]), Integer.parseInt(type[5]), type[6]);
            default:
                return null;
        }
    }
}
