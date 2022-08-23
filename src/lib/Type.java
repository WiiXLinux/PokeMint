package lib;

import lib.types.Normal;

import java.awt.*;

public abstract class Type {
    public abstract double multiplier(TYPE against);
    public abstract Color color();

    public enum TYPE{
        NORMAL,FIGHT,FLYING,POISON,GROUND,ROCK,BUG,GHOST,STEEL,FIRE,WATER,GRASS,ELECTRIC,PSYCHIC,ICE,DRAGON,DARK,FAIRY
    }


}
