package me.briandubois.circlePong;

/**
 * Created by 328838 on 5/18/2015.
 */
public class ChangeBall extends Ball {
    public ChangeBall(int x, int y, int rad, int level) {
        super(x, y, rad, level);
    }

    public ChangeBall(int x, int y, int rad, int move, int level) {
        super(x, y, rad, move, level);
    }

    public ChangeBall(int x, int y, int rad, int xm, int ym, int level) {
        super(x, y, rad, xm, ym, level);
    }
}
