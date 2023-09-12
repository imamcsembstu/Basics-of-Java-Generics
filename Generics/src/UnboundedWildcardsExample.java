import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardsExample {
    public static void unboundedWildcardsProcessMethod(List<?>variousTypeListObj){//Only ? means any type
                                                                                 // of listObj are accepted.
        for (Object o : variousTypeListObj) {
            System.out.println(o);
        }

    }

    public static void main(String[] args) {
        List<Integer> idIntListObj=new ArrayList<>();
        idIntListObj.add(1001);
        idIntListObj.add(1002);
        idIntListObj.add(1003);
        System.out.println("\nThe ID of the Students are:  ");
        
        unboundedWildcardsProcessMethod(idIntListObj);

        List<String> nameStringTypeListObj=new ArrayList<>();
        nameStringTypeListObj.add("Mahdi");
        nameStringTypeListObj.add("Ahsan");
        nameStringTypeListObj.add("Najmul");
        System.out.println("\nThe Name of the Students are:  ");

        unboundedWildcardsProcessMethod(nameStringTypeListObj);

        List<Double> doubleTypeListObj=new ArrayList<>();
        doubleTypeListObj.add(3.49);
        doubleTypeListObj.add(3.54);
        doubleTypeListObj.add(3.65);
        System.out.println("\nThe cgpa of the Students are:  ");

        unboundedWildcardsProcessMethod(doubleTypeListObj);


    }
}
