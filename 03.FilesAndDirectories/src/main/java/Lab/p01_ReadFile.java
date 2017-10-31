package Lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class p01_ReadFile
{

    public static void main(String[] args)
    {

        String input = "resources/input.txt";

        try (FileInputStream fis = new FileInputStream(input))
        {
            int oneByte = fis.read();
            while (oneByte >= 0)
            {
                System.out.println(Integer.toBinaryString(oneByte) + " ");
                oneByte = fis.read();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}



