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
/**
 * 
 * @author amos
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IPokemonMetadataProviderTest {
	IPokemonMetadataProvider metadataProvider;
	//IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
	PokemonMetadata metadata1 ;
	PokemonMetadata metadata2 ;
	
	@Before
	 public void setUp() {
		 metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		 metadata1 =new PokemonMetadata(0,"Bulbizarre",126,126,90);
		 metadata2 =new PokemonMetadata(133,"Aquali",186,168,260);
			
	}
	@Test
	  public void testMetadataProvider() throws PokedexException  {
		
		passArgument(0);
		passArgument(133);

		assertEquals(metadata1,metadataProvider.getPokemonMetadata(0));
		assertEquals(metadata2,metadataProvider.getPokemonMetadata(133));
		assertEquals(null,metadataProvider.getPokemonMetadata(-1));
		assertEquals(null,metadataProvider.getPokemonMetadata(151));

		//Mockito.when(metadataProvider.getPokemonMetadata(0)).thenReturn(metadata1);
		/*Mockito.when(metadataProvider.getPokemonMetadata(133)).thenReturn(new PokemonMetadata(133,"Aquali",186,168,260));
		PokemonMetadata pokomonMetadata = Mockito.mock(PokemonMetadata.class);
		assertEquals("Aquali",metadataProvider.getPokemonMetadata(133).getName());*/
	  }
	
	public void passArgument(int index) throws PokedexException {
		Mockito.when(metadataProvider.getPokemonMetadata(index)).thenAnswer(
				new Answer() {
			         public Object answer(InvocationOnMock invocation)  {
			             Object[] args = invocation.getArguments();
			             Object mock = invocation.getMock();
			             int index =(int)args[0];
			             if(index>=0 && index<=150) {
			            	 if(index==0) {
			            		 return metadata1;
			            	 }
			            	 if(index==133){
			            		return metadata2;
			            	 }
			             }
			            
			           
			             return 0;
			         }
				}
			); 
	}
	
}
