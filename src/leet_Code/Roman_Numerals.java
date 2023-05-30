package leet_Code;

public class Roman_Numerals {
    public static void main(String[] args) {


        System.out.println(romanToInt("V"));
    }

    public static int romanToInt(String s) {

        int result = 0;

        for (int i =  s.length();i>=0; i++) {

            int romanNum;
            try {
                switch (s.charAt(i)) {
                    case 'I':
                        romanNum = 1;
                        break;
                    case 'V':
                        romanNum = 5;
                        break;
                    case 3:
                        romanNum = 10;
                        break;
                    case 4:
                        romanNum = 50;
                        break;
                    case 5:
                        romanNum = 100;
                        break;
                    case 6:
                        romanNum = 500;
                        break;
                    case 7:
                        romanNum = 1000;
                        break;
                    default:
                        romanNum = 0;

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            if(4*romanNum< result) result-=romanNum;
           else result+=romanNum;
        }


        return result;
    }


}





