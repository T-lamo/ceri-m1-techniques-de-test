package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
		
		
		Pokemon pokemon1 =new Pokemon(133,"Aquali",186,168,260,2729,202,5000,4,1);
		
		@Before
		 public void setUp() {
			 pokedex = Mockito.mock(IPokedex.class);
			
		}
		@Test
		  public void verifierAjoutPokemon() throws PokedexException  {
			System.out.println("ts");
			pokedex.addPokemon(pokemon1);
			Mockito.verify(pokedex).addPokemon(pokemon1);

		  }
		
		@Test
		  public void testIPokedexSize() throws PokedexException  {
			
			//Mockito.when(pokemonFactory.createPokemon(0,613,64,4000,4)).thenReturn(new Pokemon(0,"Bulbizarre",126,126,90,613, 64,4000,  4, 0.56));

			
		  }

}
