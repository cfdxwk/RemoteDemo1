import java.util.Scanner;

public class Function_Calculator {

	public static void main(String args[]) {
		int num1, num2, result;
		num1 = num2 = result = 0;

		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();

		num2 = sc.nextInt();
		
		int menu;
		menu = sc.nextInt();
		switch(menu){
		case 1:
			result = add(num1,num2);
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case 2:
			result = sub(num1,num2);
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case 3:
			result = multiply(num1,num2);
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		default:
			System.out.println("Nothing to do");
		}
		
		//result = add(num1, num2);
		//System.out.println(num1 + " + " + num2 + " = " + result);

	}

	static int add(int x, int y) {
		return x + y;
	}

	static int sub(int x, int y) {
		return x - y;
	}

	static int multiply(int x, int y) {
		return x * y;
	}

}
