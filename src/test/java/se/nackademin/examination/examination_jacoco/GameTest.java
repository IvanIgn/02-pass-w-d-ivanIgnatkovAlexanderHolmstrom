package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {
	
public ArrayList<String> values = new ArrayList<String>();




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
	
		////Test for function getGenderFromInputValues() ////
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
		
		//// Test for function getAgeFromInputValues() ////
		
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
	  
	        assertEquals("The result should be 27", i, 27);
			
		}
		
		//// Test for function runGame() ////
		
        @Test
        public void testrunGame() {
            Game game = new Game();

            String gameName = "Game";
            String firstName = "Alexander";
            String lastName = "Holmstrom";
            char gender = 'M';
            int age = 34;
            String homeCity = "Stockholm";

            game.runGame(gameName, firstName, lastName, gender, age, homeCity);

            int nameRun = game.calculateOutPutBasedOnNames(firstName, lastName);
            assertEquals("CalculateOutPutBaseOnNames should be 2", nameRun, 2);

            int genderRun = game.calculateOutPutBasedOnGender(gender);
            assertEquals("CalculateOutPutBasedOnGender should be 0", genderRun, 0);

            int ageRun = game.calculateOutPutBasedOnAge(age);
            assertEquals("CalculataOutPutBasedOnAge should be 1", ageRun, 1);

            int cityRun = game.calculateOutPutBasedOnHomeCity(homeCity);
            assertEquals("CalculateOutPutBasedOnHomeCity should be 10", cityRun, 10);

        }
        
        //// Test for function Run() ////
        @Test
        public void testRun() {
        	
        	Game game = new Game();
            ArrayList<String> values = new ArrayList<String>();
            values.addAll(Arrays.asList("Game1", "John", "Jackson", "M", "27", "London"));

            game.run(values);

            assertEquals(values.get(0), "Game1");
            assertEquals(values.get(1), "John");
            assertEquals(values.get(2), "Jackson");
            assertEquals(game.getGenderFromInputValues(values), 'M');
            assertEquals(game.getAgeFromInputValues(values), 27);
            assertEquals(values.get(5), "London");}

}
