package Lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class p09_SerializeCustomObject
{

    public static void main(String[] args)
    {

        File serObj = new File("resources/myObj.ser");

        Cube cube = new Cube("blue", 23.5, 11.2, 3.0);

        // Serialize
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(serObj));)
        {
            ous.writeObject(cube);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        // De-Serialize
        Cube loadedCube = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serObj)))
        {
            try
            {
                loadedCube = (Cube) ois.readObject();
            }
            catch (ClassNotFoundException e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(loadedCube.getColor() + " " + loadedCube.getWidth() + " " + loadedCube.getHeight() + " " + loadedCube.getDepth());
    }

}



