package javaOOPBasics;

import javaOOPBasics.colonists.Colonist;

import java.util.Map;
import java.util.TreeMap;

public class Family {

    private String id;
    private Map<String , Colonist> family;

    Family(String id) {
        this.id = id;
        this.family = new TreeMap<>();
    }

    String getId() {
        return id;
    }

    Map<String, Colonist> getFamily() {
        return family;
    }
}
