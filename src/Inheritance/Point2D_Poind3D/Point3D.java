package Inheritance.Point2D_Poind3D;

import java.util.Arrays;

public class Point3D extends Point2D {

    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] getXY = super.getXY();
        float[] arr = new float[3];
        System.arraycopy(getXY, 0, arr, 0, getXY.length);
        arr[2] = this.z;
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
