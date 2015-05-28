//For a little more trip in your life

package me.briandubois.circlePong;

/**
 * Created by 328838 on 5/18/2015.
 */
public class ChangeBall extends Ball {

    int level;
    public ChangeBall(int x, int y, int rad, int level) {
        super(x, y, rad, level);
        this.level = level;
    }

    public ChangeBall(int x, int y, int rad, int move, int level) {
        super(x, y, rad, move, level);
        this.level = level;
    }

    public ChangeBall(int x, int y, int rad, int xm, int ym, int level) {
        super(x, y, rad, xm, ym, level);
        this.level = level;
    }

    @Override
    public void move(){
        if (getTop()+ yMove < 0 || getBottom()+ yMove > CPongGame.HEIGHT) {
            yMove *= -1;
            if (level < 4) {
                color = CHierarchy.getHierarchy(level + 1);
                level++;
            }
        }

        if (getLeftSide() + xMove < 0 || getRgihtSide() + xMove > CPongGame.WIDTH) {
            xMove *= -1;
            if(level < 4) {
                color = CHierarchy.getHierarchy(level + 1);
                level++;
            }
        }
        x += xMove;
        y += yMove;
    }
}
