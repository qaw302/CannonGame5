package com.nhnacademy;

import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JFrame;

public class WorldTest {
    static final Color DEFAULT_COLOR = Color.BLUE;
    static final int MIN_X = 0;
    static final int MAX_X = 500;
    static final int MIN_Y = 0;
    static final int MAX_Y = 300;
    static final int MIN_RADIUS = 10;
    static final int MAX_RADIUS = 50;

    public static void main(String[] args) {
        final Random random = new Random();

        JFrame frame = new JFrame("World");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(1000, 800);

        World world = new World();
        frame.add(world);
        frame.setVisible(true);

        int radius = MIN_RADIUS + random.nextInt(MAX_RADIUS - MIN_RADIUS);
        Point location = new Point(MIN_X + random.nextInt(MAX_X - MIN_X),
                MIN_Y + random.nextInt(MAX_Y - MIN_Y));

        Ball ball = new Ball(location, radius);

        world.add(ball);

    }

    // @RepeatedTest(10)
    // public void defaultConstructor() {
    // final Color DEFAULT_COLOR = Color.BLUE;
    // final int MIN_X = 0;
    // final int MAX_X = 500;
    // final int MIN_Y = 0;
    // final int MAX_Y = 300;
    // final int MIN_RADIUS = 10;
    // final int MAX_RADIUS = 50;

    // JFrame frame = new JFrame("World");
    // frame.setSize(1000, 800);

    // World world = new World();
    // frame.add(world);
    // frame.setVisible(true);

    // int radius = MIN_RADIUS + random.nextInt(MAX_RADIUS - MIN_RADIUS);
    // Point location = new Point(MIN_X + random.nextInt(MAX_X - MIN_X),
    // MIN_Y + random.nextInt(MAX_Y - MIN_Y));

    // Ball ball = new Ball(location, radius);

    // world.add(ball);

    // assertEquals(location, ball.getLocation());
    // assertEquals(radius, ball.getRadius());
    // // assertEquals(Ball.DEFAULT_COLOR, ball.getColor());
    // }
}
