package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class IPokemonFactoryTest {
	IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
	Pokemon pokemon1 = new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,0.56);
	Pokemon pokemon2 = new Pokemon(133,"Aquali",186,168,260,2729,202,5000,4,1);

	@Test
	  public void testIPokemonFactory() throws PokedexException  {
		
		
		
		passArgument(0,613,64,4000,4);
		passArgument(133,202,5000,4,1);

		assertEquals(pokemon1,pokemonFactory.createPokemon(0,613,64,4000,4));
		assertEquals(pokemon2,pokemonFactory.createPokemon(133,202,5000,4,1));

		
	  }
	
	public void passArgument(int index,int cp, int hp, int dust, int candy) throws PokedexException {
	
		Mockito.when(pokemonFactory.createPokemon(index,cp,hp,dust,candy)).thenAnswer(
				new Answer() {
			         public Object answer(InvocationOnMock invocation)  {
			             Object[] args = invocation.getArguments();
			             Object mock = invocation.getMock();
			             int index =(int)args[0];
			             if(index>=0 && index<=150) {
			            	 if(index==0) {
			            		 return pokemon1;
			            	 }
			            	 if(index==133){
			            		return pokemon2;
			            	 }
			             }
			             return 0;
			         }
				}
			); 
	}
}
