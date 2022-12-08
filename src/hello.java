public class hello {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int[] array = new int[18];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("------------");
        int[] array3 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        for (int a : array3) {
            if (a % 2 != 0)
                System.out.println(a + "");
        }
        System.out.println();
        int max = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > max)
                max = array3[i];
        }
        System.out.println(max);

    }
}