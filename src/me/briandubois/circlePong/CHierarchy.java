package me.briandubois.circlePong;

import java.awt.*;

/**
 * Created by 328838 on 5/18/2015.
 */
public enum CHierarchy {

    GREEN(0, Color.GREEN),
    YELLOW(1, Color.YELLOW),
    ORANGE(2, new Color(255,69,0)),
    RED(3, Color.RED),
    PURPLE(4, new Color(138,43,226));

    int index;
    Color color;

    CHierarchy(int index, Color color){
        this.index = index;
        this.color = color;

    }

    public int getIndex(){
        return this.index;
    }

    public CHierarchy getColorLower(CHierarchy color){

        return this.getHierarchy(color.getIndex() - 1);

    }

    public static CHierarchy getHierarchy(int index){

        switch (index){

            case 0:
                return GREEN;
            case 1:
                return YELLOW;
            case 2:
                return ORANGE;
            case 3:
                return RED;
            case 4:
                return PURPLE;
            default:
                return null;

        }

    }

}
