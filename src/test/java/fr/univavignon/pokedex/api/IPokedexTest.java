package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IPokedexTest {

		IPokedex pokedex = Mockito.mock(IPokedex.class);
		IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
		
		@Test
		  public void testIPokedexTest() throws PokedexException  {
			
			IPokedex pokedex = Mockito.mock(IPokedex.class);
			//Mockito.when(pokemonFactory.createPokemon(0,613,64,4000,4)).thenReturn(new Pokemon(0,"Bulbizarre",126,126,90,613, 64,4000,  4, 0.56));

			
		  }
		
		@Test
		  public void testIPokedexSize() throws PokedexException  {
			
			//Mockito.when(pokemonFactory.createPokemon(0,613,64,4000,4)).thenReturn(new Pokemon(0,"Bulbizarre",126,126,90,613, 64,4000,  4, 0.56));

			
		  }

}
