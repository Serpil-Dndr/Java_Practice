package review_java;

public class Question01_arrays {
    public static void main(String[] args) {
//        Get any number of integers from the user by using Scanner.
//                Store the input values in an integer array.
//                Sort the list of numbers from least to greatest.
//        Print the new array out.

    }

    public static class Question02_arrays {

    //    without using the Arrays.sort method, sort an array by creating your own method
    //    an integer array
        //from least to greatest number
    public static void main(String[] args) {
       int [] arr = new int []{4,34,2,6,9,11,13,1};
       int index = -1;
       for( int i=0 ; i< arr.length; i ++){
         index=i;
         for(int j = i;j<= arr.length-1;j++){
             if (arr[j]<arr[index]){
                 index=j;
             }
         }
         int temp = arr[i];
         arr[i]=arr[index];
         arr[index]=temp;

        }
       for (int i =0; i<arr.length;i++){
           System.out.print(arr[i]+",");
       }
        }
    }
}
