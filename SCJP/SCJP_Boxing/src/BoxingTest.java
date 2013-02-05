public class BoxingTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer ii = Integer.valueOf(-1358);
        int a = Integer.parseInt(ii.toString());
        ii = ++a;
        System.out.println(ii);
        System.out.println(Integer.toHexString(ii));
        System.out.println(Integer.toBinaryString(ii));
        for (Integer i = 100, j = 100; i < 160; i++, j++) {
            if (i % 10 == 0) {
                System.out.println("Integer " + i + " == " + j + " : "
                        + (i == j));
            }
        }
    }

}
