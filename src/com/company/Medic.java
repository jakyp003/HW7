package com.company;

public class Medic extends Hero {

    @Override
    public void applySuperAbility() {
        setDamage(55);
        setHealth(150);
        setSuperAbilityType("Molc");
        System.out.println("Medic" + getDamage() + "урон" +getHealth() + getSuperAbilityType());
    }
}
