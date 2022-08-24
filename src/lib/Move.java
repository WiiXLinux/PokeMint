package lib;

import java.lang.annotation.Documented;

public class Move {

    public void use(PokeMint user, PokeMint target){
        if ((int)(Math.random()*100) <= user.accuracy - target.evasion){
            int damage = (int)(type.multiplier(target.type.getTypeEnum) * (user.attack * ap * isPhysical)/target.defense + (user.specialAttack * ap * isSpecial)/target.specialDefense);
            target.hp -= damage;
            target.status = this.status;

            System.out.println(user.name+"'s "+this.name+" did "+damage+" points of damage");
    } else {
            System.out.println(target.name+" evaded "+this.name);
        }
    }

    public Type type;
    public String name;
    public int pp;
    public int ap;
    public Status status;

    // didn't want to "cast" booleans to int
    public int isPhysical;
    public int isSpecial;
    public boolean ignoreSpeed;
}
