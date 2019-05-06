package calculator.lexicon.Calculator2019w1;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTests {
	
	@Test
	public void test_Correct_switchCalc_ResultPlus() {
		char testOperator = '+';
		double testNum1 = 5;
		double testNum2 = 5;
		String expectedCalc = "[Calculator] Result: " + 10.0;
		Assert.assertEquals(expectedCalc, Calculator.switchCalc(testNum1, testOperator, testNum2));
	}
	
	@Test
	public void test_Correct_switchCalc_ResultSubtract() {
		char testOperator = '-';
		double testNum1 = 5;
		double testNum2 = 5;
		String expectedCalc = "[Calculator] Result: " + 0.0;
		Assert.assertEquals(expectedCalc, Calculator.switchCalc(testNum1, testOperator, testNum2));
	}
	
	@Test
	public void test_Correct_switchCalc_ResultDiv() {
		char testOperator = '/';
		double testNum1 = 5;
		double testNum2 = 5;
		String expectedCalc = "[Calculator] Result: " + 1.0;
		Assert.assertEquals(expectedCalc, Calculator.switchCalc(testNum1, testOperator, testNum2));
	}
	
	@Test
	public void test_Correct_switchCalc_ResultMult() {
		char testOperator = '*';
		double testNum1 = 5;
		double testNum2 = 5;
		String expectedCalc = "[Calculator] Result: " + 25.0;
		Assert.assertEquals(expectedCalc, Calculator.switchCalc(testNum1, testOperator, testNum2));
		}

	@Test
	public void test_Correct_Menu(){
		String expectedTestMenu = "[Calculator] Menu: \n1 = New Calculation, 2 = Exit";
		String actualMenu = Calculator.menu();
		
		Assert.assertEquals(expectedTestMenu, actualMenu);
		
	}

}
