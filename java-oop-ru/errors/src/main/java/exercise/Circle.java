package exercise;

// BEGIN
public class Circle {
    private final int radius;

    public Circle(Point point, int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (this.radius < 0) {
            throw new NegativeRadiusException("SQUARE-001", "Square can't be less than 0.");
        }

        return Math.PI * (radius * radius);
    }
}
// END
