package model.combat;

import model.combatant.Combatant;

public class DamageCalculator {
    private final Combatant attacker;
    private final Combatant defender;

    public DamageCalculator(Combatant attacker, Combatant defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public int executeDamage() {
        int damage = Math.max(0, attacker.getTotalAttack() - defender.getTotalDefense());
        defender.getHealth().takeDamage(damage);
        System.out.println(attacker.getName() + " deals " + damage + " damage to " + defender.getName());
        return damage;
    }
}
