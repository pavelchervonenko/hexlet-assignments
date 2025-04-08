package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount ;

    public Cottage(double area, int flootCount) {
        this.area = area;
        this.floorCount  = flootCount;
    }

    public String toString() {
        String text = floorCount  + " этажный коттедж площадью " + area + " метров";
        return text;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        double currentAreaAnother = another.getArea();
        double currentArea = getArea();
        int flag = 0;

        if (currentAreaAnother < currentArea) {
            flag = 1;
        }

        if (currentAreaAnother > currentArea) {
            flag = -1;
        }

        return flag;
    }
}
// END
