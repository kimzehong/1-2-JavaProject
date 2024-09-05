package chp07.ex11;

public class Cylinder {
    private int radius, height;

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double getvolume() {
        return radius * radius * Math.PI * height;
    }

    double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double rectangleArea = height * 2 * radius * Math.PI;

        return 2 * circleArea + rectangleArea;
    }


}
