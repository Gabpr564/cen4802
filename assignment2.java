public class assignment2 {
    public static int retrieve(int number){
        if(number <= 0){
            return -1;
        } else if(number == 1){
            return 0;
        } else if(number == 2){
            return 1;
        } else {
            return retrieve(number - 1) + retrieve(number - 2);
        }
    }

    public static void main(String[] args){
        int number = 10;
        int result = retrieve(number);
        System.out.println("The "+ number +"th term in the Fibonacci sequence is: " + result);
    }
}