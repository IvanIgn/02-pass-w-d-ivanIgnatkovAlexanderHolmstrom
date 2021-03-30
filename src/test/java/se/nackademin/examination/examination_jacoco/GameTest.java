package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

import org.junit.Test;

public class GameTest {
	


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
	
		@Test
	    public void getGenderFromInputValues() {
	       // Game game = new Game();
	        ArrayList<String> arrayOfInputs = new ArrayList<>();
	        
	        arrayOfInputs.add(0, "M");
	        char genderCharacter = arrayOfInputs.get(3).charAt(0);	
	       // int i = game.getGenderFromInputValues(genderCharacter);
	        assertEquals("The result should be 3", genderCharacter, 0);
	    }
	
	

}
