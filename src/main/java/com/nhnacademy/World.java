package com.nhnacademy;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class World extends JPanel {
    List<Regionable> objectList;

    public World() {
        objectList = new LinkedList<>();
    }

    public void add(Regionable object) {
        objectList.add(object);
    }

    public void remove(Regionable object) {
        objectList.remove(object);
    }

    public void remove(int index) {
        objectList.remove(index);
    }

    public int getCount() {
        return objectList.size();
    }

    public Regionable get(int index) {
        return objectList.get(index);
    }

    @Override
    public void paint(Graphics graphics) {
        for (int i = 0; i < getCount(); i++) {
            Regionable object = get(i);

            if (object instanceof Paintable) {
                ((Paintable) object).paint(graphics);
            }
        }
    }

}
