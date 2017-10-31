package Lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class p06_SortLines
{

    public static void main(String[] args)
    {

        String input = "resources/input.txt";
        String output = "resources/output.txt";


        Path pathIn = Paths.get(input);
        Path pathout = Paths.get(output);

        try
        {
            List<String> lines = Files.readAllLines(pathIn);
            Collections.sort(lines);
            Files.write(pathout, lines);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }

}



