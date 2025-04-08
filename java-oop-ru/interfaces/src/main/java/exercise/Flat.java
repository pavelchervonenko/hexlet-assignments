package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        double resultArea = getArea();
        double resultAreaAnother = another.getArea();
        int flag = 0;

        if (resultAreaAnother < resultArea) {
            flag = 1;
        }

        if (resultAreaAnother > resultArea) {
            flag = -1;
        }

        return flag;
    }

    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
