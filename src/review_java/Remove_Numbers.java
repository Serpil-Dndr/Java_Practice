package review_java;

import java.util.ArrayList;
import java.util.List;

public class Remove_Numbers {
    public static void main(String[] args) {
List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);
        removeGreaterThan100(numbers);
        System.out.println(numbers);



    }
    public static List<Integer> removeGreaterThan100(List<Integer> numbers){
        numbers.removeIf(p -> p>100 );//p -> is a for loop


        return numbers;

    }
}
