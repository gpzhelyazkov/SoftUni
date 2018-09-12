package javaOOPBasics.colonists;

public class Surgeon extends Medic {

    private int bonus;

    public Surgeon(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age, sign);
        setBonus();
    }

    public void setBonus() {
        this.bonus = 2;
        if(super.getAge() > 25 && super.getAge() < 35) {
            this.bonus += 2;
        }

            if(super.getSign().equals("precise")) {
                this.bonus += 3;
            } else if(super.getSign().equals("butcher")) {
                this.bonus -= 3;
            }
        }

    @Override
    public int getPotential() {
        return 0;
    }

    public int getBonus() {
        return this.bonus;
    }

}
