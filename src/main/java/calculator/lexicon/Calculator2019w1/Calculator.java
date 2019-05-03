package calculator.lexicon.Calculator2019w1;

import java.util.Scanner;

public class Calculator {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean calcLoop = true;
		String consoleNumber = ("[Calculator] Insert number: ");
		String consoleOperator = ("[Calculator] Insert operator: ");
		
		do {
			System.out.println(consoleNumber);
			double first = Double.parseDouble(getInput());
			
			System.out.println(consoleOperator);
			char operator = getInput().charAt(0);
			
			System.out.println(consoleNumber);
			double second = Double.parseDouble(getInput());
			
			String calcResult = switchCalc(first, operator, second);
			
			System.out.println(calcResult);
			
	        
			System.out.println(menu());
			String menuCommand = getInput();
			if(menuCommand.equals("1")){
				System.out.println("[Calculator] Restarting");
				
			} else if(menuCommand.equals("2")){
				System.out.println("[Calculator] Exited program");
				calcLoop = false;
			} else {
				System.out.println("[Calculator] Invalid Menu Selection, Exiting...");
				calcLoop = false;
			}
		}while(calcLoop);
	}

	public static String getInput(){
   	 String input = SCANNER.nextLine();
   	 return input;
    }
	public static String menu() {
		String menu = "[Calculator] Menu: \n1 = New Calculation, 2 = Exit";
		return menu;
	}
	
	public static String resultShow(double result) {
		String calcString = "[Calculator] " + result;
		return calcString;
	}

	public static String switchCalc(double first, char operator, double second) {
		
		double result = 0;
	
		switch(operator) {
        case '+':
        	result = resultPlus(first, second);
        	break;
        case '-':
        	result = resultSubtract(first, second);
            break;
        case '/':
        	result = resultDivide(first, second);
        	break;
        case '*':
        	result = resultMultiply(first, second);
        	break;
        default:
            System.out.println("[Calculator] Invalid operator or no match");
		}
		return resultShow(result);
	}

	public static double resultPlus(double first, double second) {
		double calculation = first + second;
		return calculation;
	}
	
	public static double resultSubtract(double first, double second) {
		double calculation = first - second;
		return calculation;
	}
	public static double resultDivide(double first, double second) {
		double calculation = first / second;
		return calculation;
	}
	public static double resultMultiply(double first, double second) {
		double calculation = first * second;
		return calculation;
	}
}
