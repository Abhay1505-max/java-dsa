/*
Remove all occurrences of a specific character ('a') from a string using recursion
create a recursive function that takes a string as input and returns a new string after removing all 'a' characters.
🔹 Method Used

We use:
Recursion → function calls itself
String processing using:
charAt()
substring()

Algorithm
Base Case
If the string is empty → return empty string ""
Recursive Case
Take first character ch
If ch == 'a'
Skip it → call function on remaining string
Else
Keep it → add to result + recursive call
*/

class skipChar {
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skip("abhabhaahhh"));
    }
}
