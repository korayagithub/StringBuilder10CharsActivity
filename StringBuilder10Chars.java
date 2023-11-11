import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.err.println("Please enter an argument of not less than 10 characters.");
            System.exit(1);
        }
        else
        {
            StringBuilder strArgument1 = new StringBuilder (args[0]);
            int count = args[0].length();
            int indexA = args[0].indexOf('a');
            char firstChar = args[0].charAt(0);
            char lastChar = args[0].charAt(count-1);

            System.out.println("1. The length of the string is " + count + ".");
            System.out.println("2. First occurrence of the letter a is at index " + indexA + ".");
            System.out.println("3. The first character of the string is " + firstChar + ".");
            System.out.println("4. The last character of the string is " + lastChar + ".");
            System.out.println("5. The characters from index 3 to 6 are " + strArgument1.substring(3,7) + ".");

            strArgument1.append("123");
            //System.out.println("6. Append \"abc\" at the end: " +  strArgument1 + ".");

            strArgument1.insert(4, "xyz");
            //System.out.println("7. Insert \"xyz\" at index 4: " +  strArgument1 + ".");

            strArgument1.delete(2,5);
            //System.out.println("8. Delete index 2 to 4: " +  strArgument1 + ".");

            strArgument1.deleteCharAt(8);
            //System.out.println("9. Delete character at index 8: " + strArgument1 + ".");

            strArgument1.reverse();
            System.out.println("6. Reverse the string and print it: " + strArgument1 +".");
        }
    }
}
