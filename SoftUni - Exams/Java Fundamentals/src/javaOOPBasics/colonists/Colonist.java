package javaOOPBasics.colonists;

public abstract class Colonist {

    private String id;
    private String familyId;
    private int talent;
    private int age;

    public Colonist(String id, String familyId, int talent, int age) {
        this.id = id;
        this.familyId = familyId;
        this.talent = talent;
        this.age = age;
    }

    public abstract int getPotential();

    public String getId() {
        return this.id;
    }

    public String getFamilyId() {
        return this.familyId;
    }

    int getTalent() {
        return this.talent;
    }

    int getAge() {
        return this.age;
    }

    public abstract int getBonus();

    public abstract void setBonus();

    public void grow(int years) {
        this.age += years;
        this.setBonus();
    }

    @Override
    public String toString() {
        return "Colonist{";
    }


}
