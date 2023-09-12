import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardExample {

    public static void lowerBoundProcessMethod(List<?super Integer> integersSuperClassObjList){
        integersSuperClassObjList.add(50);

    }

    public static void main(String[] args) {
        List<Number> listOfNumberOrItsChild=new ArrayList<>();
        listOfNumberOrItsChild.add(111);
        listOfNumberOrItsChild.add(29);
        listOfNumberOrItsChild.add(20);
        
        lowerBoundProcessMethod(listOfNumberOrItsChild);

        for (Number item:listOfNumberOrItsChild) {
            System.out.println(item+"  ");
            }
        }
    }
