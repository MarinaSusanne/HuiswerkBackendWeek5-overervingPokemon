import java.util.List;

public abstract class Pokemon {

    private final String name;
    private final int level;
    private final String type;
    private final String food;
    private final String sound;
    private int hp;

    public Pokemon(String name, int level,  String food, String sound, int hp, String type) {
        this.name = name;
        this.level = level;
        this.food = food;
        this.sound = sound;
        this.hp = hp;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;

    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public abstract List<String> getAttacks();


}
