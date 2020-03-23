package point;

public class Point2D {
    private float xPos = 0;
    private float yPos = 0;

    public Point2D() {
    }

    public Point2D(float xPos, float yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public float getXPos() {
        return this.xPos;
    }

    public float getYPos() {
        return this.yPos;
    }

    public void setXPos(float xPos) {
        this.xPos = xPos;
    }

    public void setYPos(float yPos) {
        this.yPos = yPos;
    }

    public float[] getXYPos() {
        float[] arrPoints = new float[2];
        arrPoints[0] = this.xPos;
        arrPoints[1] = this.yPos;
        return arrPoints;
    }

    public void setXYPos(float xPos, float yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "a point 2d with x = " + this.xPos + " ; y = " + this.yPos;
    }
}
