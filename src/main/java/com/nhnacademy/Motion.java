package com.nhnacademy;

public class Motion {
    private int dx;
    private int dy;

    public Motion(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public static Motion createPosition(int dx, int dy) {
        return new Motion(dx, dy);
    }

    public static Motion createDisplacement(int magnitude, int theta) {
        return new Motion((int) (magnitude * Math.cos(Math.toRadians(theta))),
                (int) (magnitude * Math.sin(Math.toRadians(theta))));
        // Math.sqrt(Math.pow(dx, 2));
    }

    public int getDX() {
        return dx;
    }

    public int getDY() {
        return dy;
    }

    public int getMagnitude() {
        return (int) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

    }

    public int getTheta() {
        return (int) Math.toDegrees(Math.atan2(dy, dx));
    }

    public void add(Motion other) {
        dx += other.getDX();
        dy += other.getDY();
    }

}
