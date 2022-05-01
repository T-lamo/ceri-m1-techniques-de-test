package fr.univavignon.pokedex.api;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
public class IPokemonTrainerFactoryTest {
	
	
	IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
	IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
	IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
	
	
	@Before
	 public void setUp() {
		 pokedexFactory = Mockito.mock(IPokedexFactory.class);
		 metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		 pokemonFactory = Mockito.mock(IPokemonFactory.class);
	}
	
	@Test
	  public void testIPokemonTrainerFactory() throws PokedexException  {
		
		
		

	  }
}
