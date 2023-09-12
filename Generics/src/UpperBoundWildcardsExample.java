import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcardsExample {
    public static double upperBoundProcessMethod(List<? extends Number> listObjChildClassOfNumberClass) {
        double sum = 0;
        for (Number n : listObjChildClassOfNumberClass) {
            sum += n.doubleValue();
        }
        return sum;

    }

    public static void main(String[] args) {
        List<Integer> listIntChild = new ArrayList<>();
        listIntChild.add(100);
        listIntChild.add(500);
        listIntChild.add(300);

        upperBoundProcessMethod(listIntChild);
        System.out.println("Sum of Integer value:  "+ upperBoundProcessMethod(listIntChild));

        List<Double> listDoubleChild = new ArrayList<>();
        listDoubleChild.add(10.50);
        listDoubleChild.add(500.76);
        listDoubleChild.add(300.0);


        System.out.println("Sum of double value:  " +upperBoundProcessMethod(listDoubleChild));

    }
}

