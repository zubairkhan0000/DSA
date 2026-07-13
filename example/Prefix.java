import java.util.Stack;

public class Prefix {
    public static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    public static int getPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static String infixToPrefix(String infixExpression) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        String reversedInfix = new StringBuilder(infixExpression).reverse().toString();

        for (char ch : reversedInfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                prefix.append(ch);
            } else if (ch == ')') {
                operatorStack.push(ch);
            } else if (ch == '(') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != ')') {
                    prefix.append(operatorStack.pop());
                }
                operatorStack.pop();
            } else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() && getPrecedence(ch) < getPrecedence(operatorStack.peek())) {
                    prefix.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }
        }

        while (!operatorStack.isEmpty()) {
            prefix.append(operatorStack.pop());
        }

        return prefix.reverse().toString();
    }

    public static void main(String[] args) {
        String out = infixToPrefix("A+B-C/D");
        System.out.println("Prefix Expression: " + out);
    }
    

}
