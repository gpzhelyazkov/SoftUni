package javaOOPBasics.colonists;

public class SoftwareEngineer extends Engineer {

    private int bonus;

    public SoftwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
        setBonus();
    }

    @Override
    public int getPotential() {
        return 0;
    }

    @Override
    public int getBonus() {
        return this.bonus;
    }

    public void setBonus() {
        this.bonus = 5;
        if (getAge() > 30) {
            this.bonus += 2;
        }
    }
}
