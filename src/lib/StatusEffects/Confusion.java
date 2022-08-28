package lib.StatusEffects;

import lib.PokeMint;
import lib.Status;

public class Confusion extends Status {

    public Confusion(){
        name = "Confusion";
    }

    @Override
    public void effect(PokeMint pokeMint) {
        System.out.println(pokeMint.name+" is confused");
        if (Math.random() <= 0.5){
            pokeMint.accuracy = -1;
        }
    }
}
