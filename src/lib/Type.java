package lib;

import java.awt.*;

public abstract class Type {
    public Color color;
    public TYPE getTypeEnum;

    public abstract double multiplier(TYPE against);

    public enum TYPE {
        NORMAL, FIGHT, FLYING, POISON, GROUND, ROCK, BUG, GHOST, STEEL, FIRE, WATER, GRASS, ELECTRIC, PSYCHIC, ICE, DRAGON, DARK, FAIRY
    }
}
