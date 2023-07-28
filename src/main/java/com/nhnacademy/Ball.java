package com.nhnacademy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Ball {
    private Point location;
    private int radius;
    private Color color;

    // 생성자
    public Ball(Point location, int radius, Color color) {
        this.location.setLocation(location);
        this.radius = radius;
        this.color = color;
    }

    public Ball(Point location, int radius) {
        this(location, radius, Color.BLUE);
    }

    public void setLocation(Point location) {
        this.location.setLocation(location);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getLocation() {
        return location.getLocation();
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public void paint(Graphics graphics) {
        graphics.fillOval((int) location.getX() - radius, (int) location.getY() - radius, radius * 2, radius * 2);
    }

}
