package zsm.concole.calculator;

import java.util.Scanner;
import java.util.Stack;

class StandardCalculator {
    void mainStandardCalculator() {
        double result=0;
        System.out.println("Enter the expression");
        Scanner sc = new Scanner(System.in);
        String stringExpression = sc.nextLine();
        char[] element = stringExpression.toCharArray();
        Stack<Double> values = new Stack<Double>();
        Stack<Character> operators= new Stack<Character>();
        for (int index = 0; index < element.length; index++) {
            if (element[index] == ' ')
                continue;
            if (element[index] >= '0' && element[index] <= '9') {
                StringBuffer sbuf = new StringBuffer();
                // checking for number more than one digit
                while (index < element.length && element[index] >= '0' && element[index] <= '9')
                    sbuf.append(element[index++]);
                values.push((double) Integer.parseInt(sbuf.toString()));
                index--;//offsetting to correct index
            }
            else if (element[index] == '(')
                operators.push(element[index]);
            else if (element[index] == ')') {
                while (operators.peek() != '(')
                    values.push(evaluateExpression(operators.pop(),values.pop(),values.pop()));
                operators.pop();
            }
            else if (element[index] == '+' || element[index] == '-' || element[index] == '*' || element[index] == '/') {
                while (!operators.empty() && checkPrecedence(element[index],operators.peek()))
                    values.push(evaluateExpression(operators.pop(),values.pop(),values.pop()));
                operators.push(element[index]);
            }
        }
        while (!operators.empty())
            values.push(evaluateExpression(operators.pop(),values.pop(),values.pop()));
        result=values.pop();
        System.out.println(result);
    }

    public static boolean checkPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    public static double evaluateExpression(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if(b==0){
                try {
                    return a / b;
                }
                catch(ArithmeticException e) {
                    System.out.println("Can't divide by zero");

                }
                }
                else
                return a / b;
        }
        return 0;
    }
}
