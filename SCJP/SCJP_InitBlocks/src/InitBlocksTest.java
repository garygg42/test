public class InitBlocksTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Son();
        System.out.println("test");
    }

}

class Grandfather {
    {
        System.out.println("Grandfather init block");
    }

    static {
        System.out.println("Grandfather static init block");
    }

    public Grandfather() {
        super();
        System.out.println("Grandfather constructor");
    }
}

class Father extends Grandfather {
    {
        System.out.println("Father init block");
    }

    static {
        System.out.println("Father static init block");
    }

    public Father() {
        super();
        System.out.println("Father constructor");
    }
}

class Son extends Father {
    {
        System.out.println("Son init block");
    }

    static {
        System.out.println("Son static init block");
    }

    public Son() {
        super();
        System.out.println("Son constructor");
    }
}