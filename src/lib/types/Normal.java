package lib.types;

import lib.Type;

import java.awt.*;

public class Normal extends Type {

    public Normal() {
        color = Color.GRAY;
        getTypeEnum = TYPE.NORMAL;
    }

    @Override
    public double multiplier(TYPE against) {
        return switch (against) {
            case GHOST -> 0;
            case ROCK, STEEL -> 0.5;
            default -> 1.0;
        };
    }
}
