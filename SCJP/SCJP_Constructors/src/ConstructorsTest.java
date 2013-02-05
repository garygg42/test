public class ConstructorsTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Son();

    }

}

class Greatgrandfather {

    public Greatgrandfather() {
        System.out.println("Greatgrandfather");
    }

}

class Grandfather extends Greatgrandfather {

    public Grandfather() {
        System.out.println("Grandfather");
    }

}

class Father extends Grandfather {

    private static String getName() {
        return "\"fathers name\"";
    }

    public Father() {
        this(getName());
    }

    public Father(String s) {
        System.out.println("Father " + s);
    }

}

class Son extends Father {

    public Son() {
        super();
        System.out.println("Son");
    }

}