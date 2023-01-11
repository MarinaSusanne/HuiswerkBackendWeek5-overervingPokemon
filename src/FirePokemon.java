import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "FlameThrower");

    public FirePokemon(String name, int level, String food, String sound, int hp) {
        super(name, level, food, sound, hp, "fire");

    }

    public void inferno( Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno " );
    }


    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }


    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
