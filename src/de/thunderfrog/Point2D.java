package de.thunderfrog;

public class Point2D {
    // Private Variablen für die gesamte Klasse
    private float x = 0.0f;
    private float y = 0.0f;

    // Konstruktor mit Felder
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default Konstruktor
    public Point2D() {}

    // Setter
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    // Getter
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY() {
        return new float[]{ this.x, this.y};
    }

    // toString
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }
}
