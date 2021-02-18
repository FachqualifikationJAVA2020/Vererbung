package de.thunderfrog;

public class PointTest {
    public static void main(String[] args) {
        // Start 2D
        Point2D point2D = new Point2D(0.0f,0.0f);

        // Neue Werte setzten
        point2D.setX(4.8f);
        point2D.setY(7.2f);

        // Ausgabe
        System.out.println(point2D.toString());

        // Start 3D
        Point3D point3D = new Point3D(0.0f,0.0f,0.0f);

        // Neue Werte setzten
        point3D.setXYZ(1.5f,7.3f,4.8f);

        // Ausgabe
        System.out.println(point3D.toString());


    }
}
