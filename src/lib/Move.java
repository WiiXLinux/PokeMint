package lib;


public class Move {

    public void use(PokeMint user, PokeMint target){
        switch (user.accuracy){
            case 0 -> {
                System.out.println(user.name+" couldn't move due to paralysis...");
                return;
            }
            case -1 ->{
                System.out.println(user.name+" hurt itself in confusion!");
                user.hp -= (int)((double)user.maxHp*0.10);
                return;
            }

        }

        if ((int)(Math.random()*100) <= user.accuracy - target.evasion){
            int damage = (int)(type.multiplier(target.type.getTypeEnum) * (user.attack * ap * isPhysical)/target.defense + (user.specialAttack * ap * isSpecial)/target.specialDefense);
            target.hp -= damage;
            target.status = this.status;

            System.out.println(user.name+"'s "+this.name+" did "+damage+" points of damage");
            this.pp -= user.underPressure+1;
    } else {
            System.out.println(target.name+" evaded "+this.name);
        }

        user.accuracy = user.originalAccuracy;

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
