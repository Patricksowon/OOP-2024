package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

    LifeBoard lifeboard;
    
    public void setup()
    {
        lifeboard = new LifeBoard(50, 50, this);
        lifeboard.randomize();    
        background(0);
    }

    public void settings()
    {
        size(500, 500);
    }

    public void draw()
    {
        lifeboard.update();
        lifeboard.render();
    }
}
