package pack;

public class Muldiv {

	public static void main(String[] args) {
		int a = 10;
        int b = 3;

        System.out.println("Multiplication of " + a + " and " + b + " is: " + multiply(a, b));
        System.out.println("Division of " + a + " by " + b + " is: " + divide(a, b));
    }

    // Multiplication without using the * operator
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        if (b < 0) {
            return -multiply(a, -b); //handle negative b
        }

        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    // Division without using the / operator
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (a == 0) {
            return 0;
        }
        if (b < 0) {
            return -divide(a, -b); //handle negative b
        }
        if (a < 0)
        {
            return -divide(-a,b);
        }

        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        return count;
		// TODO Auto-generated method stub

	}

}
