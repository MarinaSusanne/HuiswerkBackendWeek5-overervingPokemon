import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("surf", "HydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }


    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    private void waterAttack(Pokemon pokemon, Pokemon gymPokemon) {
        switch (gymPokemon.getType()) {
            case "water": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "grass": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "electric": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "fire": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            }
        }
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf");
        waterAttack(pokemon, gymPokemon);
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump");
        waterAttack(pokemon, gymPokemon);

    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon ");
        waterAttack(pokemon, gymPokemon);
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance ");
        switch (gymPokemon.getType()) {
            case "water": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "grass": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " gives an hp boost of 15hp to " + pokemon.getName());
                gymPokemon.setHp(currentHp +15);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "electric": {
                System.out.println("Raindance attack from" + pokemon.getName() + " has no effect on " + pokemon.getName());
                }

            case "fire": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
        }
    }
}

