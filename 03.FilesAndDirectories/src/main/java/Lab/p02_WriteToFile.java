/*
 * p02_WriteToFile.java
 *
 * created at 2017-10-31 by iv.ivanov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class p02_WriteToFile
{

    public static void main(String[] args)
    {
        String input = "resources/input.txt";
        String output = "resources/output.txt";

        ArrayList<Character> excludeChars = new ArrayList<Character>();
        Collections.addAll(excludeChars, ',', '.', '!', '?');
        try (FileInputStream fis = new FileInputStream(input);
             FileOutputStream fos = new FileOutputStream(output))
        {
            int oneByte = fis.read();
            while (oneByte >= 0)
            {
                if (!excludeChars.contains((char)oneByte))
                {
                    fos.write(oneByte);
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



