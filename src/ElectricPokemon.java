import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "voltTackle");

    @Override
    public List<String> getAttacks() {return attacks;}


    private void electricAttack(Pokemon pokemon, Pokemon gymPokemon) {
        switch (gymPokemon.getType()) {
            case "electric": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "fire": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "grass": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "water": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
        }
    }


    public void thunderPunch (Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + "with thunderpunch");
        electricAttack(pokemon, gymPokemon);
    }
    public void electroBall (Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with electroBall");
        electricAttack(pokemon, gymPokemon);
    }

    public void voltTackle (Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with volttackle ");
        electricAttack(pokemon, gymPokemon);
    }

    public void thunder (Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunder ");
        switch (gymPokemon.getType()) {

            case "electric": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " gives a boost of 20 hp to  " + pokemon.getName());
                gymPokemon.setHp(currentHp +20);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "fire": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "grass": {
                int currentHp = gymPokemon.getHp();
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

            case "water": {
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
