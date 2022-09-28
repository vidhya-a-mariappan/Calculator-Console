package zsm.concole.calculator;

import java.util.Scanner;
import java.util.Stack;

class standardCalculator {
    void mainstandardcalculator() {
        double result=0;
        System.out.println("Enter the expression");
        Scanner sc = new Scanner(System.in);
        String StrExp = sc.nextLine();
        char[] tokens = StrExp.toCharArray();
        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> operators= new Stack<Character>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ')
                continue;
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();
                // checking for number more than one digit
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.toString()));
                i--;//offsetting to correct index
            }
            else if (tokens[i] == '(')
                operators.push(tokens[i]);
            else if (tokens[i] == ')') {
                while (operators.peek() != '(')
                    values.push(evaluateExp(operators.pop(),values.pop(),values.pop()));
                operators.pop();
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                while (!operators.empty() && checkprecedence(tokens[i],operators.peek()))
                    values.push(evaluateExp(operators.pop(),values.pop(),values.pop()));
                operators.push(tokens[i]);
            }
        }
        while (!operators.empty())
            values.push(evaluateExp(operators.pop(),values.pop(),values.pop()));
        result=values.pop();
        System.out.println(result);
    }

    public static boolean checkprecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    public static int evaluateExp(char op,int b, int a) {
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
