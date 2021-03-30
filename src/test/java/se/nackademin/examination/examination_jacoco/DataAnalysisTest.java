package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	

	//// Test for buildFinalString ////
	@Test
	public void testForBuildFinalString() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older'",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}
	
	
	//// Test for getResultStringNamesAndAge //// 
	@Test
	public void testForGetResultStringNamesAndAge1() {			//firstName < lastName && age == 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
	
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	
	@Test
	public void testForGetResultStringNamesAndAge2() {			//firstName == lastName && age == 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	
	@Test
	public void testForGetResultStringNamesAndAge3() {			//firstName < lastName && age < 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	
	@Test
	public void testForGetResultStringNamesAndAge4() {			//firstName == lastName && age < 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	////////////////////////////////////////////////////////
	@Test
	public void testForGetResultStringNamesAndAge5() {			//firstName > lastName && age > 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is greater in size to the last name and the participant older than 30'",
				result.contains("The first name is greater in size to the last name and the participant older than 30"));
	} 

	@Test
	public void testForGetResultStringNamesAndAge7() {			//firstName > lastName && age < 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'No analysis was performed'",
				result.contains("No analysis was performed"));
	}

	@Test
	public void testForGetResultStringNamesAndAge9() {			//firstName > lastName && age == 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'No analysis was performed'",
				result.contains("No analysis was performed"));
	} 
	@Test
	public void testForGetResultStringNamesAndAge8() {			//firstName == lastName && age < 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "31", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values); 
		assertTrue("The result should contain 'No analysis was performed'",
				result.contains("No analysis was performed"));
	}
	
	
	//// Test for getResulStringHomecityAndAge ////
	@Test
	public void testForGetResulStringHomecityAndAge1() {		//homeCity < 5 && age > 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "35", "Fort"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older",
				result.contains("The name of the homecity is small and the participant is 30 or older"));
	}
	@Test
	public void testForGetResulStringHomecityAndAge2() {		//homeCity < 5 && age == 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fort"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older",
				result.contains("The name of the homecity is small and the participant is 30 or older"));
	}
	////
	@Test
	public void testForGetResulStringHomecityAndAge3() {		//homeCity < 5 && age > 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fort"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30",
				result.contains("The name of the homecity is small and the participant is younger than 30"));
	}
	/////////
	@Test
	public void testForGetResulStringHomecityAndAge4() {		//homeCity > 5 && age == 30
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}
	@Test
	public void testForGetResulStringHomecityAndAge5() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "35", "Fortaleza"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}
	////
	@Test
	public void testForGetResulStringHomecityAndAge6() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30",
				result.contains("The name of the homecity is big and the participant is younger than 30"));
	}
	
}
