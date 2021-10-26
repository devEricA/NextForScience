import java.util.*;
import java.io.*;


public class NextForScience
{
    public static void main(String [] args) throws IOException{

        //Reading in the file
        Scanner fileContents = new Scanner(new File("data.txt"));

        //Printing out each word in one line
        while(fileContents.hasNext())
        {
            System.out.println(fileContents.next());
        }
    }
}
