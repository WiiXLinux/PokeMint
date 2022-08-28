package lib;

public abstract class Status {
    public String name;
    protected int duration;

    public abstract void effect(PokeMint pokeMint);

}
