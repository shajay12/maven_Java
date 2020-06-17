package com.mkyong;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    public void evenNumberTest(){
        MyAssertTrueTest asft = new MyAssertTrueTest();
        assertTrue(asft.isEvenNumber(4));
    }
	
	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}
	

}
