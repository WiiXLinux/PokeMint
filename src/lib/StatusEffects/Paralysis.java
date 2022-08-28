package lib.StatusEffects;

import lib.PokeMint;
import lib.Status;

public class Paralysis extends Status {

    public Paralysis(){
        name = "Paralysis";
    }

    @Override
    public void effect(PokeMint pokeMint) {
        System.out.println(pokeMint.name+" is paralysed");
        if (Math.random() <= 0.5){
            pokeMint.accuracy = 0;

        }
    }
}
