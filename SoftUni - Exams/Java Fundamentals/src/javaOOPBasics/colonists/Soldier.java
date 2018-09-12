package javaOOPBasics.colonists;

public class Soldier extends Colonist {

    private int bonus;

    public Soldier(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
        setBonus();
    }

    @Override
    public int getPotential() {
        return 0;
    }

    public void setBonus() {
        this.bonus = 6;
    }

    public int getBonus() {
        return this.bonus;
    }
}
