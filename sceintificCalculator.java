package zsm.concole.calculator;

import java.util.Scanner;

class SceintificCalculator {

    void mainScientificCalculator() {
        int option = 0;
        double numOne = 0, numTwo = 0, result = 0, rad = 0;
        String Str = "", input = "";
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Choose any scientific manipulation");
            System.out.printf("%-25s %-25s %-25s %-25s %-25s\n"," 1. %"," 2.1/x"," 3.sqrt of x"," 4.cube root of x"," 5.n!");
            System.out.printf("%-25s %-25s %-25s %-25s %-25s\n"," 6.x^y"," 7.2^x"," 8.10^x"," 9.x^2"," 10.x^3");
            System.out.printf("%-25s %-25s %-25s %-25s %-25s\n","11.Decimal to Binary","12.Binary to Decimal","13.Decimal to Octal","14.Octal to Decimal","15.Binary to Hexadecimal");
            System.out.printf("%-25s %-25s %-25s %-25s %-25s\n","16.Hexadecimal to Binary","17.sin","18.cos","19.tan","20.exponential");
            System.out.printf("%-25s %-25s %-25s %-25s %-25s\n","21.log","22.log10","23.Radians to Degree","24.Degree to Radian","25.Quit");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the 2 numbers to find percentage,say 25% of 100,here x=25 and y=100");
                    numOne = scan.nextInt();
                    numTwo = scan.nextInt();
                    result = numTwo * (numOne / 100);
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("x?");
                    numOne = scan.nextInt();
                    result = 1 / numOne;
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("x?");
                    numOne = scan.nextInt();
                    result = Math.sqrt(numOne);
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("x?");
                    numOne = scan.nextInt();
                    result = Math.cbrt(numOne);
                    System.out.println(result);
                    break;
                case 5:
                    System.out.println("n?");
                    numOne = scan.nextInt();
                    result = factorial(numOne);
                    System.out.println(result);
                    break;
                case 6:
                    System.out.println("Enter x and y");
                    numOne = scan.nextInt();
                    numTwo = scan.nextInt();
                    result = Math.pow(numOne, numTwo);
                    System.out.println(result);
                    break;
                case 7:
                    System.out.println("x?");
                    numOne = scan.nextInt();
                    result = Math.pow(2, numOne);
                    System.out.println(result);
                    break;
                case 8:
                    System.out.println("x?");
                    numOne = scan.nextInt();
                    result = Math.pow(10, numOne);
                    System.out.println(result);
                    break;
                case 9:
                    System.out.println("x?");
                    numOne = scan.nextInt();
                    result = Math.pow(numOne, 2);
                    System.out.println(result);
                    break;
                case 10:
                    System.out.println("x?");
                    numOne = scan.nextInt();
                    result = Math.pow(numOne, 3);
                    System.out.println(result);
                    break;
                case 11:
                    System.out.println("Enter the number");
                    int dec = scan.nextInt();
                    Str = Integer.toBinaryString(dec);
                    System.out.println(Str);
                    break;
                case 12:
                    System.out.println("Enter the binary number");
                    input = scan.next();
                    result = Integer.parseInt(input, 2);
                    System.out.println(result);
                    break;
                case 13:
                    System.out.println("Enter the number");
                    dec = scan.nextInt();
                    Str = Integer.toOctalString(dec);
                    System.out.println(Str);
                    break;
                case 14:
                    System.out.println("Enter the Octal number");
                    input = scan.next();
                    result = Integer.parseInt(input, 8);
                    System.out.println(result);
                    break;
                case 15:
                    System.out.println("Enter the number");
                    dec = scan.nextInt();
                    Str = Integer.toHexString(dec);
                    System.out.println(Str);
                    break;
                case 16:
                    System.out.println("Enter the Hexadecimal number");
                    input = scan.next();
                    result = Integer.parseInt(input, 16);
                    System.out.println(result);
                    break;
                case 17:
                    System.out.println("Enter theta");
                    numOne = scan.nextInt();
                    result = Math.sin(numOne);
                    System.out.println(result);
                    break;
                case 18:
                    System.out.println("Enter theta");
                    numOne = scan.nextInt();
                    result = Math.cos(numOne);
                    System.out.println(result);
                    break;
                case 19:
                    System.out.println("Enter theta");
                    numOne = scan.nextInt();
                    result = Math.tan(numOne);
                    System.out.println(result);
                    break;
                case 20:
                    System.out.println("Enter the number");
                    numOne = scan.nextInt();
                    result = Math.exp(numOne);
                    System.out.println(result);
                    break;
                case 21:
                    System.out.println("Enter the number");
                    numOne = scan.nextInt();
                    result = Math.log(numOne);
                    System.out.println(result);
                    break;
                case 22:
                    System.out.println("Enter the number");
                    numOne = scan.nextInt();
                    result = Math.log10(numOne);
                    System.out.println(result);
                    break;
                case 23:
                    System.out.println("Enter Radian Angle");
                    rad = scan.nextDouble();
                    result = Math.toDegrees(rad);
                    System.out.println(result);
                    break;
                case 24:
                    System.out.println("Enter the number");
                    numOne = scan.nextInt();
                    result = Math.toRadians(numOne);
                    System.out.println(result);
                    break;
                case 25:
                    break;

                default:
                    System.out.println("Enter the valid option");
            }
        } while (option != 25);
    }
    private double factorial(double numOne) {
        double n = numOne;
        double fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}
