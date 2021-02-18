package de.thunderfrog;

public class Point3D extends Point2D{

    // Private Variablen für die gesamte Klasse
    private float z = 0.0f;

    // Konstruktor mit Felder
    public Point3D(float x, float y, float z) {}

    // Default Konstruktor
    public Point3D() {}

    // Setter
    public void setZ(float z){
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    // Getter
    public float getZ(){
        return this.z;
    }

    public float[] getXYZ(){
        return new float[]{this.getX(),this.getY(),this.getZ()};
    }

    // toString
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + getZ() + ")";
    }
}
