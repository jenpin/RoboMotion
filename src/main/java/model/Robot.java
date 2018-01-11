package model;


import utils.RoboConstants.DIRECTION;

public class Robot {

    private int xPosition = 0;
    private int yPosition = 0;
    private DIRECTION directionFacing;

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public DIRECTION getDirectionFacing() {
        return directionFacing;
    }

    public void setDirectionFacing(DIRECTION directionFacing) {
        this.directionFacing = directionFacing;
    }
}
