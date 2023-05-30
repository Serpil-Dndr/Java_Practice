package mockInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question01 {

    public static void main(String[] args) {

        /* Descending orders your
        elements
        Before sorting: [5, 2, 8, 1, 6]
        After sorting: [8, 6, 5, 2, 1]

        * */

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);
        System.out.println("Before sorting: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("After sorting: " + numbers);
    }


}
