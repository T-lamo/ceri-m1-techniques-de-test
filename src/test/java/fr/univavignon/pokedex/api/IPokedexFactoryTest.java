package fr.univavignon.pokedex.api;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IPokedexFactoryTest {
	@Test
	  public void testIPokedexFactoryTest() throws PokedexException  {
		
		
		/*IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		Mockito.when(metadataProvider.getPokemonMetadata(0)).thenReturn(new PokemonMetadata(0,"Bulbizarre",126,126,90));
		//Mockito.when(metadataProvider.getPokemonMetadata(133)).thenReturn(new PokemonMetadata(133,"Aquali",186,168,260));

		
		IPokemonFactory pokemonFactory =  Mockito.mock(IPokemonFactory.class);
		Mockito.when(pokemonFactory.createPokemon(0,613,64,4000,4)).thenReturn(new Pokemon(0,"Bulbizarre",126,126,90,613, 64,4000,  4, 0.56));
		
		IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
		//Mockito.when(pokedexFactory.createPokedex(metadataProvider, pokemonFactory));
		*/
	  }
	
	//Pokemon createPokemon(int index, int cp, int hp, int dust, int candy);
}
