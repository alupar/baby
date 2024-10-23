package org.example;

public class Point implements Movable {
    int x;
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void moveUp() {
        System.out.println("точка сдвинулась выше");
    }

    @Override
    public void moveDown() {
        System.out.println("точка сдвинулась ниже");
    }

    @Override
    public void moveLeft() {
        System.out.println("точка сдвинулась левее");
    }

    @Override
    public void moveRight() {
        System.out.println("точка сдвинулась правее");
    }
}
