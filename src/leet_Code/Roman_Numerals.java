package leet_Code;

public class Roman_Numerals {
    //bu soruyu coz bi ara

    public static void main(String[] args) {


        System.out.println(romanToInt("V"));
    }

    public static int romanToInt(String s) {

        int result = 0;
        int prevValue = 0;

        // Traverse the input string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char symbol = s.charAt(i);
            int value;

            // Map each symbol to its corresponding value using a switch statement
            switch (symbol) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral: " + symbol);
            }

            // If the current value is smaller than the previous value,
            // it indicates subtraction. Subtract the current value from the result.
            if (value < prevValue) {
                result -= value;
            }
            // Otherwise, add the current value to the result.
            else {
                result += value;
            }

            // Update the previous value for the next iteration
            prevValue = value;
        }

        return result;
    }
}