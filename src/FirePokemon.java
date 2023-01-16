import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    //    private final variable;
    //    private final variable;

    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "FlameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }


    @Override
    public List<String> getAttacks() {
        return attacks;
    }


    private void fireAttack(Pokemon pokemon, Pokemon gymPokemon) {
        switch (gymPokemon.getType()) {
            case "fire": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println("Your attackers Pokemon " + gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println("Your Pokemon " + pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            }

            case "electric": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println("Your attackers Pokemon " + gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println("Your Pokemon " + pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            }

            case "water": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println("Your attackers Pokemon " + gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println("Your Pokemon " + pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            }

            case "grass": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println("Your attackers Pokemon " + gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println("Your Pokemon " + pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            }
        }
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno ");
        fireAttack(pokemon, gymPokemon);
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroBall ");
        fireAttack(pokemon, gymPokemon);
    }


    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with fireLash ");
        fireAttack(pokemon, gymPokemon);
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flameThrower");
        fireAttack(pokemon, gymPokemon);
    }
}






