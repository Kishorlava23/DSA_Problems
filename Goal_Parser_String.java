/* PROBLEM STATEMENT:
 * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", 
 * "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o",
 *  and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
 * 
 */

class Solution {
    public static String interpret(String command) {
        //StringBuider to add new string i.e our answer
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){

            // If our character is starting with 'G' then add 'G' to stringBuilder
            if(command.charAt(i)=='G') sb.append('G');

            //If our character is starting with '(' open bracket' then check whether the next element has a clone one i.e ')',
            //if it is true add 'o' to the string and increment i value because we want check for after the ')'
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                    i++;
                }
               //  If the current element is '(' and has next element 'a' then append "al" to the string and increment "i" by 3 times
                else{
                   sb.append("al");
                   i= i+3;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s="G()()()()(al)";
        System.out.println(interpret(s));
    }
}