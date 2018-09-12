package javaOOPBasics.colonists;

public class HardwareEngineer extends Engineer {

    private int bonus;

    public HardwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
        setBonus();
    }

    @Override
    public int getPotential() {
        return 0;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus() {
        this.bonus = 3;
        if (this.getAge() > 30 || this.getAge() < 18) {
            this.bonus += 2;
        }
    }
}
