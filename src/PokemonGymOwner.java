import java.util.List;
//De andere klasse extends de eerste klasse en heeft zelf nog 1 variabele, een getter, setter en een constructor die enkel de super aanroept
public class PokemonGymOwner extends PokemonTrainer {

    private final String town;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name,pokemons);
        this.town = town;
    }

    public String getTown() { return town;}

    public String getName (){return name;}


}
