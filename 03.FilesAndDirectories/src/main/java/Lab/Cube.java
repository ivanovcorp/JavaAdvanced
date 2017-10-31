package Lab;

import java.io.Serializable;

public class Cube implements Serializable
{
    private String color;
    private double width;
    private double height;
    private double depth;

    public Cube(String color, double width, double height, double depth)
    {
        this.color = color;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getColor()
    {
        return color;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getDepth()
    {
        return depth;
    }
}
