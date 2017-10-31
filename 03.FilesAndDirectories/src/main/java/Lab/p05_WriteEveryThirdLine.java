package Lab;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class p05_WriteEveryThirdLine
{

    public static void main(String[] args)
    {

        String input = "resources/input.txt";
        String output = "resources/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(input));
                        PrintWriter writter = new PrintWriter(output))
        {
            String line = reader.readLine();
            int counter = 1;
            while (line != null)
            {
                if (counter % 3 == 0)
                {
                    writter.println(line);
                }

                line = reader.readLine();
                counter++;
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}



