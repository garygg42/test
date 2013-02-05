import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CollectionsTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random();
        List<MyClass> myList = new ArrayList<MyClass>();

        for (int i = 0; i < 100; i++) {
            myList.add(new MyClass(rand.nextInt(100)));
        }
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        Map<MyClass, String> myMap = new LinkedHashMap<MyClass, String>();
        for (int i = 0; i < myList.size(); i++) {
            myMap.put(myList.get(i), Integer.valueOf(i).toString());
        }
        System.out.println(myMap);

        MyClass[] mc = {};
        mc = myList.toArray(mc);
        System.out.println("toArray test");
        for (MyClass myClass : mc) {
            System.out.print(myClass + " ");
        }
    }

}

class MyClass implements Comparable<MyClass> {
    private int a;

    public MyClass(int a) {
        super();
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {
        return (((MyClass) obj).getA() == this.getA());
    }

    @Override
    public String toString() {
        return "" + a;
    }

    @Override
    public int compareTo(MyClass o) {
        if (this.getA() < o.getA()) {
            return -1;
        } else if (this.getA() == o.getA()) {
            return 0;
        } else {
            return 1;
        }
    }
}