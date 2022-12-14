package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PokeMint {
    public String name;
    public Type type;
    public int hp;
    public Status status;
    // again, I don't like to cast booleans into ints
    // 1 = yes, 0 = no
    public int underPressure;

    public int attack;
    public int specialAttack;
    public int defense;
    public int specialDefense;
    public int maxHp;

    public int speed;

    public int evasion;
    public int originalAccuracy;
    public int accuracy;

    public Move[] moves = new Move[4];

    // TODO do the thing
    // literally the core reason why I will stop making subclasses, when I just can generate XML's to store them as files
    public void readFromXML(String path) throws FileNotFoundException {
        File data = new File(path);
        Scanner reader = new Scanner(data);
        if (data.isDirectory() || !data.exists() || !data.canRead()) {
            System.err.println("\"" + path + "\"" + " isDirectory = " + data.isDirectory() + " exists = " + data.exists() + " canRead = " + data.canRead());
            System.exit(-2);
        }

        while (reader.hasNext()) {
            System.out.println(reader.nextLine());
        }
    }
}
