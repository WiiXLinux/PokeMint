package lib.StatusEffects;

import lib.PokeMint;
import lib.Status;

public class Poison extends Status {
    public Poison() {
        name = "Poison";
    }

    @Override
    public void effect(PokeMint pokeMint) {
        pokeMint.hp -= (int) (pokeMint.maxHp * 0.05);
    }
}
