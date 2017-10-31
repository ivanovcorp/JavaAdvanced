package Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class p03_CopyBytes
{

    public static void main(String[] args)
    {

        String input = "resources/input.txt";
        String output = "resources/output.txt";

        try (InputStream fis = new FileInputStream(input);
                        OutputStream fos = new FileOutputStream(output))
        {
            int oneByte = fis.read();
            while (oneByte >= 0)
            {

                if (oneByte == ' ' || oneByte == '\n')
                {
                    fos.write(oneByte);
                }
                else
                {
                    String decimal = String.valueOf(oneByte);
                    for (char c : decimal.toCharArray())
                    {
                        fos.write(c);
                    }
                }

                oneByte = fis.read();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}



