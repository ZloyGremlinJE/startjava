public class Calculator {	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		char operation;
		operation ='+';
		if (operation == '+') {
			System.out.println (a + b);
		}
		if (operation == '-'){
			System.out.println(a-b);
		}
		if (operation == '/'){
			System.out.println(a/b);
		}
		if (operation == '*'){
			System.out.println(a*b);
		}
		if (operation == '^'){
			int result = 0;
			for(int i = 0; i < b; i++){
				result = result*a;
			}
			System.out.println(result);
		}
		if (operation == '%'){
			System.out.println(a%b);
		}
	}
}