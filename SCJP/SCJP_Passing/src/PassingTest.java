public class PassingTest {

    static void primitives(int a) {
        a = 100;
    }

    static void references(Testing o) {
        o.setName("123");
        o = new Testing();
        o.setName("456");
    }

    static void arrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = -a[i];
        }
    }

    public static void main(String[] args) {
        int a = 0;
        PassingTest.primitives(a);
        System.out.println(a);

        Testing o = new Testing();
        System.out.println("Source object " + o.getName());
        PassingTest.references(o);
        System.out.println("Changed object " + o.getName());

        int[] z = new int[10];
        for (int i = 0; i < z.length; i++) {
            z[i] = i;
        }
        PassingTest.arrays(z);
        for (int i : z) {
            System.out.println(i);
        }

    }

}

class Testing {
    String name;

    public String getName() {
        return name;
    }

    public Testing() {
        super();
        this.name = "000";
    }

    public void setName(String n) {
        this.name = n;
    }
}