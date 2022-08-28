package lib.types;

import lib.Type;

import java.awt.*;

public class Fight extends Type {


    public Fight() {
        color = Color.RED.darker();
        getTypeEnum = TYPE.FIGHT;
    }

    @Override
    public double multiplier(TYPE against) {
        return switch (against) {
            case GHOST -> 0;
            case ROCK, STEEL, NORMAL, ICE, DARK -> 2;
            case FAIRY, PSYCHIC, BUG, POISON, FLYING -> 0.5;
            default -> 1.0;
        };
    }


}
