import java.util.Scanner;

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
    
    public static int mod(int a, int b) {
        return a % b;
    }
    
    public static double fact(double a) {
        if (a <= 1) {
            return 1;
        }

        return fact(a - 1) * a;
    }

    public static double power(double a, double b) {
        if (b == 0) return 1;
        return a * power(a, b-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0;
        double num = 0;
        char ch = ' ';

        while (ch != '#') {
            System.out.println("Menu : \nEnter + for addition\nEnter - for subtraction\nEnter * for multiplication\nEnter / for division\nEnter % for modulus\nEnter ! for factorial\n" +
                            "Enter ^ for power\nEnter # for exit\n");
            System.out.println("Enter your choice ");
            ch = sc.next().charAt(0);

            if (ch == '!') {
                System.out.println("Enter a number to find factorial ");
                num = sc.nextDouble();
            } else if (ch != '#') {
                System.out.println("Enter value of num1 and num2 respectively ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            }

            switch (ch) {
                case '+':
                    System.out.println("Addtion of " + num1 + " and " + num2 + " is " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub(num1, num2));
                    break;
                case '*':
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multiply(num1, num2));
                    break;
                case '/':
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + div(num1, num2));
                    break;
                case '%':
                    System.out.println("Modulus of " + num1 + " and " + num2 + " is " + mod(num1, num2));
                    break;
                case '!':
                    System.out.println("Factorial of " + num + " is " + fact(num));
                    break;
                case '#':
                    System.out.println("Exiting the calculator.");
                    break;
                case '^':
                    System.out.println("Power of " + num1 + " rasised to " + num2 + " is " + power(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operator.");
                    break;
            }
        }

        sc.close();
    }
}