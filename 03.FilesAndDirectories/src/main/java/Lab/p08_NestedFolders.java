package Lab;

import java.io.File;
import java.util.ArrayDeque;

public class p08_NestedFolders
{

    public static void main(String[] args)
    {

        File dir = new File("resources/Files-and-Streams");

        ArrayDeque<File> queue = new ArrayDeque<File>();
        queue.offer(dir);

        int counter = 1;
        while (!queue.isEmpty())
        {
            File currentDir = queue.poll();

            File[] nestedFiles = currentDir.listFiles();
            for (File file : nestedFiles)
            {
                if (file.isDirectory())
                {
                    queue.offer(file);
                    counter++;
                }
            }
            System.out.println(currentDir.getName());
        }
        System.out.println(counter + " folders");

    }

}



