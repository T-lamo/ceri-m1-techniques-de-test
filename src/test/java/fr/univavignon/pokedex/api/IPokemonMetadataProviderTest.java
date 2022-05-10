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
	PokemonMetadata metadata1 ;
	PokemonMetadata metadata2 ;
	
	@Before
	 public void setUp() {
		 metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		 metadata1 =new PokemonMetadata(0,"Bulbizarre",126,126,90);
		 metadata2 =new PokemonMetadata(133,"Aquali",186,168,260);
			
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
