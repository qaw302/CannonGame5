package com.nhnacademy;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class MotionTest {
    Random random = new Random();

    // @Test
    @RepeatedTest(100)
    public void createPosition() {
        final int DELTA_X = 100;
        final int DELTA_Y = 100;

        int dx = random.nextInt(DELTA_X);
        int dy = random.nextInt(DELTA_Y);

        Motion motion = Motion.createPosition(dx, dy);

        assertEquals(dx, motion.getDX());
        assertEquals(dy, motion.getDY());
    }

    @RepeatedTest(100)
    public void addMotion() {
        final int DELTA_X = 100;
        final int DELTA_Y = 100;

        int dx1 = random.nextInt(DELTA_X);
        int dy1 = random.nextInt(DELTA_X);

        int dx2 = random.nextInt(DELTA_X);
        int dy2 = random.nextInt(DELTA_Y);

        Motion motion1 = Motion.createPosition(dx1, dy1);
        Motion motion2 = Motion.createPosition(dx2, dy2);

        assertEquals(dx1 + (long) dx2, motion1.getDX());
        assertEquals(dy1 + (long) dy2, motion2.getDY());
    }

    @Test
    public void comparePositionDisplacement() {
        Motion motion = Motion.createPosition(30, 40);
    }

}
