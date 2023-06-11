package Practice_Java;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(3));

    }
    public static int calculateFactorial(int num){
        int facNum= 1;
        for (int i= num;i>0 ; i--){
            System.out.println("i: " +i);
            facNum*=i;
            System.out.println("Factorial:" + facNum);

        }

        return num;
    }



}
