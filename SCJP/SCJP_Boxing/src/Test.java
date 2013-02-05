public class Test {

    public static void main(String[] args) throws Throwable {
        System.out.println("aaa" + 123);
        System.out.println(999999L);
        String s = "1234567890";
        StringBuffer sb = new StringBuffer();
        System.out.println("Memory before: "
                + Runtime.getRuntime().freeMemory());
        for (int i = 0; i < 10000000; i++) {
            // s += s;
            sb.append(s);
            // System.out.println("Memory now: " +
            // Runtime.getRuntime().freeMemory());
        }
        System.out.println(sb.length());
        System.out
                .println("Memory after: " + Runtime.getRuntime().freeMemory());
        System.gc();
        System.out.println("Memory after gc: "
                + Runtime.getRuntime().freeMemory());
    }

}