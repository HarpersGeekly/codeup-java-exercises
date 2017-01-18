import java.text.DecimalFormat;

/**
 * Created by RyanHarper on 1/17/17.
 */
public class Circle {
    private double radius;
    public static int numberOfCirclesTheUserBuilt;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCirclesTheUserBuilt++;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }

    public String formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(number);
    }

    public String getFormattedCircumference() {
        return formatNumber(getCircumference());
    }

    public String getFormattedArea() {
        return formatNumber(getArea());
    }
}
