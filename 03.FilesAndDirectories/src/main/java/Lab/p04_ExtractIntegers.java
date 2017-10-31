package Lab;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class p04_ExtractIntegers
{

    public static void main(String[] args)
    {

        String input = "resources/input.txt";
        String output = "resources/output.txt";

        try (Scanner sc = new Scanner(new FileInputStream(input));
                        PrintWriter pr = new PrintWriter(output))
        {
            while (sc.hasNext())
            {
                if (sc.hasNextInt())
                {
                    pr.println(sc.nextInt());
                }
                sc.next();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}



