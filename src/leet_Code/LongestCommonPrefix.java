package leet_Code;

public class LongestCommonPrefix {
/*
Write a function to find the longest common
prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */
public static void main(String[] args) {
    String str [] = {"flower", "flow","flight"};
   String str2 [] = {"dog","racecar","car"};
    System.out.println(longestCommonPrefix(str));
    System.out.println(longestCommonPrefix(str2));

}
    public static String longestCommonPrefix(String[] strs) {

   String prefix = strs[0];
     for (int i =0; i<strs.length; i++){
         while (!strs[i].startsWith(prefix)) {
             prefix = prefix.substring(0, prefix.length() - 1);
             if (prefix.isEmpty()) {
                 return "There is no common prefix among the input strings";
             }
         }
     }

        return prefix;
    }
}


