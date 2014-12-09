package me.briandubois.interfaces;

/**
 * Created by 328838 on 12/3/2014.
 */
public class MovablePoint implements Movable{
    private int x;
    private int y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y += 1;
    }

    @Override
    public void moveDown() {
        y -= 1;
    }

    @Override
    public void moveLeft() {
        x += 1;
    }

    @Override
    public void moveRight() {
        x -= 1;
    }

    public String toString() {
        return "Your point is at (" + x + "," + y + ")";
    }
}
