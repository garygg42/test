public class ArrayTest {

    static void test(Object o) {
        int[] temp = (int[]) o;
        for (int integer : temp) {
            System.out.println(integer);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String a = new String[] { "aaa", "bbb", "ccc" }[1];
        System.out.println(a);

        Object o1 = new Object();
        System.out.println(o1);

        System.out.println("-------------");
        Object[] o = { new Object(), o1, new Object() };
        for (Object object : o) {
            System.out.println(object);
        }

        System.out.println("-------------");
        Object[][] oo = { { new Object(), new Object() },
                { new Object(), new Object(), new Object() },
                { new Object(), new Object(), new Object(), new Object() } };
        System.out.println(oo);

        System.out.println("-------------");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            ;
        }
        test(arr);

        System.out.println("-------------");
        Integer[][][][] z = new Integer[2][2][2][2];
        for (Integer is[][][] : z) {
            for (Integer[][] is2 : is) {
                for (Integer[] is3 : is2) {
                    for (int i = 0; i < is3.length; i++) {
                        is3[i] = (int) (Math.random() * 100);
                    }
                }
            }
        }

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                for (int j2 = 0; j2 < z[i][j].length; j2++) {
                    for (int k = 0; k < z[i][j][j2].length; k++) {
                        System.out.print(z[i][j][j2][k] + "\t");
                    }
                    System.out.println("\n|||");
                }
                System.out.println("||");
            }
            System.out.println("|");
        }

        System.out.println("-------------");
        int[][] math = new int[3][];
        math[0] = new int[1];
        math[1] = new int[2];
        math[2] = new int[4];

        for (int i = 0; i < math.length; i++) {
            for (int j = 0; j < math[i].length; j++) {
                math[i][j] = i;
            }
        }

        for (int i = 0; i < math.length; i++) {
            for (int j = 0; j < math[i].length; j++) {
                System.out.print(math[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------");
        int x = 9;
        int[] dots = { 6, x, 8 };
        dots[1] = 3;
        System.out.println(dots[1] + " | " + x);

    }
}
