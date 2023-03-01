import java.util.Stack;
import java.util.Scanner;

/**
 * A class to utilize a bubble sort algorithm on a Stack list.
 * 
 * @author Bryce Beuerlein
 * @version 2.0
 * @since 2/19/2023
 */
public class IntSorterStack {
    /**
     * Main method of the class that receives integer input and adds to a Stack
     * in order from smallest to largest.
     * 
     * @param args default parameter that is not used
     * @since 2/19/2023
     */
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        Scanner inputObj = new Scanner(System.in);
        int inputNumber = 0;

        System.out.println("Provide an integer and it will be put in a Stack");
        System.out.println("which will then be sorted.");
        System.out.println("To quite, enter an negative number.");
        System.out.println("");

        do {
            System.out.print("Enter an integer: ");
            inputNumber = inputObj.nextInt();
            if (inputNumber >= 0) {
                orderedAdd(intStack, inputNumber);
            }
            System.out.println("The current stack is: ");
            System.out.println(intStack);

        } while (inputNumber >= 0);

        inputObj.close();

    }

    /**
     * orderedAdd takes a value and adds it into the provided Stack.
     * 
     * @param stack      Stack of integers to add the value to.
     * @param valueToAdd The integer to be added to the stack.
     * @since 2/12/2023
     */
    public static void orderedAdd(Stack<Integer> stack, int valueToAdd) {

        Stack<Integer> tempStack = new Stack<>();

        if (stack.isEmpty()) {
            stack.push(valueToAdd);
        } else {
            while (!stack.isEmpty()) {
                if (stack.peek() <= valueToAdd) {
                    tempStack.push(valueToAdd);
                    break;
                } else {
                    tempStack.push(stack.pop());
                }
            }
            if (stack.isEmpty()) {
                tempStack.push(valueToAdd);
            }

            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }
    }
}