package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	// skriva en method som svara på om man får komma in på systemet eller inte.
	// ålder
	// Målsmans sällskap
	// Har med sig en hund
	// Du få inte komma in under 20 år
	// Du får komma in under 20 om i målsmans sällskap
	// Du får komma in om du är 18 år eller mer, men inte om  du har med hund.
	// Du får komma  in med hund om du är blind förutsatt att du är 20 + elle i målsmans sällskap

	// vår riktiga metod
	/*
	//public boolean squareRootOf(int x){
		for (int i = 1; i < X; ++i) {
			int p = i * i;
			if (p == X) {
				// perfect square
				return i;
			}
			if (p > X) {
				// found left part of decimal
				return sqrt(X, i - 1, i);
			}
		}
		return Double.NaN; */
	//int x = 0;
		/*double R = Math.sqrt(x);
		return true;
	}
	@Test
	void testSquareRootOf_9To3() {
		Assertions.assertTrue(squareRootOf(9));
	}
	@Test
	void testSquareRootOf_0To0() {
		Assertions.assertTrue(squareRootOf(0));
	}
	@Test
	void testSquareRootOf_minus1ToNaN() {
		Assertions.assertTrue(squareRootOf(-1));
	}*/
	public double squareRootOf(double x) {
		if (x < 0) {
			throw new IllegalArgumentException("Cannot compute square root of a negative number.");
		}

		if (x == 0) {
			return 0;
		}

		double t;
		double p = x / 2;

		do {
			t = p;
			p = (t + x / t) / 2;

		} while (Math.abs(t - p) > 1e-6);

		return p;
	}

	@Test
	public void testSquareRootOf() {
		double result = squareRootOf(9);
		double expected = 3.0;
		Assertions.assertEquals(expected, result, 1e-6);
	}

	@Test
	public void testSquareRootOf2() {
		double result = squareRootOf(0);
		double expected = 0;
		Assertions.assertEquals(expected, result, 1e-6);
	}

	@Test
	public void testSquareRootOf3() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> squareRootOf(-1));
	}

	public double getCircumference(int radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		}

		return 2 * Math.PI * radius;
	}
	@Test
	public void testGetCircumference() {
		int radius = 3;
		double expectedCircumference = 2 * Math.PI * radius;
		double actualCircumference = getCircumference(radius);
		double delta = 1e-2; // tolerance for floating-point comparison
		Assertions.assertEquals(expectedCircumference, actualCircumference, delta);
	}
	@Test
	public void testGetCircumferenceWithZeroRadius() {
		int radius = 0;
		double expectedCircumference = 0;
		double actualCircumference = getCircumference(radius);
		double delta = 1e-6; // tolerance for floating-point comparison
		Assertions.assertEquals(expectedCircumference, actualCircumference, delta);
	}
	//C =PI*d
	//C circumference, pi= 3,14, d diameter(radius*2)
	/*public boolean  getCircumference(int radius){
		return 2 * Math.PI * radius;
	}
	@Test
	void getCircumference_3To18Decimal85(){
		Assertions.assertTrue(getCircumference(3));
	}
	public boolean getArea(double radius){
		return Math.PI * radius * radius;
	}
	@Test
	void getArea_3To28Decimal27(double radius){
		Assertions.assertTrue(getArea(3));
	}*/
/*
	public boolean isOfAge(int age, boolean inCompanyOfAParent, boolean hasADog, boolean isBlind) throws Exception {

		if (age < 0) {
			throw new Exception("Du kan inte vara under 0 år");
		}

		if(!isBlind && hasADog){
			return false;
		}
		else if(!inCompanyOfAParent && age < 20){
			return false;
		}
     	   return true;
	}
	@Test
	void givenTooYoungNotInCompanyOfAParentAndNoBringingADog_whenTryingToEnterSystembolaget_thebReturnFalse() throws Exception{
		Assertions.assertFalse(isOfAge(9, false, false, false));
	}
	@Test
	void givenOfAgeNotInCompanyOfAParentAndNoBringingADog_whenTryingToEnterSystembolaget_thenReturnTrue() throws Exception{
		Assertions.assertTrue(isOfAge(50, false, false, false));
	}
	@Test
	void givenOfAgeNotInCompanyOfAParentAndNoBringingADog_whenTryingToEnterSystembolaget_thenReturunTrue() throws Exception{
		Assertions.assertTrue(isOfAge(15, true,false, false));
	}
	@Test
	void givenOfAgeNotInCompanyOfAParentAndNoBringingADog_whenTryingToEnter_thenReturnFalse() throws Exception{
		Assertions.assertFalse(isOfAge(40, false, true, false));
	}
	@Test
	void givenA19YearOldWithoutParentOrDog_whenTryingToEnter_thenReturnFalse() throws Exception{
		Assertions.assertFalse(isOfAge(19, false, false, false));
	}
	@Test
	void givenA20YearOldWithoutParentOrDog_whenTryingToEnter_thenReturnTrue() throws Exception{
		Assertions.assertTrue(isOfAge(20, false, false, false));
	}
	@Test
	void givenOfAgeWithoutParentWithDogAndBlind() throws Exception{
		Assertions.assertTrue(isOfAge(35, false, true, true));
	}
	@Test
	@DisplayName("Kastar ett exception")
	void givenAnInvalidAge_whenTryingToExecuteTheMethod_thenThrowAnException() throws Exception{
		Exception thrown = Assertions.assertThrows(Exception.class, ()->isOfAge(-5, false, false, false));
	    //Assertions.assertTrue(thrown.getMessage().contentEquals("Du kan inte vara under 0 år"));
	    Assertions.assertEquals("Du kan inte vara under 0 år", thrown.getMessage() );
	}


*/
}


