package edu.uoc.ds.adt;

public class SpiralGenerator {

    public static Point[] generate(double a, double b, double thetaMax, double step) {
        int n = (int) Math.floor(thetaMax / step) + 1;
        Point[] points = new Point[n];

        double theta = 0;
        for (int i = 0; i < n; i++) {
            // Ecuación polar: r = a + b * theta
            double r = a + b * theta;

            // Convertimos a coordenadas cartesianas
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);

            // Creamos el punto y lo añadimos al array
            points[i] = new Point(x, y);

            // Incrementamos el ángulo para el siguiente punto
            theta += step;
        }

        return points;
    }
}