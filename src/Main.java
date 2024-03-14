public class Main {
    public static void main(String[] args) {
        //task1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c'};

        //task2
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[arr1.length - 1]);

        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[arr2.length - 1]);

        for (int i = 0; i < arr3.length - 1; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[arr3.length - 1]);

        //task3
        for (int i = arr1.length - 1; i > 0; i--) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[0]);

        for (int i = arr2.length - 1; i > 0; i--) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[0]);

        for (int i = arr3.length - 1; i > 0; i--) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[0]);

        //task4
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2 == 1) arr1[i] += 1;
        }
    }
}