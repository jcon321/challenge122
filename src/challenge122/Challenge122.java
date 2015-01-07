package challenge122;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge122 {

//    Sample Input
//    31337
//    Sample Output
//    8, because 3+1+3+3+7=17 and 1+7=8
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int theHash;

        System.out.println("Enter a number > 9 to hash");
        theHash = in.nextInt();

        while (theHash > 9) {
            theHash = theHash(theHash);
        }

        System.out.println("The hash = " + theHash);
    }

    private static int theHash(int number) {
        int result = 0;
        String theNumberString;
        List<String> numArray = new ArrayList<>();
        
        //convert the number to string to grab individual numbers
        theNumberString = Integer.toString(number);

        //convert the string to a char array
        for (int x = 0; x < theNumberString.length(); x++) {
            numArray.add(Character.toString(theNumberString.charAt(x)));
        }

        //add the individual numbers up
        for (int x = 0; x < numArray.size(); x++) {
            result += Integer.parseInt(numArray.get(x));
        }
        return (result);
    }
}
