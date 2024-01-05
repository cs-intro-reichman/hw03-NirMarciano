/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {

        String newStr = "";
        char c;

        for(int i = 0; i < s.length(); i++) {
            c =(char)(s.charAt(i));
            if(c == ' ')
                newStr = newStr + " ";
                else if(newStr.indexOf(c) == -1)
                    newStr = newStr + (char)(s.charAt(i));
        }

        return newStr;
    }
}
