public class ExceptionTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try {
            MyClass.myMethod();
        } catch (MyException e) {
            e.printStackTrace();
        }

        MyClass.myMethodWithRuntime();
        System.out.println("output");

        new Throwable();
    }

}

class MyClass {
    static void myMethod() throws MyException {
        throw new MyException();
    }

    static void myMethodWithRuntime() throws RuntimeException {
        throw new RuntimeException();
    }
}

class MyException extends Exception {

    private static final long serialVersionUID = 3461899582505930473L;

}