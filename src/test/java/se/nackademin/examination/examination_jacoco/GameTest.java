package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.util.Arrays.asList;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Test;

public class GameTest {
	
public ArrayList<String> values = new ArrayList<String>();
public ArrayList<String> values2 = new ArrayList<String>();



    @Test
    public void testMethod1() {
        Game game = new Game();
        int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
        assertEquals("The result should be 1", i, 1);
    }


	//// Name Tests ////
	
	@Test
	public void nameTest1() {
		Game game = new Game();
		String firstName = "Abcd";
		String lastName = "Abcde";
		int i = game.calculateOutPutBasedOnNames(firstName, lastName);
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void nameTest2() {
		Game game = new Game();
		String firstName = "Abcde";
		String lastName = "Abcd";
		int i = game.calculateOutPutBasedOnNames(firstName, lastName);
		assertEquals("The result should be 1", i, 1);	
	}
	@Test
	public void nameTest3() {
		Game game = new Game();
		String firstName = "Abcd";
		String lastName =  "Cdef";
		int i = game.calculateOutPutBasedOnNames(firstName, lastName);
		assertEquals("The result should be 2", i, 2);
	
	}
	
	//// Gender Tests ////
	
	@Test
	public void genderTest1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void genderTest2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void genderTest3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('B');
			assertEquals("The result should be 2", i, 2);
	}
	
	//// Age Tests ////
	
	@Test
	public void ageTest1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(20);
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void ageTest2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(26);	
		assertEquals("The result should be 1", i, 1);
	}
	
	//// City Tests ////
	
	@Test
	public void cityTest1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("a");	
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void cityTest2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("b");	
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void cityTest3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("c");	
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void cityTest4() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("d");	
		assertEquals("The result should be 3", i, 3);
	}
	@Test
	public void cityTest5() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("e");	
		assertEquals("The result should be 4", i, 4);
	}
	@Test
	public void cityTest6() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("f");	
		assertEquals("The result should be 5", i, 5);
	}
	@Test
	public void cityTest7() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("g");	
		assertEquals("The result should be 6", i, 6);
	}
	@Test
	public void cityTest8() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("h");	
		assertEquals("The result should be 7", i, 7);
	}
	@Test
	public void cityTest9() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("i");	
		assertEquals("The result should be 8", i, 8);
	}
	@Test
	public void cityTest10() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("j");	
		assertEquals("The result should be 9", i, 9);
	}
	@Test
	public void cityTest11() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("k");	
		assertEquals("The result should be 10", i, 10);
	}
	
	
	//// Test function getGenderFromInputValues()
	/*
		@Test
	    public void testRun() {
	        Game game = new Game();
	        //game.getGenderFromInputValues(arrayOfInputs);
	        values.add(0, "Game1");
	        values.add(1, "John");
	        values.add(2, "Jackson");
	        values.add(3, "M");
	        values.add(4,  "27");
	        values.add(5, "London");
	        
	       
	     //  values.get(3).charAt(0);
	      // char gender = values.get(3).charAt(0);
	       
	      // int age = Integer.parseInt(values.get(4));
	        
	        
	        
	        
	        assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'",
					result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	    
	        //Game game = new Game();
         ArrayList<String> bla = game.run(values);
	        assertEquals("The result should be 1", i, 1);
	    }
	    */
		
		@Test
	    public void testGetGenderFromInputValues() {
			 Game game = new Game();
		     
		     
			values.add(0, "Game1");
	        values.add(1, "John");
	        values.add(2, "Jackson");
	        values.add(3, "M");
	        values.add(4,  "27");
	        values.add(5, "London");
	        int i = game.getGenderFromInputValues(values);
	       
	        //char genderCharacter = values.get(3).charAt(0);
	  
	        assertEquals("The result should be 'M'", i, 'M');
			
		}
		
		@Test
	    public void testGetAgeFromInputValues() {
			 Game game = new Game();
		     
		     
			values.add(0, "Game1");
	        values.add(1, "John");
	        values.add(2, "Jackson");
	        values.add(3, "M");
	        values.add(4,  "27");
	        values.add(5, "London");
	        int i = game.getAgeFromInputValues(values);
	       
	        //char genderCharacter = values.get(3).charAt(0);
	  
	        assertEquals("The result should be 'M'", i, 27);
			
		}
		/*
		@Test
	    public void testBuildFinalString() {
			values.add(0, "Game1");
	        values.add(1, "John");
	        values.add(2, "Jackson");
	        values.add(3, "M");
	        values.add(4,  "27");
	        values.add(5, "London");
	        
			 Game game = new Game();
			 ResultFromInputs results = new ResultFromInputs();
			 Conversor conversor = new Conversor();
			 int bla = game.buildFinalString(values.get(1), values.get(2), results, conversor);
		     
			 verify(publishing,times(1)).publishInformation(person)
	       
	        //char genderCharacter = values.get(3).charAt(0);
	  
	        assertEquals("The result should be 'M'", i, 27);
			
		}
		*/
		
		

}
