package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ConversorTest {
	
	//// Name ////
	
	@Test
	public void testConversorName1() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}
	
	
	@Test
	public void testConversorName2() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(1), "Your last name is smaller than your first name");
	}
	
	@Test
	public void testConversorName3() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(2), "The lengths of your first name and your last name are the same");
	}
	
	//// Age ////
	
	@Test
	public void testConversorAge1() {
		Conversor conversor = new Conversor();
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough!");
	}
	
	
	
	@Test
	public void testConversorAge2() {
		Conversor conversor = new Conversor();
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(1), "You are experienced and talented! Things will come your way soon enough!");
	}
	
	//// Gender ////
	
	@Test
	public void testConversorGender1() {
		Conversor conversor = new Conversor();
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(0), "man!");
	}
	
	@Test
	public void testConversorGender2() {
		Conversor conversor = new Conversor();
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!");
	}
	
	@Test
	public void testConversorGender3() {
		Conversor conversor = new Conversor();
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(2), "person!");
	}
	
	//// City ////
	
	@Test
	public void testConversorCity() {
		Conversor conversor = new Conversor();
		conversor.setCityConverterArrayValues();
		ArrayList<String> c = conversor.getCityConverterArray();
		
			for (String city : c) {
				switch (city) {
				case (" A, "): 
				assertEquals(conversor.getCityConverterArray().get(0), (" A, "));
					break;
				case (" B, "): 
				assertEquals(conversor.getCityConverterArray().get(1), (" B, "));
					break;
				case (" C, "):
				assertEquals(conversor.getCityConverterArray().get(2), (" C, "));
					break;
				case (" D, "): 
				assertEquals(conversor.getCityConverterArray().get(3), (" D, "));
					break;
				case (" E, "): 
				assertEquals(conversor.getCityConverterArray().get(4), (" E, "));
					break;
				case (" F, "): 
				assertEquals(conversor.getCityConverterArray().get(5), (" F, "));
					break;
				case (" G, "): 
				assertEquals(conversor.getCityConverterArray().get(6), (" G, "));
					break;
				case (" H, "): 
				assertEquals(conversor.getCityConverterArray().get(7), (" H, "));
					break;
				case (" I, "): 
				assertEquals(conversor.getCityConverterArray().get(8), (" I, "));
					break;
				case (" J, "): 
				assertEquals(conversor.getCityConverterArray().get(9), (" J, "));
					break;
				default:
					assertEquals(conversor.getCityConverterArray().get(10), (" a letter that comes after J, "));
					break;
				}
		
		}
	}
}
	
	
