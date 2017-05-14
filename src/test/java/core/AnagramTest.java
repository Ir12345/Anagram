package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramTest {
	
	 
	
  @Test
  public void testAnagram1() {
	  
	  String s = new String("Debit Card");
	  String t = new String("Bad Credit");
	  
	  System.out.println("Debit Card and Bad Credit is anagram? - " + Anagram.validate(s, t));
	  Assert.assertTrue(Anagram.validate(s, t));
	  
	   
  }

@Test
  public void testAnagram2() {
	  
	  String s = new String("Охренеть");
	  String t = new String("Не хрена себе");
	  
	  System.out.println("Охренеть and Не хрена себе is anagram? - " + Anagram.validate(s, t));
	  Assert.assertFalse(Anagram.validate(s, t));
  }
  
}
