package archive;

import java.io.Serializable;

public class Character implements Serializable {
    static final long serialVersionUID =
            -5849794470654667210L;
    private String name;

    private long mana;

    private int health;

    private int strength;

    private int wisdom;

    public Character(String name, int mana, int health, int strength, int wisdom) {
        this.name = name;
        this.mana = mana;
        this.health = health;
        this.strength = strength;
        this.wisdom = wisdom;
    }
}
