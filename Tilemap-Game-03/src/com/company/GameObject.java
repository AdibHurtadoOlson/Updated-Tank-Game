package com.company;
import java.awt.*;

public class GameObject {
    public int x, y;
    private int width = 64;
    private int height = 64;

    public GameObject (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public Rectangle getBounds (int x, int y) {
        return new Rectangle(x, y, width, height);
    }
}
