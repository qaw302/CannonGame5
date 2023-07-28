package com.nhnacademy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Ball implements Regionable, Paintable {
    private Rectangle region;
    private Point location;
    private int radius;
    private Color color;

    // 생성자
    public Ball(Point location, int radius, Color color) {
        this.location = location;
        this.radius = radius;
        this.color = color;
        region = new Rectangle((int) location.getX() - radius, (int) location.getY() - radius, radius * 2, radius * 2);
    }

    public Ball(Point location, int radius) {
        this(location, radius, Color.BLUE);
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getLocation() {
        return location;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public Rectangle getRegeion() {
        return region;
    }

    @Override
    public void paint(Graphics graphics) {
        Color oldColor = graphics.getColor();
        graphics.setColor(getColor());
        graphics.fillOval((int) location.getX() - radius, (int) location.getY() - radius, radius * 2, radius * 2);
        graphics.setColor(oldColor);
    }

}
