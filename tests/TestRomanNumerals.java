import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testI() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(1);
		String r = romanize.getTranslation();
		
		assertEquals("i does not work", "I", r);
		
	}
	
	@Test
	public void testIV() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(4);
		String r = romanize.getTranslation();
		
		assertEquals("i does not work", "IV", r);
	}

	@Test
	public void testV() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(5);
		String r = romanize.getTranslation();
		
		assertEquals("v does not work", "V", r);
		
	}
	
	@Test
	public void testIX() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(9);
		String r = romanize.getTranslation();
		
		assertEquals("ix does not work", "IX", r);
	}
	
	@Test
	public void testX() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(10);
		String r = romanize.getTranslation();
		
		assertEquals("x does not work", "X", r);
		
	}
	
	@Test
	public void testXL() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(40);
		String r = romanize.getTranslation();
		
		assertEquals("xl does not work", "XL", r);
	}
	
	@Test
	public void testL() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(50);
		String r = romanize.getTranslation();
		assertEquals("L does not work", "L", r);
		
	}
	
	@Test
	public void testXC() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(90);
		String r = romanize.getTranslation();
		
		assertEquals("xc does not work", "XC", r);
	}
	
	@Test
	public void testC() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(100);
		String r = romanize.getTranslation();
		assertEquals("c does not work", "C", r);
		
	}
	
	@Test
	public void testCD() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(400);
		String r = romanize.getTranslation();
		
		assertEquals("cd does not work", "CD", r);
	}
	
	@Test
	public void testD() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(500);
		String r = romanize.getTranslation();
		
		assertEquals("d does not work", "D", r);
		
	}
	
	@Test
	public void testCM() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(900);
		String r = romanize.getTranslation();
		
		assertEquals("cm does not work", "CM", r);
	}
	
	@Test
	public void testM() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.convertToRoman(1000);
		String r = romanize.getTranslation();
		assertEquals("m does not work", "M", r);
		
	}
	
	@Test
	public void testTripleI() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.recreateInt(3);
		String r = romanize.getTranslation();
		
		assertEquals("triple I does not work", "III", r);
		
	}
	
	@Test
	public void testTripleX() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.recreateInt(30);
		String r = romanize.getTranslation();
		
		assertEquals("triple I does not work", "XXX", r);
		
	}
	
	@Test
	public void testTripleC() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.recreateInt(300);
		String r = romanize.getTranslation();
		
		assertEquals("triple I does not work", "CCC", r);
		
	}
	
	@Test
	public void testTripleM() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.recreateInt(3000);
		String r = romanize.getTranslation();
		
		assertEquals("triple I does not work", "MMM", r);
		
	}
	
	@Test
	public void testThisYear() {
		
		RomanNumerals romanize = new RomanNumerals ();
		
		romanize.recreateInt(2018);
		String r = romanize.getTranslation();
		
		assertEquals("triple I does not work", "MMXVIII", r);
		
	}
	
}
