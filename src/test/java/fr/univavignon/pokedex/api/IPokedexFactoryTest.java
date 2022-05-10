package fr.univavignon.pokedex.api;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import fr.univavignon.pokedex.api.IPokemonFactory;

@RunWith(MockitoJUnitRunner.class)
public class IPokedexFactoryTest {
	
	IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
	IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
	IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
	IPokedex pokedex = Mockito.mock(IPokedex.class);
	@Before
	 public void setUp() {
		 metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		 pokemonFactory = Mockito.mock(IPokemonFactory.class);
	}
	
	@Test
	  public void testIPokedexFactoryTest() throws PokedexException  {
		//Mockito.when(metadataProvider.getPokemonMetadata(133)).thenReturn(new PokemonMetadata(133,"Aquali",186,168,260));

		
		//assertEquals(pokedex.getClass(), pokedexFactory.createPokedex(metadataProvider, pokemonFactory));
		
	  }
	
}
