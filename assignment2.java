/**
 * The Assignment2 class includes a method that will take the varible known as
 * number and look
 * for the value assigned to the variable in the the Fibonacci Sequence.
 */
public class assignment2 {

    /**
     * Calculates the term we are looking for in the sequence.
     * 
     * @param number which is the position in the sequence we are looking for
     * @return The nth term in the sequence
     */
    public static int retrieve(int number) {
        if (number <= 0) {
            return -1;
        } else if (number == 1) {
            return 0;
        } else if (number == 2) {
            return 1;
        } else {
            return retrieve(number - 1) + retrieve(number - 2);
        }
    }

    /**
     * Main contains the previous method as well as the term which we are looking
     * for in the sequence.
     * It also includes the result.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int number = 10;
        int result = retrieve(number);
        System.out.println("The " + number + "th term in the Fibonacci sequence is: " + result);
    }
}