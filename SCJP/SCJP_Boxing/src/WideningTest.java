public class WideningTest {

    public static void method(int a) {
        System.out.println("int");
    }

    public static void method(Integer a) {
        System.out.println("Integer");
    }

    public static void method(int... a) {
        System.out.println("int...");
    }

    static void vararg(long... x) {
        System.out.println("long...");
    }

    static void vararg(Integer x) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        Byte a = 0;
        WideningTest.method(a);

        int b = 0;
        vararg(b);

    }

}
