package javaOOPBasics.colonists;

public class GeneralPractitioner extends Medic {

    private int bonus;

    public GeneralPractitioner(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age, sign);
        setBonus();
    }

    public void setBonus() {
        this.bonus = 2;
        if(super.getAge() > 15) {
            this.bonus += 1;
        }
            if(super.getSign().equals("caring")) {
                this.bonus += 1;
            } else if(super.getSign().equals("careless")) {
                this.bonus -= 2;
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
