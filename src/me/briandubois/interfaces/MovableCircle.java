package me.briandubois.interfaces;

/**
 * Created by 328838 on 12/3/2014.
 */
public class MovableCircle implements Movable {

    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int r){
        this.center = new MovablePoint(x, y);
        this.radius = r;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public String toString(){
        return center.toString() + ". Radius is: " + radius;
    }
}
