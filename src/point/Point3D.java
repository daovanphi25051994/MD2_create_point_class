package point;

public class Point3D extends Point2D {
    private float zPos = 0;

    public Point3D() {
    }

    public Point3D(float zPos) {
        this.zPos = zPos;
    }

    public Point3D(float xPos, float yPos, float zPos) {
        super(xPos, yPos);
        this.zPos = zPos;
    }

    public float getZPos() {
        return this.zPos;
    }

    public void setZPos(float zPos) {
        this.zPos = zPos;
    }

    public float[] getXYZPos() {
        float[] arrPoints = new float[3];
        arrPoints[0] = super.getXPos();
        arrPoints[1] = super.getYPos();
        arrPoints[2] = this.getZPos();
        return arrPoints;
    }

    public void setXYZPos(float xPos, float yPos, float zPos) {
        super.setXYPos(xPos, yPos);
        this.zPos = zPos;
    }

    @Override
    public String toString() {
        return "a point 3d with : " + super.toString() + " z = " + this.zPos;
    }
}
