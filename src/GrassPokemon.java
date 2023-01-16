import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    private void grassAttack(Pokemon pokemon, Pokemon gymPokemon) {
        switch (gymPokemon.getType()) {
            case "grass" -> {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "water" -> {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "fire" -> {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "electric" -> {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
        }
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + "with leafstorm");
        grassAttack(pokemon, gymPokemon);
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam");
        grassAttack(pokemon, gymPokemon);
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade ");
        grassAttack(pokemon, gymPokemon);
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leechSeed ");

        switch (gymPokemon.getType()) {
            case "grass" -> {
                int currentHp = gymPokemon.getHp();
                int currentHpOwnPokemon = pokemon.getLevel();
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack  and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                pokemon.setHp(currentHpOwnPokemon + 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "water" -> {
                int currentHp = gymPokemon.getHp();
                int currentHpOwnPokemon = pokemon.getLevel();
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                pokemon.setHp(currentHpOwnPokemon + 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "fire" -> {
                int currentHp = gymPokemon.getHp();
                int currentHpOwnPokemon = pokemon.getLevel();
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                gymPokemon.setHp(currentHpOwnPokemon + 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "electric" -> {
                int currentHp = gymPokemon.getHp();
                int currentHpOwnPokemon = pokemon.getLevel();
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                gymPokemon.setHp(currentHpOwnPokemon + 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
        }
    }
}



