package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
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
	public void testForGetResultStringNamesAndAge1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
	
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	
	@Test
	public void testForGetResultStringNamesAndAge2() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silv", "M", "30", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	
	@Test
	public void testForGetResultStringNamesAndAge3() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "35", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30'",
				result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}
}
