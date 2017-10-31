package Lab;

import java.io.File;

public class p07_ListFiles
{

    public static void main(String[] args)
    {

        File dir = new File("resources/Files-and-Streams");

        File[] files = dir.listFiles();
        for (File file : files)
        {
            if (!file.isDirectory())
                System.out.println(file.getName() + ": [" + file.length() + "]");
        }
    }

}



