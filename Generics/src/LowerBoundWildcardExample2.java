import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

class SuperClass{

}
class ChildClass extends SuperClass{

}
class GrandChildClass extends ChildClass{

}
public class LowerBoundWildcardExample2 {

    public static void lowerBoundProcessMethod(List<?super GrandChildClass> listOfGrandChildOrItsSuperList){

    }

    public static void main(String[] args) {
        List<GrandChildClass> listOfGrandChild=new ArrayList<>();
        listOfGrandChild.add(new GrandChildClass());//List object but puss its class
        lowerBoundProcessMethod(listOfGrandChild);

        List<ChildClass> listOfChild=new ArrayList<>();
        listOfChild.add(new ChildClass());//List object but puss its class ,also possible only its child.
        lowerBoundProcessMethod(listOfChild);

        List<SuperClass> listOfSuper=new ArrayList<>();
        listOfSuper.add(new GrandChildClass());//List object but puss its class
        lowerBoundProcessMethod(listOfSuper);



    }
}
