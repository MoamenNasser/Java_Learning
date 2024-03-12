package MO;

import java.awt.*;

public abstract class Circle extends Shape {

    public double getarea()
    {
        int radius = 5;
        return Math.PI * Math.pow(radius, 2);
    }

}
