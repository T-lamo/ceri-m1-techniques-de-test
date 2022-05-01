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
	
	IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
	IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
	
	
	@Before
	 public void setUp() {
		 metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		 pokemonFactory = Mockito.mock(IPokemonFactory.class);
	}
	
	@Test
	  public void testIPokedexFactoryTest() throws PokedexException  {
		
		
		
	  }
	
}
