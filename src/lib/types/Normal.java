package lib.types;

import lib.Type;

import java.awt.*;

public class Normal extends Type {

    @Override
    public double multiplier(TYPE against) {
        return switch (against) {
            case GHOST -> 0;
            case ROCK, STEEL -> 0.5;
            default -> 1.0;
        };
    }

    @Override
    public Color color() {
        return null;
    }
}
