package zsm.concole.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.mainMenu();
    }

    private void mainMenu() {
        int option = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter your option \n 1.Standard Calculator \n 2.Scientific Calculator \n 3. Quit \n");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    standardCalculator std = new standardCalculator();
                    std.mainstandardcalculator();
                    break;
                case 2:
                    sceintificCalculator scientific = new sceintificCalculator();
                    scientific.mainscientificcalculator();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter the valid number");
            }
        } while (option != 3);
    }
}
