package webscrapingTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testlogic {
	//test logic
	@Test
	public void testFindMax(){  
        assertEquals(4,logiv.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,logiv.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  

}
