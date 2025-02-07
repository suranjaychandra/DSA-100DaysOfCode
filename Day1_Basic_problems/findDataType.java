// question link : https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type
import java.util.*;

class findDataType {
    // Method to get the size of data types
    static int dataTypeSize(String str) {
        if (str.equals("Character"))
            return 1;
        else if (str.equals("Integer"))
            return 4;
        else if (str.equals("Long"))
            return 8;
        else if (str.equals("Float"))
            return 4;
        else if (str.equals("Double"))
            return 8;
        else
            return -1; // Return -1 for invalid input
    }

    public static void main(String args[]) {  
        Scanner cs = new Scanner(System.in); // Initialize Scanner
        String input = cs.nextLine(); // Read the input string
        cs.close(); // Close the scanner

        int size = dataTypeSize(input); // Get the size of the input data type
        System.out.println(size); //  Print the correct output
    }
}
