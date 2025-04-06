package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point calculateMidPoint() {
        // Также можно сделать сразу проверку на то, что точки одинаковые
        // Но и без этого программа сработает
        int beginX = beginPoint.getX();
        int endX = endPoint.getX();

        int beginY = beginPoint.getY();
        int endY = endPoint.getY();

        // Если старт правее конца -> swap значений
        if (beginX > endX) {
            int tempX = beginX;
            beginX = endX;
            endX = tempX;
        }

        if (beginY > endY) {
            int tempY = beginY;
            beginY = endY;
            endY = tempY;
        }

        // Исходя из тестов, а также в классе Point точки целочисленного типа
        // И кастить тут, неверное, ничего не надо -> середина - целочисленная
        int midX  = ((endX - beginX) / 2) + beginX;
        int midY  = ((endY - beginY) / 2) + beginY;

        return new Point(midX, midY);
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        Point midPoint =  calculateMidPoint();
        return midPoint;
    }
}
// END
