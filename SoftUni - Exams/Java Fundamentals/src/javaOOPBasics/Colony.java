package javaOOPBasics;

import javaOOPBasics.colonists.Colonist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class Colony {

    private int maxFamilyCount;
    private int maxFamilyCapacity;
    private Map<String, Family> families;

    public Colony(int maxFamilyCount, int maxFamilyCapacity) {
        this.maxFamilyCount = maxFamilyCount;
        this.maxFamilyCapacity = maxFamilyCapacity;
        this.families = new TreeMap<>();
    }

    public List<Colonist> getColonistsByFamilyId(String familyId) {
        return new ArrayList<>(families.get(familyId).getFamily().values());
    }

    public int getMaxFamilyCount() {
        return this.maxFamilyCount;
    }

    public int getMaxFamilyCapacity() {
        return this.maxFamilyCapacity;
    }

    public void addColonist(Colonist colonist) {
        if (families.containsKey(colonist.getFamilyId())) {
                if(!(families.get(colonist.getFamilyId()).getFamily().size() == getMaxFamilyCapacity())) {
                    families.get(colonist.getFamilyId()).getFamily().put(colonist.getId(), colonist);
                } else {
                    System.out.println("family is full");
                }
        } else {
            if(families.size() == getMaxFamilyCount()) {
                System.out.println("colony is full");
            } else {
                families.put(colonist.getFamilyId(), new Family(colonist.getFamilyId()));
                families.get(colonist.getFamilyId()).getFamily().put(colonist.getId(), colonist);
            }
        }
    }

    public void removeColonist(String familyId, String memberId) {
        this.families.get(familyId).getFamily().remove(memberId);
        if (this.families.get(familyId).getFamily().isEmpty()) {
            this.families.remove(familyId);
        }
    }

    public void removeFamily(String id) {
        this.families.remove(id);
    }

    public void grow(int years) {
        this.families.forEach((id,fam) -> fam.getFamily().forEach((id2,col) -> col.grow(years)));
    }

    public int getPotential() {
        final int[] totalPotential = {0};
        this.families.forEach((id,fam) -> fam.getFamily().forEach((id2,col) -> totalPotential[0] += col.getPotential()));
        return totalPotential[0];
    }

    public String getCapacity() {
        StringBuilder sb = new StringBuilder();
        sb.append("families: ").append(families.size()).append("/").append(this.maxFamilyCount).append("\n");
        families.forEach((key, value) -> sb.append("-").append(key).append(": ")
                .append(value.getFamily().size()).append("/").append(this.maxFamilyCapacity).append("\n"));
        return sb.toString().trim();
    }

    public String familyInformation(String familyId) {
        StringBuilder sb = new StringBuilder();
        if(!(families.containsKey(familyId))) {
            sb.append("family does not exist");
        } else {
            sb.append(familyId).append(":\n");
            families.get(familyId).getFamily().forEach((id,col) -> sb.append("-").append(id)
            .append(": ").append(col.getPotential()).append("\n"));
        }
        return sb.toString().trim();
    }

    Map<String, Family> getFamilies() {
        return families;
    }
}
