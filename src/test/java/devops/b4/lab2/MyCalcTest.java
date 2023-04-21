package devops.b4.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg3.MyCalc;

public class MyCalcTest {

	@Test
	public void test() {
		MyCalc ob = new MyCalc();
		
 
         assertEquals(25, ob.sum(20, 5));
         assertEquals(110, ob.mul(20, 5));
         
	}
   
    
}
