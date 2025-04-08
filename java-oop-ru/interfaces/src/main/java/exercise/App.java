package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List<Home> sortedList = new ArrayList<>(apartments);
        sortedList.sort(Comparator.comparingDouble(Home::getArea));

        List<String> result = new ArrayList<>();

        int count = 0;
        for (var apartment : sortedList) {
            if (count >= n) {
                break;
            }
            result.add(apartment.toString());
            count ++;
        }

        return result;
    }
}
// END
