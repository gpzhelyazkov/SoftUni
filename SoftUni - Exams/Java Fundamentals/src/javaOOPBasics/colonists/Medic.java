package javaOOPBasics.colonists;

abstract class Medic extends Colonist {

    private String sign;

    public Medic(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age);
        this.sign = sign;
    }

    String getSign() {
        return sign;
    }

    public abstract int getPotential();
}
